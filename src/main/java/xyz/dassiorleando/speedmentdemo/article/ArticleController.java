package xyz.dassiorleando.speedmentdemo.article;

import com.speedment.runtime.core.exception.SpeedmentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xyz.dassiorleando.speedmentdemo.article.generated.GeneratedArticleController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

/**
 * REST controller logic
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author dassiorleando
 */
@RestController
public class ArticleController extends GeneratedArticleController {
    private final Logger log = LoggerFactory.getLogger(ArticleController.class);

    @Autowired
    protected ArticleManager articleManager;

    /**
     * To create an article
     * @param articleDTO
     * @return
     */
    @PostMapping("/articles")
    public Article create(@RequestBody @Valid ArticleDTO articleDTO) {
        log.debug("Create an article with the properties {}", articleDTO);

        // build the article before saving
        Article article = new ArticleImpl()
                .setTitle(articleDTO.getTitle())
                .setContent(articleDTO.getContent())
                .setPublishedDate(new Timestamp(System.currentTimeMillis()));
        try {
            articleManager.persist(article);
        } catch (SpeedmentException se) {
            System.out.println("Failed to persist " + article + ". " + se.getMessage());
        }
        return article;
    }

    /**
     * To update an article
     * @param articleDTO
     * @return
     */
    @PutMapping("/articles")
    public Article update(@RequestBody @Valid ArticleDTO articleDTO) {
        log.debug("Update the article of id {} with the properties {}", articleDTO.getId(), articleDTO);

        // Update the article matching the incoming id
        Optional<Article> article = articleManager.stream()
                .filter(Article.ID.equal(articleDTO.getId()))
                .findFirst();

        article.ifPresent(l -> {
            l.setTitle(articleDTO.getTitle());
            l.setContent(articleDTO.getContent());
            articleManager.update(l);
        });

        return article.orElse(null);
    }

    /**
     * Get the list of all saved articles
     * @return
     */
    @GetMapping("/articlesCustom")
    public List<Article> list() {
        log.debug("We get the list of articles");
        return articleManager.stream().collect(toList());
    }

    /**
     * We find an article by id
     * @param id
     * @return
     */
    @GetMapping("/articles/{id}")
    public Article findById(@PathVariable @NotNull int id) {
        log.debug("Get an article by the id: {}", id);
        return articleManager.stream().filter(Article.ID.equal(id)).findAny().orElse(null);
    }

    /**
     * Delete an article by id
     * @param id
     */
    @DeleteMapping("/articles/{id}")
    public void deleteById(@PathVariable @NotNull int id) {
        log.debug("Delete the article of id: {}", id);

        // First, we look for the corresponding article
        Optional<Article> article = articleManager.stream()
                .filter(Article.ID.equal(id))
                .findFirst();

        // Perform the deletion
        article.ifPresent(l -> articleManager.remove(l));
    }

}
package xyz.dassiorleando.speedmentdemo.article.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.field.Field;
import xyz.dassiorleando.speedmentdemo.article.Article;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.unmodifiableList;

/**
 * The generated base interface for the manager of every {@link
 * xyz.dassiorleando.speedmentdemo.article.Article} entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public interface GeneratedArticleManager extends Manager<Article> {
    
    TableIdentifier<Article> IDENTIFIER = TableIdentifier.of("speedmentdemo", "speedmentdemo", "xyz/dassiorleando/speedmentdemo/article");
    List<Field<Article>> FIELDS = unmodifiableList(asList(
        Article.ID,
        Article.TITLE,
        Article.CONTENT,
        Article.PUBLISHED_DATE
    ));
    
    @Override
    default Class<Article> getEntityClass() {
        return Article.class;
    }
}
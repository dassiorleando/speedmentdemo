package xyz.dassiorleando.speedmentdemo.article.generated;

import com.speedment.common.annotation.GeneratedCode;
import xyz.dassiorleando.speedmentdemo.article.Article;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * xyz.dassiorleando.speedmentdemo.article.Article}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedArticleImpl implements Article {
    
    private int id;
    private String title;
    private String content;
    private LocalDateTime publishedDate;
    
    protected GeneratedArticleImpl() {}
    
    @Override
    public int getId() {
        return id;
    }
    
    @Override
    public String getTitle() {
        return title;
    }
    
    @Override
    public String getContent() {
        return content;
    }
    
    @Override
    public LocalDateTime getPublishedDate() {
        return publishedDate;
    }
    
    @Override
    public Article setId(int id) {
        this.id = id;
        return this;
    }
    
    @Override
    public Article setTitle(String title) {
        this.title = title;
        return this;
    }
    
    @Override
    public Article setContent(String content) {
        this.content = content;
        return this;
    }
    
    @Override
    public Article setPublishedDate(LocalDateTime publishedDate) {
        this.publishedDate = publishedDate;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "            + Objects.toString(getId()));
        sj.add("title = "         + Objects.toString(getTitle()));
        sj.add("content = "       + Objects.toString(getContent()));
        sj.add("publishedDate = " + Objects.toString(getPublishedDate()));
        return "ArticleImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Article)) { return false; }
        final Article thatArticle = (Article)that;
        if (this.getId() != thatArticle.getId()) { return false; }
        if (!Objects.equals(this.getTitle(), thatArticle.getTitle())) { return false; }
        if (!Objects.equals(this.getContent(), thatArticle.getContent())) { return false; }
        if (!Objects.equals(this.getPublishedDate(), thatArticle.getPublishedDate())) { return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getTitle());
        hash = 31 * hash + Objects.hashCode(getContent());
        hash = 31 * hash + Objects.hashCode(getPublishedDate());
        return hash;
    }
}
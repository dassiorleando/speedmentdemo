package xyz.dassiorleando.speedmentdemo.article;

import javax.validation.constraints.NotNull;

/**
 * The Article DTO
 * @author dassiorleando
 */
public class ArticleDTO {
    private int id = -1;
    @NotNull
    private String title;
    private String content;

    public ArticleDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleDTO{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

package xyz.dassiorleando.speedmentdemo.article.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.common.injector.annotation.ExecuteBefore;
import com.speedment.runtime.config.Project;
import com.speedment.runtime.config.identifier.TableIdentifier;
import com.speedment.runtime.core.component.ProjectComponent;
import com.speedment.runtime.core.component.SqlAdapter;
import com.speedment.runtime.core.component.sql.SqlTypeMapperHelper;
import com.speedment.runtime.core.db.SqlFunction;
import xyz.dassiorleando.speedmentdemo.article.Article;
import xyz.dassiorleando.speedmentdemo.article.ArticleImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import static com.speedment.common.injector.State.RESOLVED;

/**
 * The generated Sql Adapter for a {@link xyz.dassiorleando.speedmentdemo.article.Article}
 * entity.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedArticleSqlAdapter implements SqlAdapter<Article> {
    
    private final TableIdentifier<Article> tableIdentifier;
    private SqlTypeMapperHelper<Timestamp, LocalDateTime> publishedDateHelper;
    
    protected GeneratedArticleSqlAdapter() {
        this.tableIdentifier = TableIdentifier.of("speedmentdemo", "speedmentdemo", "xyz/dassiorleando/speedmentdemo/article");
    }
    
    protected Article apply(ResultSet resultSet, int offset) throws SQLException {
        return createEntity()
            .setId(            resultSet.getInt(1 + offset))
            .setTitle(         resultSet.getString(2 + offset))
            .setContent(       resultSet.getString(3 + offset))
            .setPublishedDate( publishedDateHelper.apply(resultSet.getTimestamp(4 + offset)))
            ;
    }
    
    protected ArticleImpl createEntity() {
        return new ArticleImpl();
    }
    
    @Override
    public TableIdentifier<Article> identifier() {
        return tableIdentifier;
    }
    
    @Override
    public SqlFunction<ResultSet, Article> entityMapper() {
        return entityMapper(0);
    }
    
    @Override
    public SqlFunction<ResultSet, Article> entityMapper(int offset) {
        return rs -> apply(rs, offset);
    }
    
    @ExecuteBefore(RESOLVED)
    void createHelpers(ProjectComponent projectComponent) {
        final Project project = projectComponent.getProject();
        publishedDateHelper = SqlTypeMapperHelper.create(project, Article.PUBLISHED_DATE, Article.class);
    }
}
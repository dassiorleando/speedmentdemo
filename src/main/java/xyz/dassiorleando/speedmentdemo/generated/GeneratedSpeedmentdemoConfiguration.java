package xyz.dassiorleando.speedmentdemo.generated;

import xyz.dassiorleando.speedmentdemo.SpeedmentdemoApplication;
import xyz.dassiorleando.speedmentdemo.SpeedmentdemoApplicationBuilder;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.enterprise.datastore.runtime.DataStoreBundle;
import com.speedment.enterprise.datastore.runtime.DataStoreComponent;
import com.speedment.enterprise.plugins.json.JsonBundle;
import com.speedment.enterprise.plugins.json.JsonComponent;
import com.speedment.runtime.core.ApplicationBuilder;
import com.speedment.runtime.core.component.ProjectComponent;
import com.speedment.runtime.join.JoinComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import xyz.dassiorleando.speedmentdemo.article.ArticleManager;

/**
 * The spring configuration file
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public class GeneratedSpeedmentdemoConfiguration {
    
    protected final static String URL_PROPERTY = "spring.speedment.url";
    protected final static String HOST_PROPERTY = "spring.speedment.host";
    protected final static String PORT_PROPERTY = "spring.speedment.port";
    protected final static String USERNAME_PROPERTY = "spring.speedment.username";
    protected final static String PASSWORD_PROPERTY = "spring.speedment.password";
    protected final static String LOGGING_PROPERTY = "spring.speedment.logging";
    protected @Autowired Environment env;
    
    @Bean
    public SpeedmentdemoApplication getApplication() {
        return getApplicationBuilder().build();
    }
    
    public SpeedmentdemoApplicationBuilder getApplicationBuilder() {
        final SpeedmentdemoApplicationBuilder builder =
            new SpeedmentdemoApplicationBuilder()
                .withBundle(DataStoreBundle.class)
                .withBundle(JsonBundle.class);
        
        if (env.containsProperty(URL_PROPERTY)) {
            builder.withConnectionUrl(env.getProperty(URL_PROPERTY));
        }
        
        if (env.containsProperty(HOST_PROPERTY)) {
            builder.withIpAddress(env.getProperty(HOST_PROPERTY));
        }
        
        if (env.containsProperty(PORT_PROPERTY)) {
            builder.withPort(Integer.parseInt(env.getProperty(PORT_PROPERTY)));
        }
        
        if (env.containsProperty(USERNAME_PROPERTY)) {
            builder.withUsername(env.getProperty(USERNAME_PROPERTY));
        }
        
        if (env.containsProperty(PASSWORD_PROPERTY)) {
            builder.withPassword(env.getProperty(PASSWORD_PROPERTY));
        }
        
        if (env.containsProperty(LOGGING_PROPERTY)
        &&  Boolean.valueOf(env.getProperty(LOGGING_PROPERTY))) {
            builder
                .withLogging(ApplicationBuilder.LogType.STREAM)
                .withLogging(ApplicationBuilder.LogType.APPLICATION_BUILDER)
                .withLogging(ApplicationBuilder.LogType.CONNECTION)
                .withLogging(ApplicationBuilder.LogType.STREAM_OPTIMIZER);
        }
        
        return builder;
    }
    
    @Bean
    public ProjectComponent getProjectComponent(SpeedmentdemoApplication app) {
        return app.getOrThrow(ProjectComponent.class);
    }
    
    @Bean
    public JsonComponent getJsonComponent(SpeedmentdemoApplication app) {
        return app.getOrThrow(JsonComponent.class);
    }
    
    @Bean
    public DataStoreComponent getDataStoreComponent(SpeedmentdemoApplication app) {
        return app.getOrThrow(DataStoreComponent.class);
    }
    
    @Bean
    public JoinComponent getJoinComponent(SpeedmentdemoApplication app) {
        return app.getOrThrow(JoinComponent.class);
    }
    
    @Bean
    public ArticleManager getArticleManager(SpeedmentdemoApplication app) {
        return app.getOrThrow(ArticleManager.class);
    }
}
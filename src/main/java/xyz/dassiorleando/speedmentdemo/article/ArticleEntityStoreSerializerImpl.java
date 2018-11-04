package xyz.dassiorleando.speedmentdemo.article;

import xyz.dassiorleando.speedmentdemo.article.generated.GeneratedArticleEntityStoreSerializerImpl;

import java.nio.ByteBuffer;
import java.util.function.LongFunction;
import java.util.function.LongToIntFunction;

/**
 * An {@link
 * com.speedment.enterprise.datastore.runtime.entitystore.EntityStoreSerializer}
 * class for table {@link com.speedment.runtime.config.Table} named article.
 * <p>
 * This file is safe to edit. It will not be overwritten by the code generator.
 * 
 * @author company
 */
public final class ArticleEntityStoreSerializerImpl extends GeneratedArticleEntityStoreSerializerImpl {
    
    public ArticleEntityStoreSerializerImpl(LongFunction<ByteBuffer> bufferFinder, LongToIntFunction offsetFinder) {
        super(bufferFinder, offsetFinder);
    }
}
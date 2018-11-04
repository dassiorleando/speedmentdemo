package com.company.speedmentdemo.generated;

import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.application.AbstractApplicationMetadata;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * A {@link com.speedment.runtime.core.ApplicationMetadata} class for the {@link
 * com.speedment.runtime.config.Project} named speedmentdemo. This class
 * contains the meta data present at code generation time.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public class GeneratedSpeedmentdemoMetadata extends AbstractApplicationMetadata {
    
    private final static String METADATA = init();
    
    private static String init() {
        final StringBuilder sb = new StringBuilder();
        initPart0(sb);
        initPart1(sb);
        return sb.toString();
    }
    
    @Override
    protected Optional<String> getMetadata() {
        return Optional.of(METADATA);
    }
    
    private static void initPart0(StringBuilder sb) {
        Stream.of(
            "{",
            "  \"config\" : {",
            "    \"appId\" : \"f0f34c3c-4895-4d57-908a-2938788e9637\",",
            "    \"companyName\" : \"company\",",
            "    \"dbmses\" : [",
            "      {",
            "        \"enabled\" : true,",
            "        \"expanded\" : true,",
            "        \"id\" : \"speedmentdemo\",",
            "        \"ipAddress\" : \"127.0.0.1\",",
            "        \"name\" : \"speedmentdemo\",",
            "        \"port\" : 3306,",
            "        \"schemas\" : [",
            "          {",
            "            \"enabled\" : true,",
            "            \"expanded\" : true,",
            "            \"id\" : \"speedmentdemo\",",
            "            \"name\" : \"speedmentdemo\",",
            "            \"nameProtected\" : true,",
            "            \"restEnabled\" : true,",
            "            \"restPath\" : \"\",",
            "            \"tables\" : [",
            "              {",
            "                \"columns\" : [",
            "                  {",
            "                    \"autoIncrement\" : true,",
            "                    \"biDirectional\" : false,",
            "                    \"databaseType\" : \"java.lang.Integer\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"hashIndex\" : false,",
            "                    \"id\" : \"id\",",
            "                    \"lowCardinality\" : false,",
            "                    \"name\" : \"id\",",
            "                    \"nameProtected\" : true,",
            "                    \"nullable\" : false,",
            "                    \"nullableImplementation\" : \"OPTIONAL\",",
            "                    \"ordinalPosition\" : 1,",
            "                    \"typeMapper\" : \"com.speedment.runtime.typemapper.primitive.PrimitiveTypeMapper\",",
            "                    \"unindexed\" : false",
            "                  },",
            "                  {",
            "                    \"autoIncrement\" : false,",
            "                    \"biDirectional\" : false,",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"hashIndex\" : false,",
            "                    \"id\" : \"title\",",
            "                    \"lowCardinality\" : false,",
            "                    \"name\" : \"title\",",
            "                    \"nameProtected\" : true,",
            "                    \"nullable\" : false,",
            "                    \"nullableImplementation\" : \"OPTIONAL\",",
            "                    \"ordinalPosition\" : 2,",
            "                    \"unindexed\" : false",
            "                  },",
            "                  {",
            "                    \"autoIncrement\" : false,",
            "                    \"biDirectional\" : false,",
            "                    \"databaseType\" : \"java.lang.String\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"hashIndex\" : false,",
            "                    \"id\" : \"content\",",
            "                    \"lowCardinality\" : false,",
            "                    \"name\" : \"content\",",
            "                    \"nameProtected\" : true,",
            "                    \"nullable\" : false,",
            "                    \"nullableImplementation\" : \"OPTIONAL\",",
            "                    \"ordinalPosition\" : 3,",
            "                    \"restVisible\" : true,",
            "                    \"unindexed\" : false",
            "                  },",
            "                  {",
            "                    \"alias\" : \"publishedDate\",",
            "                    \"autoIncrement\" : false,",
            "                    \"biDirectional\" : false,",
            "                    \"databaseType\" : \"java.sql.Timestamp\",",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"hashIndex\" : false,",
            "                    \"id\" : \"published_date\",",
            "                    \"lowCardinality\" : false,",
            "                    \"name\" : \"published_date\",",
            "                    \"nameProtected\" : true,",
            "                    \"nullable\" : false,",
            "                    \"nullableImplementation\" : \"OPTIONAL\",",
            "                    \"ordinalPosition\" : 4,",
            "                    \"restVisible\" : true,",
            "                    \"unindexed\" : false",
            "                  }",
            "                ],",
            "                \"enabled\" : true,",
            "                \"expanded\" : true,",
            "                \"id\" : \"article\",",
            "                \"indexes\" : [",
            "                  {",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : false,",
            "                    \"id\" : \"PRIMARY\","
        ).forEachOrdered(sb::append);
    }
    
    private static void initPart1(StringBuilder sb) {
        Stream.of(
            "                    \"indexColumns\" : [",
            "                      {",
            "                        \"expanded\" : true,",
            "                        \"id\" : \"id\",",
            "                        \"name\" : \"id\",",
            "                        \"orderType\" : \"ASC\",",
            "                        \"ordinalPosition\" : 1",
            "                      }",
            "                    ],",
            "                    \"name\" : \"PRIMARY\",",
            "                    \"nameProtected\" : true,",
            "                    \"unique\" : true",
            "                  }",
            "                ],",
            "                \"isView\" : false,",
            "                \"name\" : \"article\",",
            "                \"nameProtected\" : true,",
            "                \"packageName\" : \"xyz.dassiorleando.speedmentdemo.article\",",
            "                \"primaryKeyColumns\" : [",
            "                  {",
            "                    \"enabled\" : true,",
            "                    \"expanded\" : true,",
            "                    \"id\" : \"id\",",
            "                    \"name\" : \"id\",",
            "                    \"nameProtected\" : false,",
            "                    \"ordinalPosition\" : 1",
            "                  }",
            "                ],",
            "                \"restCors\" : \"*\",",
            "                \"restEnableFilters\" : true,",
            "                \"restEnableSkipLimit\" : true,",
            "                \"restEnableSorters\" : true,",
            "                \"restEnableTotal\" : false,",
            "                \"restEnabled\" : true,",
            "                \"restPath\" : \"/articles\"",
            "              }",
            "            ]",
            "          }",
            "        ],",
            "        \"typeName\" : \"MySQL\",",
            "        \"username\" : \"root\"",
            "      }",
            "    ],",
            "    \"enabled\" : true,",
            "    \"expanded\" : true,",
            "    \"id\" : \"speedmentdemo\",",
            "    \"jsonp\" : false,",
            "    \"jsonpCallbackName\" : \"callback\",",
            "    \"name\" : \"speedmentdemo\",",
            "    \"nameProtected\" : false,",
            "    \"packageLocation\" : \"src/main/java/\",",
            "    \"speedmentVersion\" : \"Speedment:3.1.7\"",
            "  }",
            "}"
        ).forEachOrdered(sb::append);
    }
}
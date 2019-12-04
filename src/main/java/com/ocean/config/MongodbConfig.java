package com.ocean.config;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoClientURI;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
@EnableConfigurationProperties
public class MongodbConfig {

    @Value("${mongodb_uri}")
    private String uri;
    @Value("${mongodb_database}")
    private String database;

    @Bean
    public MongoClient mongoClient(){
        return new MongoClient(new MongoClientURI(uri, builder(null)));
    }
    @Bean
    public MongoTemplate mongoTemplate(){
        MongoDbFactory factory = new SimpleMongoDbFactory(mongoClient(),database);
        return new MongoTemplate(factory);
    }
    private MongoClientOptions.Builder builder(MongoClientOptions options) {
        if (options != null) {
            return MongoClientOptions.builder(options);
        }
        return MongoClientOptions.builder();
    }
}

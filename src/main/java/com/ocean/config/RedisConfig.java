package com.ocean.config;

import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
import org.codehaus.plexus.util.StringUtils;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

@Configuration
//开启注解
@EnableCaching
public class RedisConfig extends CachingConfigurerSupport {

    /*protected static final Logger logger = LoggerFactory.getLogger(RedisConfig.class);

    @Value("${redis.host}")
    private String host;

    @Value("${redis.port}")
    private int port;

    @Value("${redis.password}")
    private String password;

    @Value("${redis.db}")
    private int dbIndex;

    @Value("${redis.maxIdle}")
    private int maxIdle;

    @Value("${redis.minIdle}")
    private int minIdle;

    @Value("${redis.maxTotal}")
    private int maxTotal;

    @Value("${redis.maxWaitMillis}")
    private long maxWaitMillis;

    @Value("${redis.timeout}")
    private int timeout;


    @Bean
    public JedisConnectionFactory redisConnectionFactory() {
        RedisStandaloneConfiguration redisStandaloneConfiguration = new RedisStandaloneConfiguration();
        redisStandaloneConfiguration.setHostName(host);
        redisStandaloneConfiguration.setPort(port);
        redisStandaloneConfiguration.setPassword(RedisPassword.of(password));
        redisStandaloneConfiguration.setDatabase(dbIndex);
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //最大连接数
        jedisPoolConfig.setMaxTotal(maxTotal);
        //最小空闲连接数
        jedisPoolConfig.setMinIdle(minIdle);
        jedisPoolConfig.setMaxIdle(maxIdle);
        //当池内没有可用连接时，最大等待时间
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);

        JedisClientConfiguration.JedisClientConfigurationBuilder jedisClientConfiguration = JedisClientConfiguration.builder();
        //设置超时时间//  connection timeout
        jedisClientConfiguration.connectTimeout(Duration.ofMillis(timeout));

        //设置链接池信息
        jedisClientConfiguration.usePooling().poolConfig(jedisPoolConfig);
        return new JedisConnectionFactory(redisStandaloneConfiguration,
                jedisClientConfiguration.build());
    }

    @Bean(name = "redisTemplate")
    @ConditionalOnMissingBean(name = "redisTemplate")
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<Object, Object> redisTemplate = new RedisTemplate<>();

        //使用fastjson序列化
        FastJsonRedisSerializer fastJsonRedisSerializer = new FastJsonRedisSerializer(Object.class);
        // value值的序列化采用fastJsonRedisSerializer
        redisTemplate.setValueSerializer(fastJsonRedisSerializer);
        redisTemplate.setHashValueSerializer(fastJsonRedisSerializer);
        // key的序列化采用StringRedisSerializer
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }

    @Bean(name = "redisTemplateWithStringKey")
    public RedisTemplate<String, Object> redisTemplateWithStringKey(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();

        //使用fastjson序列化
        FastJsonRedisSerializer fastJsonRedisSerializer = new FastJsonRedisSerializer(Object.class);
        // value值的序列化采用fastJsonRedisSerializer
        redisTemplate.setValueSerializer(fastJsonRedisSerializer);
        redisTemplate.setHashValueSerializer(fastJsonRedisSerializer);
        // key的序列化采用StringRedisSerializer
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setConnectionFactory(redisConnectionFactory);
        return redisTemplate;
    }


    *//**
     * 缓存管理器
     *//*
    @Bean
    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
        RedisCacheManager.RedisCacheManagerBuilder builder = RedisCacheManager
                .RedisCacheManagerBuilder
                .fromConnectionFactory(redisConnectionFactory);
        return builder.build();
    }

    @Bean
    public RedissonClient redissonClient() {
        Config config = new Config();
        String url = "redis://" + host + ":" + port;
        config.useSingleServer().setAddress(url);
        config.useSingleServer().setDatabase(dbIndex);
        if (StringUtils.isNotBlank(password)) {
            config.useSingleServer().setPassword(password);
        }
        config.useSingleServer().setConnectionPoolSize(200);
        return Redisson.create(config);
    }*/
}

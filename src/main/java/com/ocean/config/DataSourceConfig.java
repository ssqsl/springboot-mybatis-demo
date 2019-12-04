package com.ocean.config;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * Created by zhangjunqi on 2018/12/5 下午2:38
 **/
@Configuration
@MapperScan("com.ocean")
public class DataSourceConfig {

    @Value("${mysql.jdbc-url}")
    private String jdbcUrl;
    @Value("${mysql.driver-class-name}")
    private String driverClassName;

    @Value("${mybatis.mapper-locations}")
    private String mapperLocations;
    @Value("${mysql.username}")
    private String username;
    @Value("${mysql.password}")
    private String password;


    @Bean
    @Primary
    public SqlSessionFactory mysqlSessionFactory(DataSource mysqlDataSource) throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(mysqlDataSource);
        PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        sqlSessionFactoryBean.setMapperLocations(resolver.getResources(mapperLocations));
          return sqlSessionFactoryBean.getObject();
    }

    @Bean
    //默认数据源
    @Primary
    //将properties中以mysql为前缀的参数值，写入方法返回的对象中
    @ConfigurationProperties(prefix = "mysql")
    public DataSource mysqDataSource() {
        //通过DataSourceBuilder构建数据源
        HikariDataSource hikariDataSource = DataSourceBuilder.create().type(HikariDataSource.class).build();
        hikariDataSource.setJdbcUrl(jdbcUrl);
        hikariDataSource.setDriverClassName(driverClassName);
        hikariDataSource.setUsername(username);
        hikariDataSource.setPassword(password);
        hikariDataSource.setMinimumIdle(10);
        hikariDataSource.setIdleTimeout(600000);
        hikariDataSource.setMaxLifetime(1800000);
        hikariDataSource.setConnectionTimeout(30000);
        hikariDataSource.setMaximumPoolSize(20);
        return hikariDataSource;
    }


}

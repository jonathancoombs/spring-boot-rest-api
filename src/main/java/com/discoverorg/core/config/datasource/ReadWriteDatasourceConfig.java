package com.discoverorg.core.config.datasource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;


@Configuration
@MapperScan(
        basePackages = "com.discoverorg.core.repository.readwrite"
)
public class ReadWriteDatasourceConfig {
    public static final String PROPERTIES_PREFIX = "spring.datasource.readwrite";
    public static final String SQL_SESSION_FACTORY_NAME = "readWriteSessionFactory";
    private static final Logger logger = LoggerFactory.getLogger(ReadWriteDatasourceConfig.class);

    @Bean(name = "readWriteDatasource")
    @Primary
    @ConfigurationProperties(prefix = PROPERTIES_PREFIX)
    public DataSource readWriteDatasource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = ReadWriteDatasourceConfig.SQL_SESSION_FACTORY_NAME)
    @Primary
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(readWriteDatasource());
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);

        return sqlSessionFactory;
    }



}

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

import javax.sql.DataSource;


@Configuration
@MapperScan(
        basePackages = "com.discoverorg.core.repository.readonly"
)
public class ReadOnlyDatasourceConfig {
    public static final String SQL_SESSION_FACTORY_NAME = "readOnlySessionFactory";
    private static final Logger logger = LoggerFactory.getLogger(ReadOnlyDatasourceConfig.class);

    @Bean(name = "readOnlyDatasource")
    @ConfigurationProperties(prefix = "spring.datasource.readonly")
    public DataSource readOnlyDatasource() {
        return DataSourceBuilder
                .create()
                .build();
    }

    @Bean(name = ReadOnlyDatasourceConfig.SQL_SESSION_FACTORY_NAME)
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(readOnlyDatasource());
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBean.getObject();
        sqlSessionFactory.getConfiguration().setMapUnderscoreToCamelCase(true);

        return sqlSessionFactory;
    }

}

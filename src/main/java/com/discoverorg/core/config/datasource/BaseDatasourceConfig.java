//package com.discoverorg.starters.config;
//
//import com.zaxxer.hikari.HikariConfig;
//import com.zaxxer.hikari.HikariDataSource;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.bind.RelaxedPropertyResolver;
//import org.springframework.context.ApplicationContextException;
//import org.springframework.core.env.Environment;
//
//import javax.sql.DataSource;
//import java.util.Arrays;
//import java.util.Properties;
//
//public class BaseDatasourceConfig {
//
//    private RelaxedPropertyResolver propertyResolver;
//    private Environment environment;
//    private static final Logger logger = LoggerFactory.getLogger(BaseDatasourceConfig.class);
//
//    public BaseDatasourceConfig(Environment environment) {
//        this.environment = environment;
//    }
//
//    public DataSource buildDataSource(String identifier) {
//        logger.debug("Configuring " + identifier + " Datasource");
//        this.propertyResolver = new RelaxedPropertyResolver(environment, identifier + ".");
//        if (propertyResolver.getProperty("url") == null && propertyResolver.getProperty("databaseName") == null) {
//            logger.error("Your database connection pool configuration for " + identifier + " is incorrect! The application " +
//                            "cannot start. Please check your Spring profile, current profiles are: {}",
//                    Arrays.toString(environment.getActiveProfiles()));
//
//            throw new ApplicationContextException("Database connection pool is not configured correctly");
//        }
//        HikariConfig config = new HikariConfig();
//
//        config.addDataSourceProperty("user", propertyResolver.getProperty("username"));
//        config.addDataSourceProperty("password", propertyResolver.getProperty("password"));
//        config.setDataSourceClassName(propertyResolver.getProperty("dataSourceClassName"));
//
//        if (propertyResolver.getProperty("url") == null || "".equals(propertyResolver.getProperty("url"))) {
//            config.addDataSourceProperty("databaseName", propertyResolver.getProperty("databaseName"));
//            config.addDataSourceProperty("serverName", propertyResolver.getProperty("serverName"));
//        } else {
//            config.addDataSourceProperty("url", propertyResolver.getProperty("url"));
//        }
//
//        //MySQL optimizations, see https://github.com/brettwooldridge/HikariCP/wiki/MySQL-Configuration
////        if ("com.mysql.jdbc.jdbc2.optional.MysqlDataSource".equals(propertyResolver.getProperty("dataSourceClassName"))) {
//        if (propertyResolver.getProperty("dataSourceClassName").contains("com.mysql.jdbc")) {
//            config.addDataSourceProperty("cachePrepStmts", propertyResolver.getProperty("cachePrepStmts", "true"));
//            config.addDataSourceProperty("prepStmtCacheSize", propertyResolver.getProperty("prepStmtCacheSize", "250"));
//            config.addDataSourceProperty("prepStmtCacheSqlLimit", propertyResolver.getProperty("prepStmtCacheSqlLimit", "2048"));
//            config.addDataSourceProperty("useServerPrepStmts", propertyResolver.getProperty("useServerPrepStmts", "true"));
//        }
////        if (metricRegistry != null) {
////            config.setMetricRegistry(metricRegistry);
////        }
//
//        Long connectionTimeout = propertyResolver.getProperty("connectionTimeout", Long.class);
//        if (connectionTimeout != null) config.setConnectionTimeout(connectionTimeout);
//
//        Long idleTimeout = propertyResolver.getProperty("idleTimeout", Long.class);
//        if (idleTimeout != null) config.setIdleTimeout(idleTimeout);
//
//        Long maxLifetime = propertyResolver.getProperty("maxLifetime", Long.class);
//        if (maxLifetime != null) config.setMaxLifetime(maxLifetime);
//
////        String connectionTestQuery = propertyResolver.getProperty("connectionTestQuery", String.class, "SELECT 1");
////        config.setConnectionTestQuery(connectionTestQuery);
//
//        Integer minimumIdle = propertyResolver.getProperty("minimumIdle", Integer.class);
//        if (minimumIdle != null) config.setMinimumIdle(minimumIdle);
//
//        Integer maximumPoolSize = propertyResolver.getProperty("maximumPoolSize", Integer.class);
//        if (maximumPoolSize != null) config.setMaximumPoolSize(maximumPoolSize);
////        config.addDataSourceProperty("connectionTimeout", 30000);
////        config.addDataSourceProperty("connectionTestQuery","SELECT 1");
////        config.addDataSourceProperty("maxLifetime", 3600000L);
////        config.addDataSourceProperty("idleTimeout", 3600000L);
//
////        config.setConnectionTestQuery("SELECT 1");
////        config.setMaxLifetime(0);
////        config.setIdleTimeout(0);
//
//        long check = config.getMaxLifetime();
//
//        DataSource dataSource = null;
//        try {
//            dataSource = new HikariDataSource(config);
//        } catch (Exception e) {
//            Properties properties = config.getDataSourceProperties();
//            String msg = "Error in setting up datasource for " + identifier + "  '" + properties.get("url") + "'. Cannot continue without this resolved!!!";
//            logger.error(msg, e);
//            System.exit(1);
//        }
////        DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
////        transactionManager.setDataSource(dataSource);
//
//        return dataSource;
//    }
//}

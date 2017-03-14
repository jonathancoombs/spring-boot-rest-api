package com.discoverorg.starters;

import com.discoverorg.core.config.datasource.ReadOnlyDatasourceConfig;
import com.discoverorg.core.config.datasource.ReadWriteDatasourceConfig;
import com.discoverorg.core.config.repositories.UserRepositoryConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
@Import({
		ReadOnlyDatasourceConfig.class,
		ReadWriteDatasourceConfig.class,
        UserRepositoryConfig.class
})
public class RestApiApplication {

	public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
	}
}

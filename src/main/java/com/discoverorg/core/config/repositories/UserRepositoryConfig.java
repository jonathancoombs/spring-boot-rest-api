package com.discoverorg.core.config.repositories;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {
                "com.discoverorg.core.repository",
                "com.discoverorg.core.entity"
        }
)
public class UserRepositoryConfig {
}

package com.ceiba.users.infraesctructure.configuration;

import com.ceiba.users.infraesctructure.adapters.repository.entity.RoleEntity;
import com.ceiba.users.infraesctructure.adapters.repository.entity.UserEntity;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(UserEntity.class, RoleEntity.class);
    }
}

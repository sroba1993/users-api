package com.ceiba.users.infraesctructure.adapters.repository.dao;

import com.ceiba.users.infraesctructure.adapters.repository.entity.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

@RepositoryRestResource(path = "users")
public interface UserDao extends PagingAndSortingRepository<UserEntity, Long> {

    @RestResource(path = "find-username")
    public UserEntity findByUsername(@Param("name") String username);

}

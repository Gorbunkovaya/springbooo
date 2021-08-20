package com.gorbunkova.springboot.dao;

import com.gorbunkova.springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface UserRepository extends JpaRepository <User, Long> {
    @Query("select user from User user where user.login = :login")
    User getUserByName(@Param("login") String login);
}

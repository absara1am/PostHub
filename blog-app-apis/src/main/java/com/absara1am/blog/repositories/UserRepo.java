package com.absara1am.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absara1am.blog.entities.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}

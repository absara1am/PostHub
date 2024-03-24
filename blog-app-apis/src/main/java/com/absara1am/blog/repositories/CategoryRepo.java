package com.absara1am.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absara1am.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}

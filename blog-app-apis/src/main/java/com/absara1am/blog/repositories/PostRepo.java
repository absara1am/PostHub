package com.absara1am.blog.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.absara1am.blog.entities.Category;
import com.absara1am.blog.entities.Post;
import com.absara1am.blog.entities.User;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);

	List<Post> findByCategory(Category category);

}

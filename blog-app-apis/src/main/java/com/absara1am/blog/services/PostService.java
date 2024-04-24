package com.absara1am.blog.services;

import java.util.List;

import com.absara1am.blog.entities.Post;
import com.absara1am.blog.payloads.PostDto;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete
	void deletePost(Integer postId);

	// get all posts
	List<PostDto> getAllPosts();

	// get single post
	PostDto getPostById(Integer postId);

	// get all post by category
	List<PostDto> getPostsByCategory(Integer categoryId);

	// get all post by user
	List<PostDto> getPostsByUser(Integer userId);

	// search posts
	List<PostDto> searchPosts(String keyword);
}

package com.absara1am.blog.services;

import java.util.List;

import com.absara1am.blog.payloads.CategoryDto;

public interface CategoryService {

	// create
	CategoryDto createCategory(CategoryDto categoryDto);

	// update
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// get
	CategoryDto getCategoryById(Integer categoryId);

	// get All
	List<CategoryDto> getCategories();

	// delete
	void deleteCategory(Integer categoryId);

}

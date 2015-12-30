package com.blog.forum.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blog.forum.model.CategoryModel;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryModel, Long> {
	
	List<CategoryModel> findAll();
}

package com.blog.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.forum.model.CategoryModel;
import com.blog.forum.repository.CategoryRepository;

@CrossOrigin(origins="*")
@RestController
public class Category {

	@Autowired
	private CategoryRepository repository;
	
	@RequestMapping(value="/category",method=RequestMethod.GET)
	public List<CategoryModel> getCategory(){
		List<CategoryModel> ListCategory = repository.findAll();
		return ListCategory;
	}
	
	@RequestMapping(value="/category",method=RequestMethod.POST)
	public CategoryModel createCategory(@RequestBody CategoryModel category){
		CategoryModel cat=repository.save(category);
		return cat;
	}
	
	@RequestMapping(value="/category",method=RequestMethod.PUT)
	public CategoryModel updateCategory(@RequestBody CategoryModel category){
		CategoryModel cat=repository.save(category);
		return cat;
	}
	
	@RequestMapping(value="/category/{id}",method=RequestMethod.GET)
	public CategoryModel updateCategory(@PathVariable("id") Long id){
		CategoryModel cat=repository.findOne(id);
		return cat;
	}
	
	@RequestMapping(value="/mylist",method=RequestMethod.GET)
	public String mylist() {
		return "Hello mom";
	}
}

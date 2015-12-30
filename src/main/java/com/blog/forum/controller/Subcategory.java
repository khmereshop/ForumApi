package com.blog.forum.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.forum.model.SubcategoryModel;
import com.blog.forum.repository.SubcategoryRepository;

@RestController
@ContextConfiguration(locations="classpath:ApplicationContext.xml")
public class Subcategory {
	
	@Autowired
	private SubcategoryRepository repository;
	
	@RequestMapping(value="/subcategory",method=RequestMethod.GET)
	public List<SubcategoryModel> getSubcat(){
		
		List<SubcategoryModel> subcat = new ArrayList<SubcategoryModel>();
		subcat=repository.findAll();
		return subcat;
	}
	
	@RequestMapping(value="/subcategory",method=RequestMethod.POST)
	public SubcategoryModel createSubcat(@RequestBody SubcategoryModel subcat) {
		SubcategoryModel result=repository.save(subcat);
		return result;
	}
	
	@RequestMapping(value="/subcategory",method=RequestMethod.PUT)
	public SubcategoryModel updateSubcat(@RequestBody SubcategoryModel subcat) {
		SubcategoryModel result=repository.save(subcat);
		return result;
	}
	
	@RequestMapping(value="/subcategory/{id}",method=RequestMethod.GET)
	public SubcategoryModel getSubcategory(@PathVariable("id") Long id) {
		SubcategoryModel result=repository.findOne(id);
		return result;
	}
	
}

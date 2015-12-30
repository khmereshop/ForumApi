package com.blog.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaEntityInformation;

import com.blog.forum.model.SubcategoryModel;

public interface SubcategoryRepository extends JpaRepository<SubcategoryModel, Long> {

}

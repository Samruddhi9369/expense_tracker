package com.example.springboot.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springboot.expense.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	Category findByName(String name);
}

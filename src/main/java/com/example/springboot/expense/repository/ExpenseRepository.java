package com.example.springboot.expense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboot.expense.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}
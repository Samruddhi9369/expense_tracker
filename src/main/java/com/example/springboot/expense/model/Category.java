package com.example.springboot.expense.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name="category")
public class Category {
	@Id
	private Long id;
	
	// Travel, Grocery, etc..
	private String name;
	
}

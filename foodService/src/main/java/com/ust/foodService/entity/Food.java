package com.ust.foodService.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class Food {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String name;
	private String category;
	private Double price;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Food() {}
	
	public Food(Long id, String name, String category, Double price)
	{
		super();
		this.id=id;
		this.name=name;
		this.category=category;
		this.price=price;
	}
	
	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
	
	
}

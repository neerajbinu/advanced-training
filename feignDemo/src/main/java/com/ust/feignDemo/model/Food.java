package com.ust.feignDemo.model;


public class Food {
	private Long id;
	private String name;
	private String category;
	private Double price;
	
	public Food() {}

	public Food(Long id, String name, String category, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.price = price;
	}

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

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
}
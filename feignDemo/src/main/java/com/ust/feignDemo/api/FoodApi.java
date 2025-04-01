package com.ust.feignDemo.api;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ust.feignDemo.model.Food;



@FeignClient(name = "food-api", url = "http://localhost:5000/food")
public interface FoodApi {
	@PostMapping
	public ResponseEntity<Object> addFood(@RequestBody Food food);
	
	@GetMapping
	public ResponseEntity<List<Food>> retrieveAllFoods();
	
	@GetMapping("/{id}")
	public ResponseEntity<Object> findFoodById(@PathVariable Long id);
	
	@PutMapping
	public ResponseEntity<Object> updateFood(@RequestBody Food food);
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteFood(@PathVariable Long id);
}
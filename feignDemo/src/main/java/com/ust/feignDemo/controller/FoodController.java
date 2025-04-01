package com.ust.feignDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ust.feignDemo.api.FoodApi;
import com.ust.feignDemo.model.Food;

@RestController
public class FoodController {
	@Autowired
	private FoodApi api;
	
	@GetMapping("/foods")
	public ResponseEntity<List<Food>> getAllFoods() {
		return api.retrieveAllFoods();
	}
	
	@GetMapping
	public String home() {
		return "Hello world";
	}
}
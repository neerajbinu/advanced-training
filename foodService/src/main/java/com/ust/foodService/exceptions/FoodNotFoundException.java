package com.ust.foodService.exceptions;

public class FoodNotFoundException extends RuntimeException {
	public FoodNotFoundException(String message) {
		super(message);
	}
}
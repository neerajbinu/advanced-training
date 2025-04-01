package com.ust.foodService.exceptions;

public class FoodAlreadyFoundException extends RuntimeException {
		public FoodAlreadyFoundException(String message)
		{
			super(message);
			
		}
}

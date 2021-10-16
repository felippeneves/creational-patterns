package br.com.felippeneves.builder.meal.normal.director;

import br.com.felippeneves.builder.meal.normal.builder.FastFoodMealBuilder;
import br.com.felippeneves.builder.meal.normal.model.FastFoodMeal;

public class MealDirector {
    private FastFoodMealBuilder builder;

	public MealDirector(FastFoodMealBuilder builder) {
		this.builder = builder;
	}
	
	public void constructCombo() {
		builder.buildDrink();
		builder.buildMain();
		builder.buildSide();
		builder.buildDessert();
		builder.buildGift();
	}
	
	public FastFoodMeal getCombo() {
		return builder.getMeal();
	}
}

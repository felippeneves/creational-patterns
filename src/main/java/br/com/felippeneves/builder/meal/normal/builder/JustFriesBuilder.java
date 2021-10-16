package br.com.felippeneves.builder.meal.normal.builder;

public class JustFriesBuilder extends FastFoodMealBuilder {
	@Override
	public void buildSide() {
		meal.setSide("Large Fries");
	}
}

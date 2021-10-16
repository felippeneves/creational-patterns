package br.com.felippeneves.builder.spolleto.normal.model.builder;

import br.com.felippeneves.builder.spolleto.normal.model.Salad;

public class SaladBuilder extends MealBuilderOpt {
    public Salad getResult() {
		return new Salad(toppings, sauces, size, cheese, pepper);
	}
}

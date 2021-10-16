package br.com.felippeneves.builder.spolleto.normal.model.builder;

import br.com.felippeneves.builder.spolleto.normal.model.Pasta;

public class PastaBuilder extends MealBuilderOpt {
    
    public Pasta getResult() {
		return new Pasta(toppings, sauces, size, cheese, pepper);
	}
}

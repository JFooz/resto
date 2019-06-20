package com.fooz.restaurant.entities;

import java.util.ArrayList;
import java.util.List;

public abstract class RecetteCuisine {

	private List<Ingredient> ingredients;

	public RecetteCuisine() {

		this.ingredients = new ArrayList<Ingredient>();
	}

	public List<Ingredient> getIngredients() {
		return this.ingredients;
	}

	public void setIngredients(List<Ingredient> ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RecetteCuisine [ingredients=");
		builder.append(this.ingredients);
		builder.append("]");
		return builder.toString();
	}
}

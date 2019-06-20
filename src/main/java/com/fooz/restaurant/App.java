package com.fooz.restaurant;

import com.fooz.restaurant.entities.Dessert;
import com.fooz.restaurant.entities.Entree;
import com.fooz.restaurant.entities.Ingredient;
import com.fooz.restaurant.entities.Menu;
import com.fooz.restaurant.entities.Plat;

/**
 * Hello world!
 *
 */
public class App
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		Ingredient salade = new Ingredient("salade", "légume", 100);
		Ingredient coquillette = new Ingredient("coquillette", "féculent", 80);
		Ingredient soupePoisson = new Ingredient("Soupe", "bouillon", 100);
		Ingredient pesto = new Ingredient("Pesto", "Sauce", 75);
		Ingredient tomateSechees = new Ingredient("Tomates séchées", "légume", 80);
		Ingredient huileOlive = new Ingredient("Huile d'olive", "huile", 100);
		Ingredient vinaigrette = new Ingredient("Vinaigrette", "huile", 50);
		Ingredient chocolat = new Ingredient("Chocolat", "Sucrerie", 10);
		Ingredient vanille = new Ingredient("Vanille", "Sucrerie", 10);

		Plat pestoScicilienne = new Plat();
		pestoScicilienne.addIngredient(pesto);
		pestoScicilienne.addIngredient(huileOlive);
		pestoScicilienne.addIngredient(tomateSechees);
		pestoScicilienne.addIngredient(coquillette);

		Entree saladeVerte = new Entree();
		saladeVerte.addIngredient(vinaigrette);
		saladeVerte.addIngredient(salade);

		Dessert fondant = new Dessert();
		fondant.addIngredient(chocolat);
		fondant.addIngredient(vanille);

		Menu formuleMidi = new Menu(pestoScicilienne, saladeVerte, fondant);

		formuleMidi.listIngredient(fondant);
		formuleMidi.listIngredient(pestoScicilienne);

		System.out.println(pestoScicilienne.getIngredients().size());

		float formuleMidiScore = formuleMidi.calculNutriScore();
		System.out.println(formuleMidiScore);

	}
}

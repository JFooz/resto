package com.fooz.restaurant.entities;

/**
 *
 * @author utilisateur5
 *Classe pour gérer les menus du restaurant
 */
public class Menu {
	private Plat plat;
	private Entree entree;
	private Dessert dessert;

	public Menu() {
	}

	/**
	 *
	 * @param plat objet de type plat
	 * @param entree objet de type entrée
	 * @param dessert objet de type dessert
	 */
	public Menu(Plat plat, Entree entree, Dessert dessert) {
		super();
		this.plat = plat;
		this.entree = entree;
		this.dessert = dessert;
	}

	/**
	 * Méthode qui liste les ingrédients d'une étape de menu et les affiche.
	 * @param etapeMenu type RecetteCsuine
	 * Méthode qui vérifie le type de RecetteCuisine et itère la liste des ingrédient qui correspondent au type passé en paramètre (Entrée, Plat, Dessert).
	 * Menu contient des entités Entrée Plat Dessert => composition
	 * Entrée Plat Dessert hérite de RecetteCuisine.
	 * Entrée Plat Dessert peuvent également avoir le type RecetteCuisine => polymorphisme.
	 */
	public void listIngredient(RecetteCuisine etapeMenu) {
		if(etapeMenu instanceof Entree) {
			for (Ingredient ingredient : this.entree.getIngredients()) {
				System.out.println(ingredient.getNom());
			}
		}else if (etapeMenu instanceof Plat) {
			for (Ingredient ingredient : this.plat.getIngredients()) {
				System.out.println(ingredient.getNom());
			}
		}else if(etapeMenu instanceof Dessert){
			for (Ingredient ingredient : this.dessert.getIngredients()) {
				System.out.println(ingredient.getNom());
			}
		}else {
			System.out.println("Pas prévu au menu");
		}
	}

	public float calculNutriScore() {
		float nutriScore = 0;
		float nbIngredient = 0;
		for (Ingredient ingredient : this.entree.getIngredients()) {
			nutriScore += ingredient.getNutriScore();
			nbIngredient++;
		}
		for (Ingredient ingredient : this.plat.getIngredients()) {
			nutriScore += ingredient.getNutriScore();
			nbIngredient++;
		}
		for (Ingredient ingredient : this.dessert.getIngredients()) {
			nutriScore += ingredient.getNutriScore();
			nbIngredient++;
		}
		System.out.println(nutriScore);
		System.out.println(nbIngredient);
		return nutriScore/nbIngredient;
	}

	//Getters Setters
	public Plat getPlat() {
		return this.plat;
	}

	public void setPlat(Plat plat) {
		this.plat = plat;
	}

	public Entree getEntree() {
		return this.entree;
	}

	public void setEntree(Entree entree) {
		this.entree = entree;
	}

	public Dessert getDessert() {
		return this.dessert;
	}

	public void setDessert(Dessert dessert) {
		this.dessert = dessert;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Menu [plat=");
		builder.append(this.plat);
		builder.append(", entree=");
		builder.append(this.entree);
		builder.append(", dessert=");
		builder.append(this.dessert);
		builder.append("]");
		return builder.toString();
	}

}

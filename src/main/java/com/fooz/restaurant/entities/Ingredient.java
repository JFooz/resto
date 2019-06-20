package com.fooz.restaurant.entities;

/**
 * Classe qui définit un ingrédient.
 * un ingrédient est composé d'un nom, d'un type et d'un score nutritionnel.
 * @author utilisateur5
 *
 */
public class Ingredient {

	private String nom;
	private String type;
	private int nutriScore;

	public Ingredient() {
		super();
	}

	/**
	 *
	 * @param nom String
	 * @param type String
	 * @param nutriScore Int
	 */
	public Ingredient(String nom, String type, int nutriScore) {
		super();
		this.nom = nom;
		this.type = type;
		this.nutriScore = nutriScore;
	}

	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNutriScore() {
		return this.nutriScore;
	}

	public void setNutriScore(int nutriScore) {
		this.nutriScore = nutriScore;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ingredient [nom=");
		builder.append(this.nom);
		builder.append(", type=");
		builder.append(this.type);
		builder.append(", nutriScore=");
		builder.append(this.nutriScore);
		builder.append("]");
		return builder.toString();
	}

}

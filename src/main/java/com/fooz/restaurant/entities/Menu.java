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

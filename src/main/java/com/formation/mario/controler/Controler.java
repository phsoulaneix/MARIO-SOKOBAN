package com.formation.mario.controler;


public interface Controler {

	/**
	 * 
	 * @param deplacement
	 */
	public void deplacementJoueur(Deplacement deplacement);

	/**
	 * recharge la carte
	 */
	public void resetLevel();

	/**
	 * 
	 * @param level
	 */
	public void changeLevel(int level);

	/**
	 * permet de demander à la view l'affichage de message de fin.
	 */
	public void victoire();

	/**
	 * 
	 * @return le nombre de case du tableau en largeur
	 */
	public int getLargeurTableau();

	/**
	 * 
	 * @return le nombre de case du tableau en hauteur
	 */
	public int gethauteurTableau();
}

package com.formation.mario.controler;

import com.formation.mario.model.Deplacement;

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
}

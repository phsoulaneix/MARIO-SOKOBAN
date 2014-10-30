package com.formation.mario.model;

public interface Carte {
	public void modifieCase(int i, int j, TypeCase type);

	/**
	 * @return un tableau avec le nom des fichier images de chaque case
	 */
	public String[][] getTableauImage();

	/**
	 * @param level
	 */
	public void chargerLevel(int level);

	/**
	 * 
	 * @return true si la partie est gagnée
	 */
	public Boolean testVictoire();

}

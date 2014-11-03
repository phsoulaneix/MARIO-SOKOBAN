package com.formation.mario.controler;

import java.util.List;

import com.formation.mario.model.Carte;
import com.formation.mario.model.CarteImpl;
import com.formation.mario.view.View;

public class ControlerImpl implements Controler {

	private final Carte carte;
	private final View view;

	public ControlerImpl() {
		this.carte = new CarteImpl();
		this.view = new View(this, null);
		initialiseCarte();
		view.afficheCarte(carte.getTableauImage());
	}

	@Deprecated
	private void initialiseCarte() {
		carte.chargerLevel(1);
	}

	@Override
	public void deplacementJoueur(Deplacement deplacement) {
		carte.deplacement(deplacement);
		view.afficheCarte(carte.getTableauImage());
		if (carte.testVictoire()) {
			view.afficherGagnee();
		}
	}

	@Override
	public void resetLevel() {
		System.out.println("Remise à zéro du niveau");

		carte.chargerLevel(1);
		view.afficheCarte(carte.getTableauImage());
	}

	@Override
	public void changeLevel(int level) {
		System.out.println("Changement de niveau : " + level);
		carte.chargerLevel(level);
		view.masquerGagnee();
		view.afficheCarte(carte.getTableauImage());

	}

	@Override
	public int getLargeurTableau() {
		return 10;
	}

	@Override
	public int getHauteurTableau() {
		return 10;
	}

	@Override
	public List<Integer> getListeNiveau() {
		return carte.getListeNiveau();
	}

	@Override
	public String getInformation() {
		return "Niveau " + carte.getNiveau();
	}

}

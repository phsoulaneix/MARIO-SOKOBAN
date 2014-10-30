package com.formation.mario.controler;

import com.formation.mario.model.CarteImpl;
import com.formation.mario.view.View;

public class ControlerImpl implements Controler {

	private final CarteImpl carte;
	private final View view;

	public ControlerImpl() {
		this.view = new View(this, null);
		this.carte = new CarteImpl();
		initialiseCarte();
		view.afficheCarte(carte.getTableauImage());
		view.afficherGagnee();
	}

	@Deprecated
	private void initialiseCarte() {
		carte.chargerLevel(1);
	}

	@Override
	public void deplacementJoueur(Deplacement deplacement) {
		// TODO Auto-generated method stub

	}

	@Override
	public void resetLevel() {
		// TODO Auto-generated method stub

	}

	@Override
	public void changeLevel(int i) {
		// TODO Auto-generated method stub

	}

	@Override
	public void victoire() {
		// TODO Auto-generated method stub

	}

	@Override
	public int getLargeurTableau() {
		return 10;
	}

	@Override
	public int getHauteurTableau() {
		return 10;
	}

}

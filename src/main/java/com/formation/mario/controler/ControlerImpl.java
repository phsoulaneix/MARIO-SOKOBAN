package com.formation.mario.controler;

import com.formation.mario.model.CarteImpl;
import com.formation.mario.model.Deplacement;
import com.formation.mario.view.View;

public class ControlerImpl implements Controler {

	private final CarteImpl carte;
	private final View view;

	public ControlerImpl(View view, CarteImpl carte) {
		this.view = view;
		this.carte = carte;
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

}

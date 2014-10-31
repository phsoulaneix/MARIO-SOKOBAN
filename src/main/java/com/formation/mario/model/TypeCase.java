package com.formation.mario.model;

public enum TypeCase {
	RIEN(0, ""), MUR(1, "10113.jpg"), CAISSE(2, "10114.jpg"), CAISSE_OK(3,
			"10117.jpg"), OBJECTIF(4, "10118.png"), MARIO_HAUT(5, "48.gif"), MARIO_BAS(
			6, "45.gif"), MARIO_GAUCHE(7, "47.gif"), MARIO_DROITE(8, "46.gif");

	Integer value;

	String fichier;

	TypeCase(Integer value, String fichier) {
		this.value = value;
		this.fichier = fichier;
	}

	public Integer getValue() {
		return value;
	}

	public String getFichier() {
		return fichier;
	}

}

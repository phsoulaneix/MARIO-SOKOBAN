package com.formation.mario.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

public class LevelUtil {

	public static Integer[][] chargerLevel(int level) {
		final String fichier = "level/" + level + ".lvl";
		Integer[][] tableau = null;
		try {
			final InputStream ips = new FileInputStream(fichier);
			final InputStreamReader ipsr = new InputStreamReader(ips);
			final BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			int j = 0;
			final int tailleTableauHauteur = Integer.parseInt(br.readLine());
			final int tailleTableauLargeur = Integer.parseInt(br.readLine());
			tableau = new Integer[tailleTableauHauteur][tailleTableauLargeur];
			while ((ligne = br.readLine()) != null) {
				for (int i = 0; i < tailleTableauLargeur; i++) {
					tableau[i][j] = Integer.parseInt(ligne.substring(i, i + 1));
				}
				j++;
			}
			br.close();
		} catch (final Exception e) {
			System.out.println(e.toString());
		}
		return tableau;
	}
}
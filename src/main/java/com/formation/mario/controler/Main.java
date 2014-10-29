package com.formation.mario.controler;

import com.formation.mario.model.CarteImpl;
import com.formation.mario.view.View;

public class Main {

	public static void main(String[] args) {
		final View view = new View();
		final Controler controler = new ControlerImpl(view, new CarteImpl());
		view.setControler(controler);

	}

}

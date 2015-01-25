package com.massa.dp.strategy.sample;

public class JeuxDemo {

	public static void main(String[] args) {

		Joueur alfred = new Joueur(new StratCiseaux(), "alfred");
		Joueur john = new Joueur(new StratPapier(), "john");
		
		alfred.getMaStrategie();
		
	}

}

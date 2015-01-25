package com.massa.dp.strategy.sample;


public class Joueur {
	
  private JeuxStrategie maStrategie;
  private String name;
  private int score;
  
  public Joueur(JeuxStrategie maStrategie, String name) {
	 super();
	 this.maStrategie = maStrategie;
	 this.name = name;
	 this.score = score;
  }

  public void addPoints(int p) {
	  
  }
  
  public Coup joue(){
	return this.maStrategie.getCoup();
  }

  public JeuxStrategie getMaStrategie() {
	return maStrategie;
  }

  public void setMaStrategie(JeuxStrategie maStrategie) {
	this.maStrategie = maStrategie;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public int getScore() {
	return score;
  }

  public void setScore(int score) { 
	this.score = score;
  }
}

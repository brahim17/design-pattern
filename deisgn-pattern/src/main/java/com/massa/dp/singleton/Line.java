package com.massa.dp.singleton;

/** Interface de description d'une ligne */
public interface Line {
  /** Retourne les coordonnées du mier point */
  public int getX1();
  public int getY1();
  /** Retourne les coordonnées du deuxième point */
  public int getX2();
  public int getY2();
}
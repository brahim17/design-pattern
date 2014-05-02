package com.massa.dp.singleton;



/**  Fabrique  retournant des objets de types point ou ligne */
public class CanvasFactory {
	
  /** Donn�e de classe contenant l'instance courante */
  private static CanvasFactory instance = new CanvasFactory();
	
  /** Constructeur priv� interdisant l'instanciation en dehors de cette classe */
  private CanvasFactory () {}

  /** Singleton de la classe courante */ 
  public static CanvasFactory getInstance() { return instance; }

  /** Retourne un Point aux coordonn�es x,y */ 
  public Point getPoint( int x, int y ) {
   return new PointImpl( x, y );
  }
  /** Retourne une Ligne aux coordonn�es x1,y1,x2,y2 */ 
  public Line getLine( int x1, int y1, int x2, int y2 ) {
   return new LineImpl( x1, y1, x2, y2 );
 } 
}
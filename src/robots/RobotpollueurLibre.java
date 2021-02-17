package robots;

import java.util.Random;

//Robot pollueur qui se déplace aléatoirement sur le monde.

public class RobotpollueurLibre extends Robot {
	
	int id;
	
	//Initialise le robot à une coordonée choisie
	public RobotpollueurLibre(int x, int y, Monde m) {
		
		super(x,y,m);
		this.id=nbRobots;
		nbRobots++;
		
	}
	
	//Initialise le robot à des coordonnées aléatoires
	public RobotpollueurLibre (Monde m) {
		
		 super(m);
		 this.id=nbRobots;
		 nbRobots++;
	}

	//Methode qui fait déplacer le robot d'une case adjacente choisie aléatoirement
	public void parcourir() throws ErrPos, ErrDepl {
		
		if(posx>this.m.nbL-1|| posy>this.m.nbC-1 || posx<1 || posy<1) {
			throw new ErrPos("Erreur avec les coordonneees du robot x:"+posx+" y:"+posy);
		}
		//Sali la case sur laquelle il se trouve
		
		m.salir(posx, posy);
		
		//Tire une valeur aléatoire entre 0 et 3
		Random random = new Random();
		int nb= random.nextInt(4);
		
		//Se déplacement d'une case dans la direction associée à la valeur aléatoire tirée.
		switch(nb)
		{
			case 0 :
				if(posx-1<1) {
					break;
				}
					
				else {
					mouvementPos(posx-1,posy);
					break;
				}
				
			case 1 :
				if(posy-1<1) {
					break;
				}
				else {
					mouvementPos(posx,posy-1);
					break;
				}
				
			case 2 :
				if(posx+1>m.nbL-1) {
					break;
				}
				else {
					mouvementPos(posx+1,posy);
					break;
				}
				
			case 3 :
				if(posy+1>m.nbC-1) {
					break;
				}
				else {
					mouvementPos(posx,posy+1);
					break;
				}
				
		}
		
	}

}

package robots;

import java.util.Random;

public class RobotNettoyeurLibre extends Robot {

	int id;
	
	public RobotNettoyeurLibre(int x, int y, Monde m) {
		
		super(x,y,m);
		this.id=nbRobots;
		nbRobots++;
		
	}
	
	public RobotNettoyeurLibre (Monde m) {
		
		 super(m);
		 this.id=nbRobots;
		 nbRobots++;
	}

	
	//Methode de parcours pour un robot libre en mode al�atoire. 
	//Le r�sultat est proche d'une marche brownienne mais il a le m�rite d'exister
	public void parcourir() throws ErrPos, ErrDepl {
		
		if(posx>this.m.nbL-1|| posy>this.m.nbC-1 || posx<1 || posy<1) {
			throw new ErrPos("Erreur avec les coordonneees du robot x:"+posx+" y:"+posy);
		}
		
		//Nettoie la case sur laquelle il se trouve
		m.nettoyer(posx, posy);
		
		//Prend une valeur al�atoire entre 0 et 3
		Random random = new Random();
		int nb= random.nextInt(4);
		
		//Suivant la valeur al�atoire tir�e le robot va se d�placer dans une direction
		switch(nb)
		{
			case 0 :
				
				if(posx-1<1) {
					//Cette condition annule le deplacement al�atoire tir�
					break;
				}
					
				else {
					mouvementPos(posx-1,posy);
					break;
				}
				
			case 1 :
				
				if(posy-1<1) {
					//Cette condition annule le deplacement al�atoire tir�
					break;
				}
				else {
					mouvementPos(posx,posy-1);
					break;
				}
				
			case 2 :
				if(posx+1>m.nbL-1) {
					//Cette condition annule le deplacement al�atoire tir�
					break;
				}
				else {
					mouvementPos(posx+1,posy);
					break;
				}
				
			case 3 :
				if(posy+1>m.nbC-1) {
					//Cette condition annule le deplacement al�atoire tir�
					break;
				}
				else {
					mouvementPos(posx,posy+1);
					break;
				}
				
		}
	}
	
}

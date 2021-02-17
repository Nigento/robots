package robots;

//Robot nettoyeur qui se dirige tout droit vers le bas.
public class RobotNettoyeurToutDroit extends Robot {
	
	
	int id, colDepart;
	//dx est l'attribut qui impose le déplacement d'une case vers le bas.
	int dx=1;
	
	
	public RobotNettoyeurToutDroit(int colDepart, Monde m) {
		super(1,colDepart,m);
		this.colDepart=colDepart;
		this.id=nbRobots;
		nbRobots++;
	}
	
	public RobotNettoyeurToutDroit( Monde m) {
		super(m);
		this.colDepart=this.posy;
		this.id=nbRobots;
		nbRobots++;
	}
	
	//Parcourt le monde en se déplacement d'une case vers le bas.
	public void parcourir() throws ErrPos, ErrDepl{
		
		if(this.colDepart>this.m.nbC-1 || this.colDepart<1) 
			throw new ErrPos("La colonne "+this.colDepart+" du robot est en dehors du monde");
		
		//Si la case destination du déplacement est en dehors du monde alors le robot fait demi-tour
		if(this.posx+this.dx==this.m.nbL || this.posx+this.dx==0 ) this.dx=-this.dx;
		
		//Nettoie la case sur laquelle il se trouve
		this.m.nettoyer(this.posx, this.posy);
		//Se déplace à la case destination
		this.mouvementPos(this.posx+this.dx, this.colDepart);
	}
}

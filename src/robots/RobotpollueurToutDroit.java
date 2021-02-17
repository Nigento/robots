package robots;

//Robot polleur qui se déplace en ligne droite case par case vers le bas
public class RobotpollueurToutDroit extends Robot {
	
	int id, colDepart;
	int dx=1;
	
	//Construit un robot sur une colonne choisie par l'utilisateur
	public RobotpollueurToutDroit(int colDepart, Monde m) {
		super(1,colDepart,m);
		this.colDepart=colDepart;
		this.id=nbRobots;
		nbRobots++;
	}
	
	//Construit un robot à une position aléatoire dans le monde.
	public RobotpollueurToutDroit(Monde m) {
		super(m);
		this.colDepart=this.posy;
		this.id=nbRobots;
		nbRobots++;
	}
	
	//Le robot se déplace vers le bas depuis sa position
	public void parcourir() throws ErrPos, ErrDepl {
		
		if(this.colDepart>this.m.nbC-1 || this.colDepart<1) 
			throw new ErrPos("La colonne "+this.colDepart+" du robot est en dehors du monde");
		
		//Fait demi tour quand il arrive aux frontières du monde
		if(this.posx+this.dx==this.m.nbL-1 || this.posx+this.dx==1 ) this.dx=-this.dx;
		
		//Sali la case sur laquelle il est puis se déplace
		this.m.salir(this.posx, this.colDepart);
		this.mouvementPos(this.posx+this.dx, this.colDepart);
	}
}

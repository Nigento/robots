package robots;

// Un robot pollueur est saute d'une � une autre en respectant un mod�le de d�placement pr�d�fini

public class RobotpollueurSauteur extends Robot {
	//Les attributs dx et dy repr�sentent la distance parcourue par le robot lors d'un mouvement
	int id, dx, dy;
	
	
	public RobotpollueurSauteur(int x, int y, Monde m, int dx, int dy) {
		super(x,y,m);
		this.dx=dx;
		this.dy=dy;
		this.id=nbRobots;
		nbRobots++;
	}
	
	//Construit un robot avec un mod�le de d�placement al�atoire dans un interval et une position de d�part al�atoire.
	public RobotpollueurSauteur(Monde m) {
		super(m);
		this.dx=(int)Math.random()*10%4;
		this.dy=(int)Math.random()*10%4;
		this.id=nbRobots;
		nbRobots++;
	}

	
	//D�placement du robot en le faisant sauter suivant ses attributs de d�placement
	public void parcourir() throws ErrPos, ErrDepl {
		
		if (this.m.nbL-1<this.posx || this.m.nbC-1<this.posy || this.posy<1 || this.posx<1) {
			throw new ErrPos("Erreur avec les coordonn�es de la case destination x:"+this.posy+" y:"+this.posx);
		}
		
		//Demi tour quand il arrive aux limites du monde
		if(this.posx+this.dx>=this.m.nbL-1 || this.posx+this.dx<=0) this.dx=-this.dx;
		
		if(this.posy+this.dy>=this.m.nbC-1 || this.posy+this.dy<=0) this.dy=-this.dy;
		
		//Sali la case sur laquelle il est puis bouge
		this.m.salir(this.posx, this.posy);
		this.mouvementPos(this.posx+this.dx, this.posy+this.dy);
		
	}

}

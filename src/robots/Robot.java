package robots;

public abstract class Robot {

	public int posx;
	public int posy;
	public Monde m;
	public static int nbRobots=0;

	//Constructeur qui invoque un robot sur une case choisie du monde associé
	public Robot(int x, int y, Monde m) {
		this.posx=x;
		this.posy=y;
		this.m=m;
		
	}
	
	//Constructeur qui invoque un robot sur une case aléatoire du monde auquel il est associé
	public Robot(Monde m) {
		this.posx=1+(int) (Math.random()*10);
		this.posy=1+(int) (Math.random()*10);
		this.m=m;
	}
	
	//Methode qui déplace le robot d'une positon à une autre sans condition
	public void mouvementPos(int i, int j) throws ErrDepl{ 
		if (this.m.nbL-1<j || this.m.nbC-1<i || i<0 || j<0) {
			throw new ErrDepl("Erreur avec les coordonnées de la case destination x:"+i+" y:"+j);
		}
		this.posx=i;
		this.posy=j;
	}
	public abstract void parcourir() throws Exception;
	
}

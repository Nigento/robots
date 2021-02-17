package robots;

//Classe de robot intelligent qui cherchera la case sale la plus proche et se pr�cipite pour la nettoyer.
//Si une case est salie apr�s et est plus proche, il se dirige vers la nouvelle case.
public class RobotNettoyeurSmart extends RobotNettoyeur {
	
	int id;
	
	//Les attributs dx et dy ont pour but d'enregistrer la distance parcourue � chaque d�placement et son orientation.
	int dx=0;
	int dy=0;
	
	public RobotNettoyeurSmart(int x, int y, Monde m) {
		super(x,y,m);	
	}
	public RobotNettoyeurSmart( Monde m) {
		super(m);	
	}

	
	public void parcourir() throws ErrPos, ErrDepl {
		
		if (this.m.nbL-1<this.posx || this.m.nbC-1<this.posy || this.posy<1 || this.posx<1) {
			throw new ErrPos("Erreur avec les coordonn�es de la case destination x:"+this.posy+" y:"+this.posx);
		}
		//Nettoie la case sur laquelle il se trouve
		this.m.nettoyer(posx,posy);
		Position destination = new Position();
		//Recherche la case � nettoyer
		destination = scanner();
		
		//D�termine la direction g�n�rale � prendre pour sa diriger vers la case
		if(destination.posx<posx) dx=-1;
		if(destination.posy<posy) dy=-1;
		if(destination.posx>posx) dx=1;
		if(destination.posy>posy) dy=1;
		if(destination.posx==posx) dx=0;
		if(destination.posy==posy) dy=0;
		
		//Se rapporche d'une case dans la direction la plus �loign�e de la case � nettoyer.
		if(Math.abs(destination.posy-posy)<Math.abs(destination.posx-posx)) {
			mouvementPos(this.posx+this.dx,this.posy);
		}
		else if(Math.abs(destination.posy-posy)>Math.abs(destination.posx-posx)) {
			mouvementPos(this.posx,this.posy+this.dy);
		}
		else {
			mouvementPos(this.posx,this.posy);
		}

		
	}
	
	
}

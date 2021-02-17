package robots;

//Classe de robot intelligent qui cherchera la case sale la plus proche et se précipite pour la nettoyer.
//Si une case est salie après et est plus proche, il se dirige vers la nouvelle case.
public class RobotNettoyeurSmart extends RobotNettoyeur {
	
	int id;
	
	//Les attributs dx et dy ont pour but d'enregistrer la distance parcourue à chaque déplacement et son orientation.
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
			throw new ErrPos("Erreur avec les coordonnées de la case destination x:"+this.posy+" y:"+this.posx);
		}
		//Nettoie la case sur laquelle il se trouve
		this.m.nettoyer(posx,posy);
		Position destination = new Position();
		//Recherche la case à nettoyer
		destination = scanner();
		
		//Détermine la direction générale à prendre pour sa diriger vers la case
		if(destination.posx<posx) dx=-1;
		if(destination.posy<posy) dy=-1;
		if(destination.posx>posx) dx=1;
		if(destination.posy>posy) dy=1;
		if(destination.posx==posx) dx=0;
		if(destination.posy==posy) dy=0;
		
		//Se rapporche d'une case dans la direction la plus éloignée de la case à nettoyer.
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

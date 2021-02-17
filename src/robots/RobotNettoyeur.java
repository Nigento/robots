package robots;

//Classe générique pour les robots Nettoyeurs. 
//L'idée est de leur donner à tous la methode qui scanne le monde et recherche la case sale la plus proche
public class RobotNettoyeur extends Robot {
	
	
	public RobotNettoyeur(int x, int y, Monde m) {
		super(x,y,m);
	}
	
	public RobotNettoyeur(Monde m) {
		super(m);
	}

	public void parcourir() throws Exception{
		
	}
	
	//Methode qui scanne le monde case par case.
	
	public Position scanner() {
		
		double distance=100;
		
		Position posSale = new Position();
		Position aTester = new Position();
		
		for(int i=1;i<this.m.nbC-1;i++) {
			for(int j=1;j<this.m.nbL-1;j++) {
				if(this.m.Mat[i][j]) {
					
					//Si une case est sale, on appelle la methode de calcul de distance entre la position de cette case 
					//et celle du robot.
					aTester=new Position(i,j);
					
					if(aTester.Distance(posx, posy)<distance) {
						//Si la distance entre calculée est inferieure à la dernière distance minimale trouvée, 
						//on sauve la nouvelle distance comme minimale et on garde les coordonnées de la case associée
						
						distance=aTester.Distance(posx, posy);

						
						posSale=aTester;
					}
				}
			}
		}
		return posSale;
	}
}

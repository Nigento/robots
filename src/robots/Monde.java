package robots;

public class Monde {
	
	public int nbL, nbC;
	public boolean Mat[][];
	
	
	//Initialise le monde en état propre(false). Ce constructeur prend des dimensions personnalisées.
	public Monde(int nbL, int nbC) {
		this.nbL=nbL+2;
		this.nbC=nbC+2;
		this.Mat = new boolean[this.nbL][this.nbC];
		for(int i=0;i<this.Mat.length;i++) {
			for(int j=0; j<this.Mat[i].length;j++) {
				this.Mat[i][j]=false;
			}
		}
	}
	
	public Monde() {
		this.nbL=12;
		this.nbC=12;
		this.Mat = new boolean[12][12];
		for(int i=0;i<this.Mat.length;i++) {
			for(int j=0; j<this.Mat[i].length;j++) {
				this.Mat[i][j]=false;
			}
		}
	}
	
	//Methode qui sali (vers état true) une case du monde de coordonnée i;j.
	public void salir(int i, int j) throws ErrPos{
		if(i>this.nbL-1|| j>this.nbC-1 || i<1 || j<1) {
			throw new ErrPos("Erreur avec les coordonneees de la case a salir x:"+i+" y:"+j);
		}
		this.Mat[i][j]=true;
	}
	
	//Methode qui nettoie (vers etat false) une case du monde de coordonnée i;j
	public void nettoyer(int i, int j) throws ErrPos{
		if(j>this.nbL-1 || i>this.nbL-1 || i<1 || j<1) {
			throw new ErrPos("Erreur avec les coordonnees de la case a nettoyer x:"+i+" y:"+j);
		}
		this.Mat[i][j]=false;
	}
	
	//Methode qui permet de récupérer l'état d'une case de coordonnée i;j
	public boolean verif(int i, int j) throws ErrPos{
		if(j>this.nbL-1 || i>this.nbL-1 || i<1 || j<1) {
			throw new ErrPos("Erreur avec les coordonnÃ©es de la case a verifier x:"+i+" y:"+j);
		}
		return Mat[i][j];
	}
	
	//Methode qui parcourt le monde et compte le nombre de cases sales
	public int etatMonde() {
		
		int total=0;
		for(int i=1;i<this.Mat.length-1;i++) {
			for(int j=1;j<Mat[i].length-1;i++) {
				if(Mat[i][j]) total++;
			}
		}
		return total;
	}
	
	//Methode qui affiche le monde sous la forme d'un tableau de booléens
	public void affiche() {
		for(int i=1;i<Mat.length-1;i++) {
			
			for(int j=1;j<Mat[i].length-1;j++) {
				if(Mat[i][j])
					System.out.print("[1] ") ;
				else
					System.out.print("[0] ") ;
			}
			System.out.println();
		}
		System.out.println();
	}


}



package robots;

//Classe introduite pour servir au robot intelligent. 
//L'idée est de donner la position d'une case sale pour faciliter le calcul de distance
public class Position {
	public int posx;
	public int posy;
	
	public Position() {
		this.posx=1;
		this.posy=1;
	}
	public Position(int x, int y) {
		this.posx=x;
		this.posy=y;
	}
	
	//Methode qui calcule la distance entre la position de la case sale et le robot intelligent.
	public double Distance(int x, int y) {
		return Math.sqrt((posx-x)*(posx-x)+(posy-y)*(posx-x));
	}
}

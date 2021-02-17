package robots;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceEst extends JFrame {


	private static final long serialVersionUID = -7585589919196320L;
	public JPanel pEst;
	public JButton nettoyeurDroit;
	public JButton nettoyeurSauteur;
	public JButton nettoyeurLibre;
	public JButton nettoyeurSmart;
	
	public InterfaceEst() {
		
		nettoyeurDroit = new JButton("Nettoyeur Droits");
		nettoyeurSauteur = new JButton("Nettoyeur Sauteurs");
		nettoyeurLibre = new JButton("Nettoyeur Libre");
		nettoyeurSmart = new JButton("Nettoyeur Smart");
		
		this.pEst = new JPanel();
		pEst.setLayout(new BoxLayout(pEst, BoxLayout.Y_AXIS));
		pEst.add(nettoyeurDroit);
		pEst.add(nettoyeurSauteur);
		pEst.add(nettoyeurLibre);
		pEst.add(nettoyeurSmart);
	}
		
}

package robots;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class InterfaceOuest extends JFrame {
	

	private static final long serialVersionUID = -2020153650315365880L;
	
	public JPanel pOuest;
	public JButton pollueurDroit;
	public JButton pollueurSauteur;
	public JButton pollueurLibre;
	
	public InterfaceOuest() {
		
		
		pollueurDroit = new JButton("POLLUER Droits");
		pollueurSauteur = new JButton("POLLUER Sauteurs");
		pollueurLibre = new JButton("ROBOTS LIBRES");
		
		this.pOuest = new JPanel();
		pOuest.setLayout(new BoxLayout(pOuest, BoxLayout.Y_AXIS));
		pOuest.add(pollueurDroit);
		pOuest.add(pollueurSauteur);
		pOuest.add(pollueurLibre);
	}
}

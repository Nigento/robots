package robots;

import java.awt.*;
import javax.swing.*;

public class InterfaceGraphique extends JFrame{

	private static final long serialVersionUID = 1L;
	public JFrame fenetre;
	public InterfaceGraphique() {
		
		super("InterfaceGraphique");
		
		
		InterfaceCentre pCenter = new InterfaceCentre();
		InterfaceNord pNord = new InterfaceNord();
		InterfaceOuest pOuest = new InterfaceOuest();
		InterfaceEst pEst = new InterfaceEst();
		
		fenetre = new JFrame();
		Container contenu = fenetre.getContentPane();
		contenu.setLayout(new BorderLayout());
		contenu.add(pCenter.pCenter,BorderLayout.CENTER);
		contenu.add(pNord.pNord,BorderLayout.NORTH);
		contenu.add(pOuest.pOuest,BorderLayout.WEST);
		contenu.add(pEst.pEst,BorderLayout.EAST);
		
		fenetre.pack();
		fenetre.show();
		
	}
	
	public static void main(String args[]) {
		
		InterfaceGraphique bonjour = new InterfaceGraphique();
	}

}

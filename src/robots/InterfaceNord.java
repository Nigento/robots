package robots;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Label;

import javax.swing.*;

public class InterfaceNord extends JFrame{
	

	private static final long serialVersionUID = 8728895873620006196L;
	public JPanel pNord;
	JButton nettoyer;
	JButton polluer;
	JButton reinit;
	JButton quitter;
	public JPanel northButtonOfNorth;
	
	public InterfaceNord() {
		
		this.pNord = new JPanel();
		this.pNord.setLayout(new BorderLayout());
		this.northButtonOfNorth = new JPanel();
		this.northButtonOfNorth.setLayout(new FlowLayout());
		int i = 0;
		nettoyer = new JButton("Nettoyer");
		polluer = new JButton("Polluer");
		reinit = new JButton("Réinitialiser le monde");
		quitter = new JButton("Quitter");
		this.northButtonOfNorth.add(nettoyer);
		this.northButtonOfNorth.add(polluer);
		this.northButtonOfNorth.add(reinit);
		this.northButtonOfNorth.add(quitter);
		this.pNord.add(northButtonOfNorth,BorderLayout.NORTH);
		this.pNord.add(new Label("Nombre de papiers gras:"+i),BorderLayout.SOUTH);
	}

}

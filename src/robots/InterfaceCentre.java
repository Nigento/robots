package robots;

import java.awt.*;

import javax.swing.*;




public class InterfaceCentre extends JFrame {
	

	private static final long serialVersionUID = 1L;
	
	JPanel pCenter;
	
	public InterfaceCentre() {
		this.pCenter = new JPanel();
		
		this.pCenter.setLayout(new GridLayout(5,5));
		for(int i = 1;i<26;i++)
			pCenter.add(new Button());
	}
}

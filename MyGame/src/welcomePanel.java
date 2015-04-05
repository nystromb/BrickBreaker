import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JPanel;


public class welcomePanel extends JPanel {
		//Attribute
		JButton bOption;		// create a variable for button option
		JButton bPlay;
		JButton bInstruction;
		JButton bQuit;
		
		//Constructor
	  	public welcomePanel() {
			super();
			getBackground();
			setLayout(null);
			
			
			bOption = new JButton("Options");	    //instantiate button
			bOption.setBounds(500, 200, 150, 50);   //define position
			add(bOption);				    // add button to panel
			
			bPlay=new JButton("Play");
			bPlay.setBounds(500, 270, 150, 50);
			add(bPlay);
			
			bInstruction = new JButton("Instruction");
			bInstruction.setBounds(500, 340, 150, 50);
			add(bInstruction);
			
			bQuit = new JButton("Quit");
			bQuit.setBounds(500, 410, 150, 50);
			add(bQuit);
			
			
			
	  	
	  	
	  	
	  	} // end constructor
	  	public void paintComponent (Graphics g)
	  	 {
	  	    super.paintComponent(g);
	  	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/Brick1.jpg");
	  	    g.drawImage(myImage, 0, 0, this);
	  	  requestFocusInWindow();
	  	 }
	}// end class


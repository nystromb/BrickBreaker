import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class OptionsPanel extends JPanel {
	//Attributes
	JButton bOk;		// create a variable for button OK
	Sounds Sounds;
	ballSpeed ballSpeed;
	ballsOP ballsOption;
	PaddleSize PaddleSize;
	JLabel ballIcon;
	JLabel Paddlesize;
	JLabel speed;
	JLabel sound;
	
	//Constructor
 	public OptionsPanel() {
		setBackground(Color.gray);
       	setLayout(null);
       	
       	ballIcon = new JLabel("Ball Icons");
       	add(ballIcon);
       	ballIcon.setForeground(Color.WHITE);
       	ballIcon.setFont(new Font("helvetica", Font.BOLD, 28));
       	ballIcon.setBounds(700, 100, 150, 50);
             	
       	Paddlesize = new JLabel("Paddle Size");
       	add(Paddlesize);
       	Paddlesize.setForeground(Color.WHITE);
       	Paddlesize.setFont(new Font("helvetica", Font.BOLD, 20));
       	Paddlesize.setBounds(475, 100, 150, 50);
       	
       	speed = new JLabel("Speed");
       	add(speed);
       	speed.setForeground(Color.WHITE);
       	speed.setFont(new Font("helvetica", Font.BOLD, 28));
       	speed.setBounds(250, 100, 150, 50);
       	
       	sound = new JLabel("Sound");
       	add(sound);
       	sound.setForeground(Color.WHITE);
       	sound.setFont(new Font("helvetica", Font.BOLD, 28));
       	sound.setBounds(25, 100, 150, 50);
       	
       	
       	
       	
       	
       	Sounds = new Sounds();
       	add(Sounds);
       	Sounds.setOpaque(false);
       	Sounds.setBounds(25, 150, 200, 350);
       	
       	ballSpeed = new ballSpeed();
    	add(ballSpeed);
    	ballSpeed.setOpaque(false);
    	ballSpeed.setBounds(250, 150, 200, 350);
    	
    	PaddleSize = new PaddleSize();
    	add(PaddleSize);
    	PaddleSize.setOpaque(false);
    	PaddleSize.setBounds(475,150,200,350);
    	
    	ballsOption= new ballsOP();
    	ballsOption.setOpaque(false);
     	add(ballsOption);
    	ballsOption.setBounds(700, 150, 150, 350);
       	
       	
      	bOk= new JButton("Ok");		// instantiate button OK
       	bOk.setBounds(370, 520, 150, 50);	//define position/size
      	add(bOk);				// add button OK to panel
      	

      	
      	
  	} // end constructor
 
	    
 	public void paintComponent (Graphics g)
 	 {
 	    super.paintComponent(g);
 	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/Brick1.jpg");
 	    g.drawImage(myImage, 0, 0, this);
 	  requestFocusInWindow();
 	 }
	    
 	
 		
 	
}// end class
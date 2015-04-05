import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JPanel;


public class instructionPanel extends JPanel{

	JButton bOk;
	JButton play;
	JButton rules;
	JButton BallIcons;
	JButton BallSpeed;
	JButton PaddleSize;
	JButton Sound;
	public instructionPanel()
	{
		setLayout(null);
		bOk = new JButton("Ok");
		add(bOk);
		bOk.setBounds(300, 450, 200, 100);
		
		play = new JButton("Starting the game");
		add(play);
		play.setBounds(50, 150, 200, 100);
		play.setContentAreaFilled(false);
		play.setForeground(Color.WHITE);
		play.setFont(new Font("helvetica", Font.BOLD, 18));
		
		rules = new JButton("How to play?");
		add(rules);
		rules.setBounds(300, 150, 200, 100);
		rules.setContentAreaFilled(false);
		rules.setForeground(Color.WHITE);
		rules.setFont(new Font("helvetica", Font.BOLD, 20));
		
		BallIcons= new JButton("Change the ball icon");
		add(BallIcons);
		BallIcons.setBounds(550, 150, 200, 100);
		BallIcons.setContentAreaFilled(false);
		BallIcons.setForeground(Color.WHITE);
		BallIcons.setFont(new Font("helvetica", Font.BOLD, 15));
		
		BallSpeed= new JButton("Change the ball speed");
		add(BallSpeed);
		BallSpeed.setBounds(50, 300, 200, 100);
		BallSpeed.setContentAreaFilled(false);
		BallSpeed.setForeground(Color.WHITE);
		BallSpeed.setFont(new Font("helvetica", Font.BOLD, 15));
		
		PaddleSize = new JButton("Change the paddle size");
		add(PaddleSize);
		PaddleSize.setBounds(300, 300, 200, 100);
		PaddleSize.setContentAreaFilled(false);
		PaddleSize.setForeground(Color.WHITE);
		PaddleSize.setFont(new Font("helvetica", Font.BOLD, 13));
		
		Sound = new JButton("Change the music");
		add(Sound);
		Sound.setBounds(550, 300, 200, 100);
		Sound.setContentAreaFilled(false);
		Sound.setForeground(Color.WHITE);
		Sound.setFont(new Font("helvetica", Font.BOLD, 16));
	}
	public void paintComponent (Graphics g)
 	 {
 	    super.paintComponent(g);
 	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/Brick1.jpg");
 	    g.drawImage(myImage, 0, 0, this);
 	  requestFocusInWindow();
 	 }

}

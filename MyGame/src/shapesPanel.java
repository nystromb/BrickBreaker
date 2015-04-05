import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JPanel;


public class shapesPanel extends JPanel{
	JButton first;
	JButton second;
	JButton third;
	JButton fourth;
	JButton fifth;
	JButton back;

	public shapesPanel() {
		super();
		getBackground();
		setLayout(null);
	
		first = new JButton("First");
		first.setBounds(150, 210, 150, 50);   
		add(first);	
		
		second = new JButton("Second");
		second.setBounds(350, 210, 150, 50);   
		add(second);
		
		third = new JButton("Third");
		third.setBounds(550, 210, 150, 50);   
		add(third);	
		
		fourth = new JButton("Fourth");
		fourth.setBounds(250, 340, 150, 50);   
		add(fourth);
		
		fifth = new JButton("Fifth");
		fifth.setBounds(450, 340, 150, 50);
		add(fifth);
		
		back = new JButton("Back");
		add(back);
		back.setBounds(350,445,150,50);
	}
	public void paintComponent (Graphics g)
 	 {
 	    super.paintComponent(g);
 	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/Brick1.jpg");
 	    g.drawImage(myImage, 0, 0, this);
 	  requestFocusInWindow();
 	 }
	
}

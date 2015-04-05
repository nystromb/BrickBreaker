import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.LayoutManager;

import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ballsPanel extends JPanel{

	/****************************************************
	 * Attributes
	 ***************************************************/
	JLabel ball1;
	JLabel ball2;
	JLabel ball3;
	int currentBall=1;

	/****************************************************
	 * Constructor
	 ***************************************************/
	public ballsPanel() {
		super();
		setBackground(Color.black);
		setPreferredSize(new Dimension(50,50));
		setLayout(new FlowLayout(FlowLayout.LEFT));
		

		ball1= new JLabel();
		ball1.setIcon(new ImageIcon("images/pink.png"));
		add(ball1);
		ball2= new JLabel();
		ball2.setIcon(new ImageIcon("images/pink2.png"));
		add(ball2);
		ball3= new JLabel();
		ball3.setIcon(new ImageIcon("images/pink3.png"));
		add(ball3);
	
		removeBall();
		

		
	} // end of constructor

	/****************************************************
	 * Methods
	 ***************************************************/
	public void removeBall()
	{
	if (currentBall == 1) 
	{
		remove(ball1);
		currentBall += 1;
	} 
	else if(currentBall == 2) 
	{
		remove(ball2);
		currentBall += 1;
	} 
	else if (currentBall == 3) 
	{
		remove(ball3);
		currentBall += 1;
	} 
	 
	}
} // end of class

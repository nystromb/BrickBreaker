import java.awt.*;

import javax.swing.*;
import javax.swing.border.Border;


public class ballsOP extends JPanel{
	 JRadioButton ball1;
	 JRadioButton ball2;
	 JRadioButton ball3;
	 ButtonGroup bg;
	 ball b;
	 int icon = 1;

	 
	

	
	public ballsOP()
	{
		setLayout(new GridLayout(3,1));
		
		
		
		
		
		ball1 = new JRadioButton("Pink Ball", true);
		ball1.setOpaque(false);
		ball1.setForeground(Color.WHITE);
		ball1.setFont(new Font("helvetica", Font.BOLD, 20));
		ball2 = new JRadioButton("Soccer Ball");
		ball2.setOpaque(false);
		ball2.setForeground(Color.WHITE);
		ball2.setFont(new Font("helvetica", Font.BOLD, 20));
		ball3 = new JRadioButton("Golf Ball");
		ball3.setOpaque(false);
		ball3.setForeground(Color.WHITE);
		ball3.setFont(new Font("helvetica", Font.BOLD, 20));
		
		
		bg= new ButtonGroup();
		bg.add(ball1);
		bg.add(ball2);
		bg.add(ball3);
		
		
		
		
		
		add(ball1);
		add(ball2);
		add(ball3);
		


	}
	public int getBallImage()  {

	    if (ball1.isSelected()){
	    	icon = 1;
	       
	    }
	
	    if (ball2.isSelected()){
	       icon = 2;}
	    if (ball3.isSelected()){
	    	icon = 3;}
		return icon;

	    
	 }
}

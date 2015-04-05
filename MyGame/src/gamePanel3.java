import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;


public class gamePanel3 extends JPanel {
	JButton[] row1, row2, row3c,row3a,row3b, row4a,row4b,row4c ,row5a,row5b,row5c ,row6, row7;
	 paddle p1;
	 ball b1;
	 private int width = 40;
	 private int height = 15;
	 private int ex = 100;
	 private int y = 100;
	
	
	Timer ballTimer;
	int ballDelay = 10;
	
	JLabel labelScore;
	JButton Serve;
	JButton pause;
	JButton back;
	
	JLabel ball1;
	JLabel ball2;
	JLabel ball3;
	int currentBall=1;
	
	

	
	public gamePanel3()
	{
		setBackground(Color.gray);
       	setLayout(null);
       	row1 = new JButton[16];
       	row2 = new JButton[16];
       	row3a = new JButton[4];
    	row3b = new JButton[4];
    	row3c = new JButton[4];
       	row4a = new JButton[4];
       	row4b = new JButton[4];
       	row4c = new JButton[4];
       	row5a = new JButton[4];
       	row5b = new JButton[4];
       	row5c= new JButton[4];

       	row6 = new JButton[16];
       	row7 = new JButton[16];
    
       	
       	Bricks();
		
       	ball1= new JLabel();
		ball1.setIcon(new ImageIcon("images/pink.png"));
		ball1.setBounds(25, 10, 20, 20);
		add(ball1);
		
		ball2= new JLabel();
		ball2.setIcon(new ImageIcon("images/pink2.png"));
		ball2.setBounds(45, 10, 20, 20);
		add(ball2);
		ball3= new JLabel();
		ball3.setBounds(65, 10, 20, 20);
		ball3.setIcon(new ImageIcon("images/pink3.png"));
		add(ball3);
	
		removeBall();
		
		b1 = new ball();
		add(b1);
		b1.setBounds(100, 300, 25, 25);
		
		

		
		p1 = new paddle();
		add(p1);
		p1.setPosition();
		p1.setEnabled(false);
	
       	
       	ballTimer = new  Timer(ballDelay, null);
		//ballTimer.start();
       	
       	labelScore = new JLabel("0");
		labelScore.setHorizontalAlignment(JLabel.CENTER);
		labelScore.setFont(new Font("helvetica", Font.BOLD, 40));
		labelScore.setForeground(Color.yellow);
		add(labelScore);
		labelScore.setBounds(0, 10, 25, 30);
		
		Serve = new JButton("Serve");
		Serve.setPreferredSize(new Dimension(100,100));
		Serve.setForeground(Color.yellow);
		Serve.setVerticalAlignment(JButton.CENTER);
		Serve.setFont(new Font("helvetica", Font.BOLD, 28));
		add(Serve);
		Serve.setBounds(730, 0, 150, 100);
		Serve.setContentAreaFilled(false);
		
		pause = new JButton("Pause");
		pause.setPreferredSize(new Dimension(100,100));
		pause.setForeground(Color.yellow);
		pause.setVerticalAlignment(JButton.CENTER);
		pause.setFont(new Font("helvetica", Font.BOLD, 28));
		add(pause);
		pause.setBounds(730, 550, 150, 100);
		pause.setContentAreaFilled(false);
		
		back = new JButton("Back");
		back.setPreferredSize(new Dimension(100, 100));
		back.setForeground(Color.yellow);
		back.setFont(new Font("helvetica", Font.BOLD, 28));
		add(back);
		back.setBounds(0,550,150,100);
		back.setContentAreaFilled(false);
       	
       	
       	
       	
 
       	
	}
	public void paintComponent (Graphics g)
 	 {
 	    super.paintComponent(g);
 	    Image myImage = Toolkit.getDefaultToolkit().getImage("images/Brick1.jpg");
 	    g.drawImage(myImage, 0, 0, this);
 	  requestFocusInWindow();
 	 }
	
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
	
	public void Bricks(){
		ex = 100;
		y = y + 20;
		 

		for (int x=0; x < 15; x++) 
		{	    	 
			
		    row1[x] = new JButton();
		    row1[x].setBackground(Color.blue);
		    row1[x].setBounds(ex, y, width, height);
		    add(row1[x]);
		    row1[x].setEnabled(false);
		    ex = ex + 42;
		    
		}
		
		ex = 100;
		y = y + 20;
		
	
		for (int x=0; x < 15; x++) 
		{	    	   
		    row2[x] = new JButton();
		    row2[x].setBackground(Color.red);
		    row2[x].setBounds(ex, y, width, height);
		    add(row2[x]); 
		    row2[x].setEnabled(false);
		    ex = ex + 42;

		}
		
		ex = 100;
		y = y + 20;
		
		for (int x=0; x < 3; x++) 
		{	    	 
		    row3a[x] = new JButton();
		    row3a[x].setBackground(Color.green);
		    row3a[x].setBounds(ex, y, width, height);
		    add(row3a[x]); 
		    row3a[x].setEnabled(false);
		    ex = ex + 42;
		    

		}
		ex = 100 +(6*42);
		
		for (int x=0; x < 3; x++) 
		{	    	 
		    row3b[x] = new JButton();
		    row3b[x].setBackground(Color.green);
		    row3b[x].setBounds(ex, y, width, height);
		    add(row3b[x]); 
		    row3b[x].setEnabled(false);
		    ex = ex + 42;
		    

		}
		ex = 100 +(12*42);
		for (int x=0; x < 3; x++) 
		{	    	 
		    row3c[x] = new JButton();
		    row3c[x].setBackground(Color.green);
		    row3c[x].setBounds(ex, y, width, height);
		    add(row3c[x]); 
		    row3c[x].setEnabled(false);
		    ex = ex + 42;
		    

		}
		
		
		ex = 100;
		y = y + 20;
		
		for (int x=0; x < 3; x++) 
		{	    	   
		    row4a[x] = new JButton();
		    row4a[x].setBackground(Color.yellow);
		    row4a[x].setBounds(ex, y, width, height);  
		    add(row4a[x]);
		    row4a[x].setEnabled(false);
		    ex = ex + 42;
		    

		}
		ex = 100+ (6*42);
		
		for (int x=0; x < 3; x++) 
		{	    	   
		    row4b[x] = new JButton();
		    row4b[x].setBackground(Color.yellow);
		    row4b[x].setBounds(ex, y, width, height);  
		    add(row4b[x]);
		    row4b[x].setEnabled(false);
		    ex = ex + 42;
		    

		}
		ex = 100+ (12*42);

		
		for (int x=0; x < 3; x++) 
		{	    	   
		    row4c[x] = new JButton();
		    row4c[x].setBackground(Color.yellow);
		    row4c[x].setBounds(ex, y, width, height);  
		    add(row4c[x]);
		    row4c[x].setEnabled(false);
		    ex = ex + 42;
		    

		}
		ex = 100;
		y = y + 20;
		 

		for (int x=0; x < 3; x++) 
		{	    	 
			
		    row5a[x] = new JButton();
		    row5a[x].setBackground(Color.blue);
		    row5a[x].setBounds(ex, y, width, height);
		    add(row5a[x]);
		    row5a[x].setEnabled(false);
		    ex = ex + 42;
		}
		ex = 100 + (42*6);
		 

		for (int x=0; x < 3; x++) 
		{	    	 
			
		    row5b[x] = new JButton();
		    row5b[x].setBackground(Color.blue);
		    row5b[x].setBounds(ex, y, width, height);
		    add(row5b[x]);
		    row5b[x].setEnabled(false);
		    ex = ex + 42;
		}
		ex = 100 + (42*12);

		 

		for (int x=0; x < 3; x++) 
		{	    	 
			
		    row5c[x] = new JButton();
		    row5c[x].setBackground(Color.blue);
		    row5c[x].setBounds(ex, y, width, height);
		    add(row5c[x]);
		    row5c[x].setEnabled(false);
		    ex = ex + 42;
		}
		ex = 100;
		y = y + 20;
		 

		for (int x=0; x < 15; x++) 
		{	    	 
			
		    row6[x] = new JButton();
		    row6[x].setBackground(Color.red);
		    row6[x].setBounds(ex, y, width, height);
		    add(row6[x]);
		    row6[x].setEnabled(false);
		    ex = ex + 42;
		}
		ex = 100;
		y = y + 20;
		 

		for (int x=0; x < 15; x++) 
		{	    	 
			
		    row7[x] = new JButton();
		    row7[x].setBackground(Color.yellow);
		    row7[x].setBounds(ex, y, width, height);
		    add(row7[x]);
		    row7[x].setEnabled(false);
		    ex = ex + 42;
		}
		
	}
	
	
	


	
}

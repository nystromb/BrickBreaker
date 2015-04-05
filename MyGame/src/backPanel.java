import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

public class backPanel extends JPanel {
	// ATTRIBUTES
	welcomePanel wp;
	OptionsPanel  op;
	gamePanel gp;
	gamePanel2 gp2;
	gamePanel3 gp3;
	gamePanel4 gp4;
	gamePanel5 gp5;
	instructionPanel ip;
	shapesPanel sp;
	int x;
	// CONSTRUCTOR
	public backPanel() {
		super();	
		setLayout(new BorderLayout() );
		sp = new shapesPanel();
		gp3 = new gamePanel3();
		gp2 = new gamePanel2();
		gp4 = new gamePanel4();
		gp5 = new gamePanel5();
		wp = new welcomePanel();
		op = new OptionsPanel();
		gp = new gamePanel();
		ip = new instructionPanel();
		add(wp, "Center");
		
		gp.Serve.addActionListener(new ButtonServeListener());
		gp.pause.addActionListener(new ButtonPauseListener());
		gp.ballTimer.addActionListener(new BallTimerListener());
		gp.addKeyListener(new PaddleListener());
		gp.back.addActionListener(new ButtonBackListener());
		
		
		gp2.ballTimer.addActionListener(new BallTimer2Listener());
		gp2.Serve.addActionListener(new ButtonServe2Listener());
		gp2.addKeyListener(new Paddle2Listener());
		gp2.pause.addActionListener(new ButtonPause2Listener());
		gp2.back.addActionListener(new ButtonBack2Listener());
		
		gp3.ballTimer.addActionListener(new BallTimer3Listener());
		gp3.Serve.addActionListener(new ButtonServe3Listener());
		gp3.addKeyListener(new Paddle3Listener());
		gp3.pause.addActionListener(new ButtonPause3Listener());
		gp3.back.addActionListener(new ButtonBack3Listener());
		
		gp4.ballTimer.addActionListener(new BallTimer4Listener());
		gp4.Serve.addActionListener(new ButtonServe4Listener());
		gp4.addKeyListener(new Paddle4Listener());
		gp4.pause.addActionListener(new ButtonPause4Listener());
		gp4.back.addActionListener(new ButtonBack4Listener());
		
		gp5.ballTimer.addActionListener(new BallTimer5Listener());
		gp5.Serve.addActionListener(new ButtonServe5Listener());
		gp5.addKeyListener(new Paddle5Listener());
		gp5.pause.addActionListener(new ButtonPause5Listener());
		gp5.back.addActionListener(new ButtonBack5Listener());

		
		

		sp.first.addActionListener(new ButtonFirstListener());
		sp.second.addActionListener(new ButtonSecondListener());
		sp.third.addActionListener(new ButtonThirdListener());
		sp.fourth.addActionListener(new ButtonFourthListener());
		sp.fifth.addActionListener(new ButtonFifthListener());


		sp.back.addActionListener(new ButtonBackSPListener());
		
		
		wp.bOption.addActionListener(new ButtonOptionListener());
		wp.bPlay.addActionListener(new ButtonPalyListener());
		wp.bInstruction.addActionListener(new ButtoninstructionListener());
		wp.bQuit.addActionListener(new ButtonQuitListener());
		
		

	     
		op.bOk.addActionListener(new ButtonOkListener());
	     
	     
	     ip.bOk.addActionListener(new ButtonOk1Listener());
	     ip.play.addActionListener(new ButtonplayListener());
	     ip.rules.addActionListener(new ButtonrulesListener());
	     ip.BallIcons.addActionListener(new ButtonBallIconsListener());
	     ip.BallSpeed.addActionListener(new ButtonBallSpeedListener());
	     ip.PaddleSize.addActionListener(new ButtonPaddleSizeListener());
	     ip.Sound.addActionListener(new ButtonSoundListener());
	     

	     
	     

	}// end constructor

	// METHODS

	
	//Inner Classes
	 private class ButtonFirstListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(sp);
	             add(gp);
	             validate();
	             repaint();

	         	
	     		}
		}  
	 private class ButtonSecondListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(sp);
	             add(gp2);
	             validate();
	             repaint();

	         	
	     		}
		}  
	 private class ButtonThirdListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(sp);
	             add(gp3);
	             validate();
	             repaint();

	         	
	     		}
		}
	 private class ButtonFourthListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(sp);
	             add(gp4);
	             validate();
	             repaint();

	         	
	     		}
		}
	 private class ButtonFifthListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(sp);
	             add(gp5);
	             validate();
	             repaint();

	         	
	     		}
		}
	 private class ButtonBackListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(gp);
	             add(sp);
	             validate();
	             repaint();

	         	
	     		}
		}  
	 private class ButtonBack2Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(gp2);
	             add(sp);
	             validate();
	             repaint();

	         	
	     		}
		}  
	 private class ButtonBack3Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(gp3);
	             add(sp);
	             validate();
	             repaint();

	         	
	     		}
		} 
	 private class ButtonBack4Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(gp4);
	             add(sp);
	             validate();
	             repaint();

	         	
	     		}
		} 
	 private class ButtonBack5Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(gp5);
	             add(sp);
	             validate();
	             repaint();

	         	
	     		}
		} 
	 private class ButtonBackSPListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(sp);
	             add(wp);
	             validate();
	             repaint();

	         	
	     		}
		}  
	
	private class ButtonOptionListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(wp);
	             add(op);
	             validate();
	             repaint();

	         	
	     		}
		}
	   private class ButtonOkListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   //setting the image of the ball
			   if(op.ballsOption.getBallImage() == 1){
				   gp.b1.imageOption = 1;
				   gp.b1.setImage();
				   gp2.b1.imageOption = 1;
				   gp2.b1.setImage();
				   gp3.b1.imageOption = 1;
				   gp3.b1.setImage();
				   gp4.b1.imageOption = 1;
				   gp4.b1.setImage();
				   gp5.b1.imageOption = 1;
				   gp5.b1.setImage();
			   }
			   
			   if (op.ballsOption.getBallImage() == 2){
				   gp.b1.imageOption = 2;
				   gp.b1.setImage();
				   gp2.b1.imageOption = 2;
				   gp2.b1.setImage();
				   gp3.b1.imageOption = 2;
				   gp3.b1.setImage();
				   gp4.b1.imageOption = 2;
				   gp4.b1.setImage();
				   gp5.b1.imageOption = 2;
				   gp5.b1.setImage();
			   }
			   
			   if(op.ballsOption.getBallImage() == 3){
				   gp.b1.imageOption = 3;
				   gp.b1.setImage();
				   gp2.b1.imageOption = 3;
				   gp2.b1.setImage();
				   gp3.b1.imageOption = 3;
				   gp3.b1.setImage();
				   gp4.b1.imageOption = 3;
				   gp4.b1.setImage();
				   gp5.b1.imageOption = 3;
				   gp5.b1.setImage();
			   }
			   
			   //setting the paddle size
			   if(op.PaddleSize.padSize() == 1){
				   gp.p1.setBounds(gp.p1.xPos = 400, gp.p1.yPos = 600, gp.p1.width = 70, gp.p1.height = 15);
				   gp2.p1.setBounds(gp.p1.xPos = 400, gp2.p1.yPos = 600, gp2.p1.width = 70, gp2.p1.height = 15);
				   gp3.p1.setBounds(gp3.p1.xPos = 400, gp3.p1.yPos = 600, gp3.p1.width = 70, gp3.p1.height = 15);
				   gp4.p1.setBounds(gp4.p1.xPos = 400, gp4.p1.yPos = 600, gp4.p1.width = 70, gp4.p1.height = 15);
				   gp5.p1.setBounds(gp5.p1.xPos = 400, gp5.p1.yPos = 600, gp5.p1.width = 70, gp5.p1.height = 15);
			   }
			   if(op.PaddleSize.padSize() == 2){
				   gp.p1.setBounds(gp.p1.xPos = 400, gp.p1.yPos = 600, gp.p1.width = 40, gp.p1.height = 10);
				   gp2.p1.setBounds(gp2.p1.xPos = 400, gp2.p1.yPos = 600, gp2.p1.width = 40, gp2.p1.height = 10);
				   gp3.p1.setBounds(gp3.p1.xPos = 400, gp3.p1.yPos = 600, gp3.p1.width = 40, gp3.p1.height = 10);
				   gp4.p1.setBounds(gp4.p1.xPos = 400, gp4.p1.yPos = 600, gp4.p1.width = 40, gp4.p1.height = 10);
				   gp5.p1.setBounds(gp5.p1.xPos = 400, gp5.p1.yPos = 600, gp5.p1.width = 40, gp5.p1.height = 10);

			   }
			   if(op.PaddleSize.padSize() == 3){
				   gp.p1.setBounds(gp.p1.xPos = 400, gp.p1.yPos = 600, gp.p1.width = 100, gp.p1.height = 20);
				   gp2.p1.setBounds(gp2.p1.xPos = 400, gp2.p1.yPos = 600, gp2.p1.width = 100, gp2.p1.height = 20);
				   gp3.p1.setBounds(gp3.p1.xPos = 400, gp3.p1.yPos = 600, gp3.p1.width = 100, gp3.p1.height = 20);
				   gp4.p1.setBounds(gp4.p1.xPos = 400, gp4.p1.yPos = 600, gp4.p1.width = 100, gp4.p1.height = 20);
				   gp5.p1.setBounds(gp5.p1.xPos = 400, gp5.p1.yPos = 600, gp5.p1.width = 100, gp5.p1.height = 20);

			   }
			   
			   
			   remove(op);
	             add(wp);
	             validate();
	             repaint();

	     		}
		}
	   private class ButtonPalyListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(wp);
	             add(sp);
	             validate();
	             repaint();

	         	
	     		}
		}
	   private class ButtoninstructionListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             remove(wp);
	             add(ip);
	             validate();
	             repaint();

	         	
	     		}
		}
	   private class ButtonOk1Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   remove(ip);
	             add(wp);
	             validate();
	             repaint();

	     		}
		}
	   private class ButtonQuitListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   System.exit(0);				


	         	
	     		}
		}
	   
	   private class BallTimerListener implements ActionListener {
		   public void actionPerformed(ActionEvent event){
			   gp.b1.move();
			   if(gp.p1.getBounds().intersects(gp.b1.getBounds()) )
			   { gp.b1.changeDirection();
				validate();
				repaint();}
			   
			   if (gp.b1.yPos >= getParent().getHeight() - 20 && gp.currentBall==2)
			   {
				gp.ballTimer.stop();
				JOptionPane.showMessageDialog(null, "You Lost!! 2 Balls Left");
				gp.removeBall();
				gp.b1.setLocation(100, 300);
				validate();
				repaint();
			   }
			   else if (gp.b1.yPos >= getParent().getHeight() - 20 && gp.currentBall==3)
			   {
				gp.ballTimer.stop();
				JOptionPane.showMessageDialog(null, "You Lost!! 1 Balls Left");
				gp.removeBall();
				gp.b1.setLocation(100, 300);
				validate();
				repaint();
			   }
			   else if (gp.b1.yPos >= getParent().getHeight() - 20 && gp.currentBall==3)
			   {
				gp.ballTimer.stop();
				JOptionPane.showMessageDialog(null, "You Lost!! 0 Balls Left");
				gp.removeBall();
				gp.b1.setLocation(100, 300);
				validate();
				repaint();
			   }
		   
			   for (x=0; x< 15; x++){  
				   if (gp.row1[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row1[x]);
				   
				   if (gp.row1[x]!=null){
					
				   
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				  if (gp.b1.direction==3)
				       gp.b1.direction=4;
				  if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
			   }
		   }
			   validate();
				   
				   
				   for (x=0; x< 15; x++){
				   if (gp.row2[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row2[x]);
				   if (gp.row2[x]!=null){
					  
				   
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				  if (gp.b1.direction==3)
				       gp.b1.direction=4;
				  if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
				   }
				   }
				   
				   for (x=0; x< 15; x++){
				   if (gp.row3[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row3[x]);
				   if (gp.row3[x]!=null){
					   
				  
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				  if (gp.b1.direction==3)
				       gp.b1.direction=4;
				  if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
				   }
				   }
				  
				   for (x=0; x< 15; x++){
				   if (gp.row4[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row4[x]);
				   if (gp.row4[x]!=null){
					  
				   
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				if (gp.b1.direction==3)
				       gp.b1.direction=4;
				 if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
				   }
				   }
				   
				   
				   
				   for (x=0; x< 15; x++){
					   
				   if (gp.row5[x].getBounds().intersects(gp.b1.getBounds())){
					   
				   gp.remove(gp.row5[x]);
				   
				   if (gp.row5[x]!=null){
					  
				  
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				   
				   if (gp.b1.direction==3)
				       gp.b1.direction=4;
				   if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   
				   		}
				   }
				}
				   
				    
				   for (x=0; x< 15; x++){
				   if (gp.row6[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row6[x]);
				   if (gp.row6[x]!=null){
				
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				
				   if (gp.b1.direction==3)
				       gp.b1.direction=4;
				   if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   
				   		}
				   }
			   }
				   
				   for (x=0; x< 15; x++){     
					   
					   if (gp.row7[x].getBounds().intersects(gp.b1.getBounds())){
						   	gp.remove(gp.row7[x]);
					   
						   	if (gp.row7[x]!=null) {
						   		if (gp.b1.direction==2)
						   			gp.b1.direction=1;
						   		if (gp.b1.direction==3)
						   			gp.b1.direction=4;
						   	 if (gp.b1.direction==1)
								   gp.b1.direction=2;
							  if (gp.b1.direction==4)
							       gp.b1.direction=3;
						   	}
					   	}
				   }
				   validate();
				   repaint();
			   }
		   }
	   private class BallTimer2Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event){
			   gp2.b1.move();
			   if(gp2.p1.getBounds().intersects(gp2.b1.getBounds()) )
			   { gp2.b1.changeDirection();
				validate();
				repaint();}
			   
			   if (gp2.b1.yPos >= getParent().getHeight() - 20)
			   {
				gp2.ballTimer.stop();
				JOptionPane.showMessageDialog(null, "You Lost!! 2 Balls Left");
				gp2.removeBall();
				gp2.b1.setLocation(100, 300);
				validate();
				repaint();
			   }
			   for (x=0; x< 1; x++){  
				   if (gp2.row1[x].getBounds().intersects(gp2.b1.getBounds())){
				   gp2.remove(gp2.row1[x]);
				   
				   if (gp2.row1[x]!=null){
					
				   
				   if (gp2.b1.direction==2)
					   gp2.b1.direction=1;
				  if (gp2.b1.direction==3)
				       gp2.b1.direction=4;
				  if (gp2.b1.direction==1)
					   gp2.b1.direction=2;
				  if (gp2.b1.direction==4)
				       gp2.b1.direction=3;
				   }
			   }
		   }
			   validate();
				   
				   
				   for (x=0; x< 2; x++){
				   if (gp2.row2[x].getBounds().intersects(gp2.b1.getBounds())){
				   gp2.remove(gp2.row2[x]);
				   if (gp2.row2[x]!=null){
					  
				   
				   if (gp2.b1.direction==2)
					   gp2.b1.direction=1;
				  if (gp2.b1.direction==3)
				       gp2.b1.direction=4;
				  if (gp2.b1.direction==1)
					   gp2.b1.direction=2;
				  if (gp2.b1.direction==4)
				       gp2.b1.direction=3;
				   }
				   }
				   }
				   
				   for (x=0; x< 3; x++){
				   if (gp2.row3[x].getBounds().intersects(gp2.b1.getBounds())){
				   gp2.remove(gp2.row3[x]);
				   if (gp2.row3[x]!=null){
					   
				  
				   if (gp2.b1.direction==2)
					   gp2.b1.direction=1;
				  if (gp2.b1.direction==3)
				       gp2.b1.direction=4;
				  if (gp2.b1.direction==1)
					   gp2.b1.direction=2;
				  if (gp2.b1.direction==4)
				       gp2.b1.direction=3;
				   }
				   }
				   }
				  
				   for (x=0; x< 5; x++){
				   if (gp2.row4[x].getBounds().intersects(gp2.b1.getBounds())){
				   gp.remove(gp.row4[x]);
				   if (gp2.row4[x]!=null){
					  
				   
				   if (gp2.b1.direction==2)
					   gp2.b1.direction=1;
				if (gp2.b1.direction==3)
				       gp2.b1.direction=4;
				 if (gp2.b1.direction==1)
					   gp2.b1.direction=2;
				  if (gp2.b1.direction==4)
				       gp2.b1.direction=3;
				   }
				   }
				   }
				   
				   
				   
				   for (x=0; x< 7; x++){
					   
				   if (gp2.row5[x].getBounds().intersects(gp2.b1.getBounds())){
					   
				   gp2.remove(gp2.row5[x]);
				   
				   if (gp2.row5[x]!=null){
					  
				  
				   if (gp2.b1.direction==2)
					   gp2.b1.direction=1;
				   
				   if (gp2.b1.direction==3)
				       gp2.b1.direction=4;
				   if (gp2.b1.direction==1)
					   gp2.b1.direction=2;
				  if (gp2.b1.direction==4)
				       gp2.b1.direction=3;
				   
				   		}
				   }
				}
				   
				    
				   for (x=0; x< 9; x++){
				   if (gp2.row6[x].getBounds().intersects(gp2.b1.getBounds())){
				   gp2.remove(gp2.row6[x]);
				   if (gp2.row6[x]!=null){
				
				   if (gp2.b1.direction==2)
					   gp2.b1.direction=1;
				
				   if (gp2.b1.direction==3)
				       gp2.b1.direction=4;
				   if (gp2.b1.direction==1)
					   gp2.b1.direction=2;
				  if (gp2.b1.direction==4)
				       gp2.b1.direction=3;
				   
				   		}
				   }
			   }
				   
				   for (x=0; x< 11; x++){     
					   
					   if (gp2.row7[x].getBounds().intersects(gp2.b1.getBounds())){
						   	gp.remove(gp2.row7[x]);
					   
						   	if (gp2.row7[x]!=null) {
						   		if (gp2.b1.direction==2)
						   			gp2.b1.direction=1;
						   		if (gp2.b1.direction==3)
						   			gp2.b1.direction=4;
						   	 if (gp2.b1.direction==1)
								   gp2.b1.direction=2;
							  if (gp2.b1.direction==4)
							       gp.b1.direction=3;
						   	}
					   	}
				   }
				   for (x=0; x< 9; x++){
					   if (gp2.row8[x].getBounds().intersects(gp2.b1.getBounds())){
					   gp2.remove(gp2.row8[x]);
					   if (gp2.row8[x]!=null){
						  
					   
					   if (gp2.b1.direction==2)
						   gp2.b1.direction=1;
					if (gp2.b1.direction==3)
					       gp2.b1.direction=4;
					 if (gp2.b1.direction==1)
						   gp2.b1.direction=2;
					  if (gp2.b1.direction==4)
					       gp2.b1.direction=3;
					   }
					   }
					   }
				   for (x=0; x< 7; x++){
					   if (gp2.row9[x].getBounds().intersects(gp2.b1.getBounds())){
					   gp2.remove(gp2.row9[x]);
					   if (gp2.row9[x]!=null){
						  
					   
					   if (gp2.b1.direction==2)
						   gp2.b1.direction=1;
					if (gp2.b1.direction==3)
					       gp2.b1.direction=4;
					 if (gp2.b1.direction==1)
						   gp2.b1.direction=2;
					  if (gp2.b1.direction==4)
					       gp2.b1.direction=3;
					   }
					   }
					   }
				   for (x=0; x< 5; x++){
					   if (gp2.row10[x].getBounds().intersects(gp2.b1.getBounds())){
					   gp2.remove(gp2.row10[x]);
					   if (gp2.row10[x]!=null){
						  
					   
					   if (gp2.b1.direction==2)
						   gp2.b1.direction=1;
					if (gp2.b1.direction==3)
					       gp2.b1.direction=4;
					 if (gp2.b1.direction==1)
						   gp2.b1.direction=2;
					  if (gp2.b1.direction==4)
					       gp2.b1.direction=3;
					   }
					   }
					   }
				   for (x=0; x< 3; x++){
					   if (gp2.row11[x].getBounds().intersects(gp2.b1.getBounds())){
					   gp2.remove(gp2.row11[x]);
					   if (gp2.row11[x]!=null){
						  
					   
					   if (gp2.b1.direction==2)
						   gp2.b1.direction=1;
					if (gp2.b1.direction==3)
					       gp2.b1.direction=4;
					 if (gp2.b1.direction==1)
						   gp2.b1.direction=2;
					  if (gp2.b1.direction==4)
					       gp2.b1.direction=3;
					   }
					   }
					   }
				   for (x=0; x< 2; x++){
					   if (gp2.row12[x].getBounds().intersects(gp2.b1.getBounds())){
					   gp2.remove(gp2.row12[x]);
					   if (gp2.row12[x]!=null){
						  
					   
					   if (gp2.b1.direction==2)
						   gp2.b1.direction=1;
					if (gp2.b1.direction==3)
					       gp2.b1.direction=4;
					 if (gp2.b1.direction==1)
						   gp2.b1.direction=2;
					  if (gp2.b1.direction==4)
					       gp2.b1.direction=3;
					   }
					   }
					   }
				   for (x=0; x< 1; x++){
					   if (gp2.row13[x].getBounds().intersects(gp2.b1.getBounds())){
					   gp2.remove(gp2.row13[x]);
					   if (gp2.row13[x]!=null){
						  
					   
					   if (gp2.b1.direction==2)
						   gp2.b1.direction=1;
					if (gp2.b1.direction==3)
					       gp2.b1.direction=4;
					 if (gp2.b1.direction==1)
						   gp2.b1.direction=2;
					  if (gp2.b1.direction==4)
					       gp2.b1.direction=3;
					   }
					   }
					   }
				   validate();
				   repaint();
			   }
		   }
	   
	   private class BallTimer3Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event){
			   gp3.b1.move();
			   if(gp3.p1.getBounds().intersects(gp3.b1.getBounds()) )
			   { gp3.b1.changeDirection();
				validate();
				repaint();}
			   
			   if (gp3.b1.yPos >= getParent().getHeight() - 20)
			   {
				gp3.ballTimer.stop();
				JOptionPane.showMessageDialog(null, "You Lost!! 2 Balls Left");
				gp3.removeBall();
				gp3.b1.setLocation(100, 300);
				validate();
				repaint();
			   }
			   for (x=0; x< 15; x++){  
				   if (gp3.row1[x].getBounds().intersects(gp3.b1.getBounds())){
				   gp3.remove(gp3.row1[x]);
				   
				   if (gp3.row1[x]!=null){
					
				   
				   if (gp3.b1.direction==2)
					   gp3.b1.direction=1;
				  if (gp3.b1.direction==3)
				       gp3.b1.direction=4;
				  if (gp3.b1.direction==1)
					   gp3.b1.direction=2;
				  if (gp3.b1.direction==4)
				       gp3.b1.direction=3;
				   }
			   }
		   }
			   validate();
				   
				   
				   for (x=0; x< 15; x++){
				   if (gp3.row2[x].getBounds().intersects(gp3.b1.getBounds())){
				   gp3.remove(gp3.row2[x]);
				   if (gp3.row2[x]!=null){
					  
				   
				   if (gp3.b1.direction==2)
					   gp3.b1.direction=1;
				  if (gp3.b1.direction==3)
				       gp3.b1.direction=4;
				  if (gp3.b1.direction==1)
					   gp3.b1.direction=2;
				  if (gp3.b1.direction==4)
				       gp3.b1.direction=3;
				   }
				   }
				   }
				   
				   for (x=0; x< 3; x++){
				   if (gp3.row3a[x].getBounds().intersects(gp3.b1.getBounds())){
				   gp3.remove(gp3.row3a[x]);
				   if (gp3.row3a[x]!=null){
					   
				  
				   if (gp3.b1.direction==2)
					   gp3.b1.direction=1;
				  if (gp3.b1.direction==3)
				       gp3.b1.direction=4;
				  if (gp3.b1.direction==1)
					   gp3.b1.direction=2;
				  if (gp3.b1.direction==4)
				       gp3.b1.direction=3;
				   }
				   }
				   }
				   for (x=0; x< 3; x++){
					   if (gp3.row3b[x].getBounds().intersects(gp3.b1.getBounds())){
					   gp3.remove(gp3.row3b[x]);
					   if (gp3.row3b[x]!=null){
						   
					  
					   if (gp3.b1.direction==2)
						   gp3.b1.direction=1;
					  if (gp3.b1.direction==3)
					       gp3.b1.direction=4;
					  if (gp3.b1.direction==1)
						   gp3.b1.direction=2;
					  if (gp3.b1.direction==4)
					       gp3.b1.direction=3;
					   }
					   }
					   }
				   for (x=0; x< 3; x++){
					   if (gp3.row3c[x].getBounds().intersects(gp3.b1.getBounds())){
					   gp3.remove(gp3.row3c[x]);
					   if (gp3.row3c[x]!=null){
						   
					  
					   if (gp3.b1.direction==2)
						   gp3.b1.direction=1;
					  if (gp3.b1.direction==3)
					       gp3.b1.direction=4;
					  if (gp3.b1.direction==1)
						   gp3.b1.direction=2;
					  if (gp3.b1.direction==4)
					       gp3.b1.direction=3;
					   }
					   }
					   }
				  
				   for (x=0; x< 3; x++){
				   if (gp3.row4a[x].getBounds().intersects(gp3.b1.getBounds())){
				   gp3.remove(gp3.row4a[x]);
				   if (gp3.row4a[x]!=null){
					  
				   
				   if (gp3.b1.direction==2)
					   gp3.b1.direction=1;
				if (gp3.b1.direction==3)
				       gp3.b1.direction=4;
				 if (gp3.b1.direction==1)
					   gp3.b1.direction=2;
				  if (gp3.b1.direction==4)
				       gp3.b1.direction=3;
				   }
				   }
				   }
				   for (x=0; x< 3; x++){
					   if (gp3.row4b[x].getBounds().intersects(gp3.b1.getBounds())){
					   gp3.remove(gp3.row4b[x]);
					   if (gp3.row4b[x]!=null){
						  
					   
					   if (gp3.b1.direction==2)
						   gp3.b1.direction=1;
					if (gp3.b1.direction==3)
					       gp3.b1.direction=4;
					 if (gp3.b1.direction==1)
						   gp3.b1.direction=2;
					  if (gp3.b1.direction==4)
					       gp3.b1.direction=3;
					   }
					   }
					   }
				   for (x=0; x< 3; x++){
					   if (gp3.row4c[x].getBounds().intersects(gp3.b1.getBounds())){
					   gp3.remove(gp3.row4c[x]);
					   if (gp3.row4c[x]!=null){
						  
					   
					   if (gp3.b1.direction==2)
						   gp3.b1.direction=1;
					if (gp3.b1.direction==3)
					       gp3.b1.direction=4;
					 if (gp3.b1.direction==1)
						   gp3.b1.direction=2;
					  if (gp3.b1.direction==4)
					       gp3.b1.direction=3;
					   }
					   }
					   }
				   
				   
				   
				   for (x=0; x< 3; x++){
					   
				   if (gp3.row5a[x].getBounds().intersects(gp3.b1.getBounds())){
					   
				   gp3.remove(gp3.row5a[x]);
				   
				   if (gp3.row5a[x]!=null){
					  
				  
				   if (gp3.b1.direction==2)
					   gp3.b1.direction=1;
				   
				   if (gp3.b1.direction==3)
				       gp3.b1.direction=4;
				   if (gp3.b1.direction==1)
					   gp3.b1.direction=2;
				  if (gp3.b1.direction==4)
				       gp3.b1.direction=3;
				   
				   		}
				   }
				}
				 
				   for (x=0; x< 3; x++){
					   
					   if (gp3.row5b[x].getBounds().intersects(gp3.b1.getBounds())){
						   
					   gp3.remove(gp3.row5b[x]);
					   
					   if (gp3.row5b[x]!=null){
						  
					  
					   if (gp3.b1.direction==2)
						   gp3.b1.direction=1;
					   
					   if (gp3.b1.direction==3)
					       gp3.b1.direction=4;
					   if (gp3.b1.direction==1)
						   gp3.b1.direction=2;
					  if (gp3.b1.direction==4)
					       gp3.b1.direction=3;
					   
					   		}
					   }
					}
				   for (x=0; x< 3; x++){
					   
					   if (gp3.row5c[x].getBounds().intersects(gp3.b1.getBounds())){
						   
					   gp3.remove(gp3.row5c[x]);
					   
					   if (gp3.row5c[x]!=null){
						  
					  
					   if (gp3.b1.direction==2)
						   gp3.b1.direction=1;
					   
					   if (gp3.b1.direction==3)
					       gp3.b1.direction=4;
					   if (gp3.b1.direction==1)
						   gp3.b1.direction=2;
					  if (gp3.b1.direction==4)
					       gp3.b1.direction=3;
					   
					   		}
					   }
					}
				    
				   for (x=0; x< 15; x++){
				   if (gp3.row6[x].getBounds().intersects(gp3.b1.getBounds())){
				   gp3.remove(gp3.row6[x]);
				   if (gp3.row6[x]!=null){
				
				   if (gp3.b1.direction==2)
					   gp3.b1.direction=1;
				
				   if (gp3.b1.direction==3)
				       gp3.b1.direction=4;
				   if (gp3.b1.direction==1)
					   gp3.b1.direction=2;
				  if (gp3.b1.direction==4)
				       gp3.b1.direction=3;
				   
				   		}
				   }
			   }
				   
				   for (x=0; x< 15; x++){     
					   
					   if (gp3.row7[x].getBounds().intersects(gp3.b1.getBounds())){
						   	gp3.remove(gp3.row7[x]);
					   
						   	if (gp.row7[x]!=null) {
						   		if (gp3.b1.direction==2)
						   			gp3.b1.direction=1;
						   		if (gp3.b1.direction==3)
						   			gp3.b1.direction=4;
						   	 if (gp3.b1.direction==1)
								   gp3.b1.direction=2;
							  if (gp3.b1.direction==4)
							       gp3.b1.direction=3;
						   	}
					   	}
				   }
				   validate();
				   repaint();
			   }
		   }
	   private class BallTimer4Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event){
			   gp4.b1.move();
			   if(gp4.p1.getBounds().intersects(gp4.b1.getBounds()) )
			   { gp4.b1.changeDirection();
				validate();
				repaint();}
			   
			   if (gp4.b1.yPos >= getParent().getHeight() - 20)
			   {
				gp4.ballTimer.stop();
				JOptionPane.showMessageDialog(null, "You Lost!! 2 Balls Left");
				gp4.removeBall();
				gp4.b1.setLocation(100, 300);
				validate();
				repaint();
			   }
			   for (x=0; x< 15; x++){  
				   if (gp.row1[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row1[x]);
				   
				   if (gp.row1[x]!=null){
					
				   
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				  if (gp.b1.direction==3)
				       gp.b1.direction=4;
				  if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
			   }
		   }
			   validate();
				   
				   
				   for (x=0; x< 15; x++){
				   if (gp.row2[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row2[x]);
				   if (gp.row2[x]!=null){
					  
				   
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				  if (gp.b1.direction==3)
				       gp.b1.direction=4;
				  if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
				   }
				   }
				   
				   for (x=0; x< 15; x++){
				   if (gp.row3[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row3[x]);
				   if (gp.row3[x]!=null){
					   
				  
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				  if (gp.b1.direction==3)
				       gp.b1.direction=4;
				  if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
				   }
				   }
				  
				   for (x=0; x< 15; x++){
				   if (gp.row4[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row4[x]);
				   if (gp.row4[x]!=null){
					  
				   
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				if (gp.b1.direction==3)
				       gp.b1.direction=4;
				 if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
				   }
				   }
				   
				   
				   
				   for (x=0; x< 15; x++){
					   
				   if (gp.row5[x].getBounds().intersects(gp.b1.getBounds())){
					   
				   gp.remove(gp.row5[x]);
				   
				   if (gp.row5[x]!=null){
					  
				  
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				   
				   if (gp.b1.direction==3)
				       gp.b1.direction=4;
				   if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   
				   		}
				   }
				}
				   
				    
				   for (x=0; x< 15; x++){
				   if (gp.row6[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row6[x]);
				   if (gp.row6[x]!=null){
				
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				
				   if (gp.b1.direction==3)
				       gp.b1.direction=4;
				   if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   
				   		}
				   }
			   }
				   
				   for (x=0; x< 15; x++){     
					   
					   if (gp.row7[x].getBounds().intersects(gp.b1.getBounds())){
						   	gp.remove(gp.row7[x]);
					   
						   	if (gp.row7[x]!=null) {
						   		if (gp.b1.direction==2)
						   			gp.b1.direction=1;
						   		if (gp.b1.direction==3)
						   			gp.b1.direction=4;
						   	 if (gp.b1.direction==1)
								   gp.b1.direction=2;
							  if (gp.b1.direction==4)
							       gp.b1.direction=3;
						   	}
					   	}
				   }
				   validate();
				   repaint();
			   }
		   }
	   private class BallTimer5Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event){
			   gp5.b1.move();
			   if(gp5.p1.getBounds().intersects(gp5.b1.getBounds()) )
			   { gp5.b1.changeDirection();
				validate();
				repaint();}
			   
			   if (gp5.b1.yPos >= getParent().getHeight() - 20)
			   {
				gp5.ballTimer.stop();
				JOptionPane.showMessageDialog(null, "You Lost!! 2 Balls Left");
				gp5.removeBall();
				gp5.b1.setLocation(100, 300);
				validate();
				repaint();
			   }
			   for (x=0; x< 15; x++){  
				   if (gp.row1[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row1[x]);
				   
				   if (gp.row1[x]!=null){
					
				   
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				  if (gp.b1.direction==3)
				       gp.b1.direction=4;
				  if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
			   }
		   }
			   validate();
				   
				   
				   for (x=0; x< 15; x++){
				   if (gp.row2[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row2[x]);
				   if (gp.row2[x]!=null){
					  
				   
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				  if (gp.b1.direction==3)
				       gp.b1.direction=4;
				  if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
				   }
				   }
				   
				   for (x=0; x< 15; x++){
				   if (gp.row3[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row3[x]);
				   if (gp.row3[x]!=null){
					   
				  
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				  if (gp.b1.direction==3)
				       gp.b1.direction=4;
				  if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
				   }
				   }
				  
				   for (x=0; x< 15; x++){
				   if (gp.row4[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row4[x]);
				   if (gp.row4[x]!=null){
					  
				   
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				if (gp.b1.direction==3)
				       gp.b1.direction=4;
				 if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   }
				   }
				   }
				   
				   
				   
				   for (x=0; x< 15; x++){
					   
				   if (gp.row5[x].getBounds().intersects(gp.b1.getBounds())){
					   
				   gp.remove(gp.row5[x]);
				   
				   if (gp.row5[x]!=null){
					  
				  
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				   
				   if (gp.b1.direction==3)
				       gp.b1.direction=4;
				   if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   
				   		}
				   }
				}
				   
				    
				   for (x=0; x< 15; x++){
				   if (gp.row6[x].getBounds().intersects(gp.b1.getBounds())){
				   gp.remove(gp.row6[x]);
				   if (gp.row6[x]!=null){
				
				   if (gp.b1.direction==2)
					   gp.b1.direction=1;
				
				   if (gp.b1.direction==3)
				       gp.b1.direction=4;
				   if (gp.b1.direction==1)
					   gp.b1.direction=2;
				  if (gp.b1.direction==4)
				       gp.b1.direction=3;
				   
				   		}
				   }
			   }
				   
				   for (x=0; x< 15; x++){     
					   
					   if (gp.row7[x].getBounds().intersects(gp.b1.getBounds())){
						   	gp.remove(gp.row7[x]);
					   
						   	if (gp.row7[x]!=null) {
						   		if (gp.b1.direction==2)
						   			gp.b1.direction=1;
						   		if (gp.b1.direction==3)
						   			gp.b1.direction=4;
						   	 if (gp.b1.direction==1)
								   gp.b1.direction=2;
							  if (gp.b1.direction==4)
							       gp.b1.direction=3;
						   	}
					   	}
				   }
				   validate();
				   repaint();
			   }
		   }
	   private class PaddleListener implements KeyListener {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == e.VK_Z){ 
					gp.p1.moveLeft();
				   }
				   else if(e.getKeyCode() == e.VK_M){
					gp.p1.moveRight();
				   }
				   validate();
				   repaint();

			}

			public void keyReleased(KeyEvent e) {
			}

			public void keyTyped(KeyEvent e) {
			}
		}
	   private class Paddle2Listener implements KeyListener {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == e.VK_Z){ 
					gp2.p1.moveLeft();
				   }
				   else if(e.getKeyCode() == e.VK_M){
					gp2.p1.moveRight();
				   }
				   validate();
				   repaint();

			}

			public void keyReleased(KeyEvent e) {
			}

			public void keyTyped(KeyEvent e) {
			}
		}
	   
	   private class Paddle3Listener implements KeyListener {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == e.VK_Z){ 
					gp3.p1.moveLeft();
				   }
				   else if(e.getKeyCode() == e.VK_M){
					gp3.p1.moveRight();
				   }
				   validate();
				   repaint();

			}
			public void keyReleased(KeyEvent e) {
			}

			public void keyTyped(KeyEvent e) {
			}
		}
	   private class Paddle4Listener implements KeyListener {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == e.VK_Z){ 
					gp4.p1.moveLeft();
				   }
				   else if(e.getKeyCode() == e.VK_M){
					gp4.p1.moveRight();
				   }
				   validate();
				   repaint();

			}
			public void keyReleased(KeyEvent e) {
			}

			public void keyTyped(KeyEvent e) {
			}
		}
	   private class Paddle5Listener implements KeyListener {
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode() == e.VK_Z){ 
					gp5.p1.moveLeft();
				   }
				   else if(e.getKeyCode() == e.VK_M){
					gp5.p1.moveRight();
				   }
				   validate();
				   repaint();

			}
			public void keyReleased(KeyEvent e) {
			}

			public void keyTyped(KeyEvent e) {
			}
		}
	   

	   private class ButtonServeListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   gp.ballTimer.start();
	             
	             validate();
	             repaint();
		   }
	   }
	   private class ButtonServe2Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   gp2.ballTimer.start();
	             
	             validate();
	             repaint();
		   }
	   }
	   private class ButtonServe3Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   gp3.ballTimer.start();
			   
	             
	             validate();
	             repaint();
		   }
	   }
	   private class ButtonServe4Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   gp4.ballTimer.start();
			   
	             
	             validate();
	             repaint();
		   }
	   }
	   private class ButtonServe5Listener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   gp5.ballTimer.start();
			   
	             
	             validate();
	             repaint();
		   }
	   }
	   private class ButtonPauseListener implements ActionListener{
		   public void actionPerformed(ActionEvent event) {
			   gp.ballTimer.stop();
			   
	             
	             validate();
	             repaint();
		   }
		   
	   }
	   private class ButtonPause2Listener implements ActionListener{
		   public void actionPerformed(ActionEvent event) {
			   gp2.ballTimer.stop();
			   
	             
	             validate();
	             repaint();
		   }
		   
	   }
	   private class ButtonPause3Listener implements ActionListener{
		   public void actionPerformed(ActionEvent event) {
			   gp3.ballTimer.stop();
			   
	             
	             validate();
	             repaint();
		   }
		   
	   }
	   private class ButtonPause4Listener implements ActionListener{
		   public void actionPerformed(ActionEvent event) {
			   gp4.ballTimer.stop();
			   
	             
	             validate();
	             repaint();
		   }
		   
	   }
	   private class ButtonPause5Listener implements ActionListener{
		   public void actionPerformed(ActionEvent event) {
			   gp5.ballTimer.stop();
			   
	             
	             validate();
	             repaint();
		   }
		   
	   }
	   private class ButtonplayListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	             JOptionPane.showMessageDialog(null,"Press Play in the Welcome Screen"+"\nand then Choose the preffered shape \nPress Serve to start playing."+"\nEnjoy!");
	             validate();
	             repaint();

	         	
	     		}
		} 
	   private class ButtonrulesListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
		          JOptionPane.showMessageDialog(null,"Press Z to move Left"+"\nPress M to move Right"+"\nIn order to win the game hit all of the Bricks.\nPress Back to go to the previuos screen\nPress Pause to stop the game and to start playing again press Serve");

		          validate();
		          repaint();

		         	
		     		}
			}
	   private class ButtonBallIconsListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
			   	  JOptionPane.showMessageDialog(null,"Press Options in the Welcome Screen"+"\nthen Choose the preferred ball Icons from Ball Icons option.");

			      validate();
			      repaint();

			         	
			     		}
				}
	   private class ButtonBallSpeedListener implements ActionListener {
		   public void actionPerformed(ActionEvent event) {
	               JOptionPane.showMessageDialog(null,"Press Option in the Welcome Screen"+"\nthen Choose the preferred Speed from Speed Option.");
	               validate();
			       repaint();

				         	
				     		}
					}
	   private class ButtonPaddleSizeListener implements ActionListener {
		  public void actionPerformed(ActionEvent event) {
			  	    JOptionPane.showMessageDialog(null,"Press Options in the Welcome Screen"+"\nthen Choose the preferred Paddle Size from Paddle Size option.");
			  	    validate();
			  	    repaint();

					         	
					     		}
						} 
	   private class ButtonSoundListener implements ActionListener {
		  public void actionPerformed(ActionEvent event) {
			        JOptionPane.showMessageDialog(null,"Press Options in the Welcome Screen"+"\nthen Choose the preferred music from Music option."+"\nNote: You can turn off the music by choosing the OFF Music Option.");
			        validate();
			        repaint();	         	
						     	}
							}

	
}// end class

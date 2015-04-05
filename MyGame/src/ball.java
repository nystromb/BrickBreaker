import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ball extends JButton {

	/****************************************************
	 * Attributes
	 ***************************************************/
	int direction;
	int xPos;
	int yPos;
	int width = 20;
	int height = 20;
	int jump;
	int imageOption;
	



	/****************************************************
	 * Constructor
	 ***************************************************/
	public ball(){
		direction = 1;
		jump = 3;
		imageOption = 1;
		xPos = 100;
		yPos = 300;
		
		setBounds(xPos, yPos, width, height);
		setLocation(xPos,yPos);
		
		setImage();
		
		setBorder(null);
		setContentAreaFilled(false);
	}
	
	public void setImage() {
		   ImageIcon image = null;
		   if(imageOption == 1){
			image = new ImageIcon("images/pink.png");
			setBounds(xPos, yPos, height = 20, width = 20);
		   }
		   else if(imageOption == 2){
				image = new ImageIcon("images/ball2.png");
				setBounds(xPos, yPos, height = 40, width = 40);
				}
		   else if(imageOption == 3){
				image = new ImageIcon("images/ball3.png");
				setBounds(xPos, yPos, height = 40, width = 40);
				}
		
		   
		   setIcon(image);
		}
	
	public void move(){
		
		//	 getParent().getHeight();	 
		//	 getParent().getWidth();
			 
			if (direction == 1)	{
				xPos+=jump;
				yPos+=jump;
			}
			if (direction == 2)	{
				xPos+=jump;
				yPos-=jump;
			}
			if (direction == 3)	{
				xPos-=jump;
				yPos-=jump;
			}
			if (direction == 4)	{
				xPos-=jump;
				yPos+=jump;
			}
		
			if (yPos == 0){	
				 if (direction == 2)
				 direction = 1;
				 if (direction == 3)
					 direction = 4;
				}
			
			if (yPos >= getParent().getHeight() - 20)	{
				if (direction == 1)
					direction = 2;
				if (direction == 4)
					direction = 3;
			}
			
			if (xPos <= 0){	
				if (direction == 3)
					direction = 2;
				if (direction == 4)
					direction = 1;
				}
			
			if (xPos >= getParent().getWidth() - 20){		
				if (direction == 2)
					direction = 3;
				if (direction == 1)
					direction = 4;
				}
			
			setLocation(xPos, yPos);
		
		}
	public void changeDirection() {

		 if(direction == 4)	{
			direction = 3;
		 }
		else if (direction == 1){
			direction = 2;
		}
		else if (direction == 3)
		{
			direction = 2;
		}
		else if (direction == 2)
		{
			direction = 3;
		}

	}

	
	
	}

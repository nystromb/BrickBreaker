import javax.swing.ImageIcon;
import javax.swing.JButton;

public class paddle extends JButton {

	/****************************************************
	 * Attributes
	 ***************************************************/
	int xPos;
	int yPos;
	private int jump = 40;
	int width = 70;
	int height = 15;


	/****************************************************
	 * Constructor
	 ***************************************************/
	public paddle() {
		super();
		jump = 40;
		xPos = 100;
		yPos = 350;
			
		setBounds(xPos, yPos, width, height);
		
		

		}


	/****************************************************
	 * Gets and Sets
	 ***************************************************/

	/****************************************************
	 * Methods
	 ***************************************************/
	public void setPosition(){
		xPos = 400;
		yPos = 600;
	   	
		setBounds(xPos, yPos, width, height);
		{
			
		}
		
	}

	public void moveLeft(){
			if (xPos > 0){
			xPos = xPos - jump;
		    	setLocation(xPos, yPos);
			}
		    	
		}


		public void moveRight() {
			if(xPos < getParent().getWidth() - width){
			xPos = xPos + jump;
			setLocation(xPos, yPos);
			}
			
			
		}
		
	

	
} // end of class
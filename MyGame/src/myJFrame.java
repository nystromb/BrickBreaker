import javax.swing.JFrame;


public class myJFrame extends JFrame {

	/****************************************************
	 * Attributes
	 ***************************************************/
	backPanel mjp;

	/****************************************************
	 * Constructor
	 ***************************************************/
	public myJFrame() {
		super("My Game");

		mjp = new backPanel();
		add(mjp, "Center");

		setSize(900, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	} // end of constructor

	/****************************************************
	 * Methods
	 ***************************************************/
	
} // end of class

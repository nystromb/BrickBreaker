import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class Sounds extends JPanel{
	private JRadioButton sound1;
	private JRadioButton sound2;
	private JRadioButton off;
	private ButtonGroup bg;
	
	public Sounds()
	{
		setLayout(new GridLayout(3,1));
		
		
		sound1= new JRadioButton("Sound1",true);
		sound1.setOpaque(false);
		sound1.setForeground(Color.WHITE);
		sound1.setFont(new Font("helvetica", Font.BOLD, 20));
		sound2= new JRadioButton("Sound2");
		sound2.setForeground(Color.WHITE);;
		sound2.setOpaque(false);
		sound2.setFont(new Font("helvetica", Font.BOLD, 20));
		off= new JRadioButton("Off");
		off.setForeground(Color.WHITE);
		off.setOpaque(false);
		off.setFont(new Font("helvetica", Font.BOLD, 20));
		
		 bg = new ButtonGroup();
		 bg.add(sound1);
		 bg.add(sound2);
		 bg.add(off);
		 
	
		 
		 add(sound1);
		 add(sound2);
		 add(off);
	}

}

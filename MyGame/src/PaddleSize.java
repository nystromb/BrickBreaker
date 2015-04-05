import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


public class PaddleSize extends JPanel{
	private JRadioButton size1,size2,size3;
	private ButtonGroup bg;
	int result = 0;

	
	
	public PaddleSize()
	{
		setLayout(new GridLayout(3,1));
		
		
		size1 = new JRadioButton("Normal", true);
		size1.setOpaque(false);
		size1.setForeground(Color.WHITE);
		size1.setFont(new Font("helvetica", Font.BOLD, 20));
		
		size2 = new JRadioButton("Small");
		size2.setOpaque(false);
		size2.setForeground(Color.WHITE);
		size2.setFont(new Font("helvetica", Font.BOLD, 20));
		
		size3 = new JRadioButton("Large");
		size3.setOpaque(false);
		size3.setForeground(Color.WHITE);
		size3.setFont(new Font("helvetica", Font.BOLD, 20));
		
		bg= new ButtonGroup();
		bg.add(size1);
		bg.add(size2);
		bg.add(size3);
		
		
		
		add(size1);
		add(size2);
		add(size3);


	}
	public int padSize()
	{
		if(size1.isSelected())
		{
			result= 1;
		}
		if(size2.isSelected())
		{
			result = 2;
		}
		if (size3.isSelected())
		{
			result= 3;
		}
		return result;
	}
	

}

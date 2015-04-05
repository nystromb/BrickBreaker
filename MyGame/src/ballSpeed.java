import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SpringLayout;


public class ballSpeed extends JPanel {
	JSlider slider;
	
	public ballSpeed(){
		super();
		setLayout(new GridLayout(1,1));
		
		slider = new JSlider(JSlider.VERTICAL, 1, 3, 2);
		slider.setFont(new Font("helvetica", Font.BOLD, 20));
		
	
		slider.setMajorTickSpacing(1);
		slider.setPaintTicks(true);
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setSize(200, 300);
		slider.setOpaque(false);
		slider.setForeground(Color.WHITE);
	
		add(slider);
	}
	public int getSpeed()
	{
		return slider.getValue();
	}
}

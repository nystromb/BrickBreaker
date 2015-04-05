import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ScorePanel extends JPanel {
	JLabel labelScore;
	JButton Serve;
	
	public ScorePanel(){
		super();
		setBackground(Color.black);
		setPreferredSize(new Dimension(50,70));
		setLayout(new BorderLayout());
		
		
		
		labelScore = new JLabel("0");
		labelScore.setHorizontalAlignment(JLabel.CENTER);
		labelScore.setFont(new Font("helvetica", Font.BOLD, 40));
		labelScore.setForeground(Color.yellow);
		add(labelScore, BorderLayout.CENTER);
		
		Serve = new JButton("Serve");
		Serve.setPreferredSize(new Dimension(100,100));
		Serve.setVerticalAlignment(JButton.CENTER);
		Serve.setFont(new Font("helvetica", Font.BOLD, 28));
		add(Serve, BorderLayout.SOUTH);
		
		
		
	}
	public void incrementScore()
	{
	
	}
}

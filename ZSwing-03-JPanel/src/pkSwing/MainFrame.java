package pkSwing;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	
	private JFrame frame;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		this.frame.setLayout(new BorderLayout(10,5));
		this.frame.setTitle("Java Swing JPanel Demo");
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null);
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
		
		panel.setBackground(Color.RED);
		
		Button button1 = new Button("Button 1");
		panel.add(button1);
		
		Button button2 = new Button("Button 2");
		panel.add(button2);
		
		Button button3 = new Button("Button 3");
		panel.add(button3);
		
		//Genéralement, c'Est mieux de laisser l'Algorythme décider
		//panel.setPreferredSize(new Dimension(250, 250));
		
		frame.add(panel, BorderLayout.NORTH);
		
		this.frame.setVisible(true);
	}

}

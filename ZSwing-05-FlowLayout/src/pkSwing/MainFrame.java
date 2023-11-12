package pkSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame {
	
	private JFrame frame;
	private JPanel panel;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("FlowLayout Demo");
		
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 5));
		panel.setBackground(Color.PINK);
		
		for(int i = 1 ; i <= 5 ; i++) {
			JButton button = new JButton("Button " + i);
			panel.add(button);
		}
		
		this.frame.setLayout(new BorderLayout());
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		frame.setMinimumSize(new Dimension(400, 400));
		this.frame.setLocationRelativeTo(null);
		
		frame.add(panel, BorderLayout.NORTH);
		
	}
	
	public void show() {
		this.frame.setVisible(true);
	}

}

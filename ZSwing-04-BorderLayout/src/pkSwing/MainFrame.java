package pkSwing;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainFrame {
	
	private JFrame frame;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("BorderPane Demo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLayout(new BorderLayout(5, 5));
		
		frame.add(new JButton("NORTH"), BorderLayout.NORTH);
		frame.add(new JButton("WEST"), BorderLayout.WEST);
		frame.add(new JButton("EAST"), BorderLayout.EAST);
		frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
		frame.add(new JButton("CENTER"), BorderLayout.CENTER);
		
		this.frame.setLocationRelativeTo(null);
	}
	
	public void show() {
		this.frame.setVisible(true);
	}

}

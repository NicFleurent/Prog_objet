package pkSwing;

import java.awt.GridLayout;

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
		this.frame.setTitle("GridLayout Demo");
		
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null);
		
		panel = new JPanel(new GridLayout(5, 0, 10, 10));
		
		for(int i = 1 ; i <= 30 ; i++) {
			JButton button = new JButton("Button " + i);
			panel.add(button);
		}
		
		frame.add(panel);
		
		frame.pack();
		
	}
	
	public void show() {
		this.frame.setVisible(true);
	}

}

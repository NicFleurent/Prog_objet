package pkSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JTextField textField;
	private JButton button;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("ActionListener Demo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		frame.setLayout(new BorderLayout(10, 10));
		this.frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		label = new JLabel("Enter your name");
		textField = new JTextField(20);
		button = new JButton("Save");
		
//		button.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("Button clicked");
//				
//			}
//			
//		});
		
		panel.add(label);
		panel.add(textField);
		panel.add(button);
		
		frame.add(panel, BorderLayout.CENTER);
		
		this.frame.setVisible(true);
		
	}

}

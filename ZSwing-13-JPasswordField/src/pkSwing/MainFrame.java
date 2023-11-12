package pkSwing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class MainFrame {
	
	private JFrame frame;

	private JLabel label;
	private JPasswordField passwordField;
	private JButton button;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JPasswordField Demo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(500, 300);
		frame.setLayout(new BorderLayout(10, 10));
		this.frame.setLocationRelativeTo(null);
		
		FlowLayout layout = new FlowLayout();
		layout.setAlignment(FlowLayout.LEFT);
		layout.setHgap(10);
		layout.setVgap(10);
		
		frame.setLayout(layout);
		
		label = new JLabel("Enter password: ");
		
		passwordField = new JPasswordField(10);
		
		//Met ce text par defaut
		passwordField.setText("letmecomein");
		
		passwordField.setEchoChar('#');
		
		button = new JButton("Check");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				char[] pf = passwordField.getPassword();
				String value = new String(pf);
				System.out.println("Password: " + value);
				
			}
			
		});
		
		frame.add(label);
		frame.add(passwordField);
		frame.add(button);
	}

	public void show() {
		this.frame.setVisible(true);
	}

}

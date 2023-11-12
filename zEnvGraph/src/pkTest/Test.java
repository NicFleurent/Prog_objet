package pkTest;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class Test extends JFrame implements ActionListener {
	
	static JTextField textField;
	
	static JFrame frame;
	
	static JPanel panel;
	
	static JButton button1;
	
	static JLabel label;
	
	Test(){
		
	}

	public static void main(String[] args) {
		
		frame = new JFrame("Test Javax.Swing");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 500);
		frame.setLayout(new BorderLayout(10, 10));
		frame.setLocationRelativeTo(null);
		
		label = new JLabel("panel label");
		
		button1 = new JButton("submit");
		
		Test test = new Test();
		
		button1.addActionListener(test);
		
		textField = new JTextField(16);
		
		//JPanel panel = new JPanel(new BorderLayout());
		JPanel panel = new JPanel();
		//panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
		
		panel.add(textField);
		panel.add(button1);
		panel.add(label);
		
		//button1.addActionListener(l);
		
		//panel.setBackground(Color.red);
		
		//button.setBounds(150, 200, 220, 50);
		
		frame.add(panel);
		
		frame.setSize(500, 500);
		//frame.setLayout(null);
		//frame.setVisible(true);
		
		frame.setVisible(true);

	}
	
	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if(s.equals("submit")) {
			label.setText(textField.getText());
			
			textField.setText(" ");
			
			
		}
	}

}

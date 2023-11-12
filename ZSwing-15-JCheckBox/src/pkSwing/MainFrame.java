package pkSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;

public class MainFrame {
	
	private JFrame frame;
	private JPanel panel;
	private JCheckBox checkBox;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JCheckBox Demo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		frame.setLayout(new BorderLayout(10, 10));
		this.frame.setLocationRelativeTo(null);
		
		//Change Font size for menu and menu item
		Font f = new Font("sans-serif", Font.PLAIN, 24);
		UIManager.put("CheckBox.font", f);
		
		panel = new JPanel();
		
		checkBox = new JCheckBox();
		checkBox.setText("CheckBox");
		checkBox.setMnemonic(KeyEvent.VK_C);
		
		System.out.println(checkBox.getText());
		
		panel.add(checkBox);
		
		frame.add(panel);
		
	}

	public void show() {
		this.frame.setVisible(true);
	}

}

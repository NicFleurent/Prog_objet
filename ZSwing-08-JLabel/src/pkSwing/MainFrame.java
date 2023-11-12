package pkSwing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainFrame {
	
	private JFrame frame;
	private JPanel panel;
	private JLabel label;
	private JButton button;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JLabel Demo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		panel.setBackground(Color.GRAY);
		frame.add(panel, BorderLayout.NORTH);
		
		label = new JLabel("My cool App");
		label.setForeground(Color.WHITE);
		label.setFont(new Font("Sans-serif", Font.BOLD, 36));
		
		ImageIcon labelIcon = new ImageIcon("mugi.png");
		
		Image img = labelIcon.getImage();
		
		Image newImg = img.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		
		labelIcon = new ImageIcon(newImg);
		
		label.setIcon(labelIcon);
		
		label.setIconTextGap(10);
		
		//label.setHorizontalTextPosition(SwingConstants.CENTER);
		//label.setVerticalTextPosition(SwingConstants.BOTTOM);
		
		panel.add(label);
		
		button = new JButton("Update Label Text");
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("<html>My cool App<br> Buy it now</html>");
				
			}
			
		});
		
		frame.add(button, BorderLayout.SOUTH);
		
	}

	public void show() {
		this.frame.setVisible(true);
	}

}

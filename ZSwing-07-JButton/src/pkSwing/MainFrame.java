package pkSwing;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MainFrame {
	
	private JFrame frame;
	private JPanel panel;
	private JButton button;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JButton Demo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		this.frame.setLocationRelativeTo(null);
		
		panel = new JPanel();
		
		button = createButton();
		panel.add(button);
		
		frame.add(panel, BorderLayout.CENTER);
		
	}
	
	private JButton createButton() {
		JButton button = new JButton("Print");
		button.setFocusable(false);
		
		ImageIcon printIcon = new ImageIcon("mugi.png");
		
		Image img = printIcon.getImage();
		
		Image newImg = img.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		
		printIcon = new ImageIcon(newImg);
		
		button.setIcon(printIcon);
		
		button.setIconTextGap(10);
		
		button.setMnemonic(KeyEvent.VK_P);
		
		button.setToolTipText("Some awesome text for the print button");
		
		button.setFont(new Font("Arial", Font.PLAIN, 24));
		
		button.setMargin(new Insets(10, 10, 10, 10));
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Print button has been clicked");
				
			}
		});
		
		//button.setEnabled(false);
		
		//Click automatiquement sur le bouton
		button.doClick();
		
		button.setVerticalTextPosition(SwingConstants.CENTER);
		button.setHorizontalTextPosition(SwingConstants.LEFT);
		
		button.setPreferredSize(new Dimension(200, 75));
		
		
		return button;
	}

	public void show() {
		this.frame.setVisible(true);
	}

}

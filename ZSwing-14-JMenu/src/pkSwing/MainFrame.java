package pkSwing;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;
import javax.swing.UIManager;

public class MainFrame implements ActionListener {
	
	private JFrame frame;
	private JMenuBar menuBar;
	private JMenu fileMenu;
	private JMenuItem newMenuItem;
	private JMenuItem saveMenuItem;
	private JMenuItem exitMenuItem;
	
	public MainFrame() {
		initialize();
	}
	
	private void initialize() {
		frame = new JFrame();
		this.frame.setTitle("JMenu Demo");
		this.frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.frame.setSize(800, 500);
		frame.setLayout(new BorderLayout(10, 10));
		this.frame.setLocationRelativeTo(null);
		
		//Change Font size for menu and menu item
		Font f = new Font("sans-serif", Font.PLAIN, 18);
		UIManager.put("Menu.font", f);
		UIManager.put("MenuItem.font", f);
		UIManager.put("CheckBoxMenuItem.font", f);
		UIManager.put("RadioButtonMenuItem.font", f);
		
		menuBar = new JMenuBar();
		
		fileMenu = new JMenu("File");
		fileMenu.setMnemonic(KeyEvent.VK_F);
		
		newMenuItem = new JMenuItem("New...");
		
		ImageIcon icon = new ImageIcon("mugi.png");
		Image img = icon.getImage();
		Image newImg = img.getScaledInstance(20, 20, java.awt.Image.SCALE_SMOOTH);
		icon = new ImageIcon(newImg);
		newMenuItem.setIcon(icon);
		newMenuItem.setIconTextGap(20);
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		newMenuItem.addActionListener(this);
		
		saveMenuItem = new JMenuItem("Save");
		saveMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		saveMenuItem.addActionListener(this);
		
		exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		exitMenuItem.addActionListener(this);
		
		fileMenu.add(newMenuItem);
		fileMenu.add(saveMenuItem);
		
		fileMenu.add(new JRadioButtonMenuItem("RadioButton"));
		fileMenu.add(new JCheckBoxMenuItem("CheckBox"));
		fileMenu.add(new JMenu("Sub Menu"));
		
		fileMenu.addSeparator();
		
		fileMenu.add(exitMenuItem);
		
		menuBar.add(fileMenu);
		
		frame.setJMenuBar(menuBar);
		
	}

	public void show() {
		this.frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JMenuItem) {
			JMenuItem item = (JMenuItem) e.getSource();
			String text = item.getText();
			System.out.println(text);
		}
		
	}

}

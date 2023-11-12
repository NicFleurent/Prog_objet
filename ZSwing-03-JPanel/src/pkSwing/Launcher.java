package pkSwing;

import javax.swing.SwingUtilities;

public class Launcher {

	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				MainFrame frame2 = new MainFrame();
			}
		});

	}

}

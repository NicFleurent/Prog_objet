package pkSwing;

import javax.swing.SwingUtilities;

public class Launcher {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				//Mauvaise pratique, donne accès a tous JFrame
				JFrameOne frame1 = new JFrameOne();
				
				//Meilleur pratique
				JFrameTwo frame2 = new JFrameTwo();
			}
		});

	}

}

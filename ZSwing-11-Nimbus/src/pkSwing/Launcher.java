package pkSwing;

import java.awt.EventQueue;

import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

public class Launcher {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
			        if ("Nimbus".equals(info.getName())) {
			            try {
							UIManager.setLookAndFeel(info.getClassName());
						} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
								| UnsupportedLookAndFeelException e) {
							// TODO Bloc catch g�n�r� automatiquement
							e.printStackTrace();
						}
			            break;
			        }
			    }
				
				new MainFrame();
			}
		});

	}

}

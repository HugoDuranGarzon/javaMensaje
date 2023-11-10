package javaMensaje;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class javaMensaje {

	private JFrame frmEjemploRemoto;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					javaMensaje window = new javaMensaje();
					window.frmEjemploRemoto.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public javaMensaje() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmEjemploRemoto = new JFrame();
		frmEjemploRemoto.setTitle("Ejemplo remoto");
		frmEjemploRemoto.setBounds(100, 100, 450, 300);
		frmEjemploRemoto.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}

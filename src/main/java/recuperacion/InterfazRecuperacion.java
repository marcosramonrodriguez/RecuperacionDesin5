package recuperacion;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class InterfazRecuperacion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfazRecuperacion window = new InterfazRecuperacion();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfazRecuperacion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("¿Cuál es mi nombre?");
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        
        JLabel label = new JLabel("Descubre tu nombre");
        panel.add(label);

        JButton btn = new JButton("Haz clic para conocer tu nombre");
        btn.addActionListener(e -> JOptionPane.showMessageDialog(frame, "¡Tu nombre es Marcos!"));
        panel.add(btn);
        
	}
}
package java2023.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ViewMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMenu frame = new ViewMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ViewMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ingresar Registro");
		lblNewLabel.setBounds(22, 28, 99, 29);
		contentPane.add(lblNewLabel);
		
		JButton btnRegistro = new JButton("Registro");
		btnRegistro.setBounds(22, 70, 89, 23);
		contentPane.add(btnRegistro);
		
		JLabel lblNewLabel_1 = new JLabel("Balance");
		lblNewLabel_1.setBounds(157, 35, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnBalance = new JButton("Balance General");
		btnBalance.setBounds(143, 70, 89, 23);
		contentPane.add(btnBalance);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setBounds(291, 70, 89, 23);
		contentPane.add(btnSalir);
	}
}

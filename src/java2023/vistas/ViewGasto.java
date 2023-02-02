package java2023.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ViewGasto extends JFrame {

	private JPanel contentPane;
	private JTextField txtGasto;
	private JButton btnSave;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewGasto frame = new ViewGasto();
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
	public ViewGasto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcion = new JLabel("Descripcion del Gasto");
		lblDescripcion.setBounds(42, 78, 187, 14);
		contentPane.add(lblDescripcion);
		
		JLabel lblTitulo = new JLabel("Ingreso Gasto");
		lblTitulo.setBounds(141, 11, 119, 36);
		contentPane.add(lblTitulo);
		
		txtGasto = new JTextField();
		txtGasto.setBounds(267, 75, 96, 20);
		contentPane.add(txtGasto);
		txtGasto.setColumns(10);
		
		btnSave = new JButton("Guardar");
		btnSave.setBounds(42, 103, 89, 23);
		contentPane.add(btnSave);
	}

	public JTextField getTxtGasto() {
		return txtGasto;
	}

	public void setTxtGasto(JTextField txtGasto) {
		this.txtGasto = txtGasto;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}

	
	
}

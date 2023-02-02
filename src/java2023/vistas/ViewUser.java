package java2023.vistas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.List;

public class ViewUser extends JFrame {

	private JPanel contentPane;
	private JTextField txtUser;
	private JTextField txtPass;
	private JTextField txtID;
	private JButton btnSave;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewUser frame = new ViewUser();
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
	public ViewUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Datos Usuarios");
		lblTitulo.setBounds(10, 11, 238, 38);
		contentPane.add(lblTitulo);
		
		txtUser = new JTextField();
		txtUser.setBounds(77, 101, 96, 20);
		contentPane.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblUser = new JLabel("Usuario");
		lblUser.setBounds(10, 104, 49, 14);
		contentPane.add(lblUser);
		
		JLabel lblPass = new JLabel("Password");
		lblPass.setBounds(10, 134, 49, 14);
		contentPane.add(lblPass);
		
		txtPass = new JTextField();
		txtPass.setColumns(10);
		txtPass.setBounds(77, 132, 96, 20);
		contentPane.add(txtPass);
		
		btnSave = new JButton("Guardar");
		btnSave.setBounds(10, 177, 186, 14);
		contentPane.add(btnSave);
		
		List list = new List();
		list.setBounds(285, 54, 110, 122);
		contentPane.add(list);
		
		JLabel lblTitulo2 = new JLabel("Registrados");
		lblTitulo2.setBounds(285, 23, 110, 14);
		contentPane.add(lblTitulo2);
		
		JLabel lblid = new JLabel("ID");
		lblid.setBounds(10, 63, 49, 14);
		contentPane.add(lblid);
		
		txtID = new JTextField();
		txtID.setColumns(10);
		txtID.setBounds(77, 60, 96, 20);
		contentPane.add(txtID);
		
	}

	public JTextField getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(JTextField txtUser) {
		this.txtUser = txtUser;
	}

	public JTextField getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(JTextField txtPass) {
		this.txtPass = txtPass;
	}

	public JTextField getTxtID() {
		return txtID;
	}

	public void setTxtID(JTextField txtID) {
		this.txtID = txtID;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public void setBtnSave(JButton btnSave) {
		this.btnSave = btnSave;
	}
	
	
}

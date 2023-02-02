package java2023.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Calendar;

import javax.swing.JOptionPane;

import java2023.bd.Data;
import java2023.vistas.ViewUser;

public class UserControl implements ActionListener{
	
	private ViewUser vista_user;
	

	public UserControl() {
		vista_user = new ViewUser();
		vista_user.setVisible(true);
		vista_user.getBtnSave().addActionListener(this);
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		boolean puedeGuardar = true;
		String id = vista_user.getTxtID().getText();
		if(id !=null && !id.isEmpty()) {
			
		}else {
			puedeGuardar=false;
			JOptionPane.showMessageDialog(null,"Validacion: El campo ID no puede ser null");
		}
		if(vista_user.getTxtPass().getText()!=null && !vista_user.getTxtPass().getText().isEmpty()) {
			
		}else {
			JOptionPane.showMessageDialog(null,"Validacion: El campo Password no puede ser null");
			puedeGuardar=false;
		}
		if(vista_user.getTxtUser().getText()!=null && !vista_user.getTxtUser().getText().isEmpty()) {
			
		}else {
			JOptionPane.showMessageDialog(null,"Validacion: El campo Password no puede ser null");
			puedeGuardar=false;
		}
		
		if(puedeGuardar) {
			Connection conn;
			try {
				Data data = new Data();
				conn= DriverManager.getConnection(data.getUrl(),data.getUser(),data.getPassword());
				if(conn!=null) {
					
					String sql ="insert into usuario(id, usuario, password, fecha_registro) VALUES (?,?,?,?)";
					PreparedStatement state = conn.prepareStatement(sql);
					state.setString(1, id);
					state.setString(2, vista_user.getTxtUser().getText());
					state.setString(3, vista_user.getTxtPass().getText());
					java.sql.Date date = new java.sql.Date(2023,1,2);
					state.setDate(4, date);
					state.execute();
					conn.close();
					JOptionPane.showMessageDialog(null, "Se inserto el usuario");
				}else {
					System.out.println("no se conectó");
				}
			}catch (Exception ee) {
				ee.printStackTrace();
				// TODO: handle exception
			}
		}
	}

}

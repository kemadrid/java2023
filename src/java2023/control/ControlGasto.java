package java2023.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java2023.vistas.ViewGasto;

public class ControlGasto implements ActionListener{
	
	private ViewGasto vista_gasto;
	
	public ControlGasto() {
		// TODO Auto-generated constructor stub
		vista_gasto = new ViewGasto();
		vista_gasto.getBtnSave().addActionListener(this);
		vista_gasto.setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("vine por el boton");
	}



	public ViewGasto getVista_gasto() {
		return vista_gasto;
	}



	public void setVista_gasto(ViewGasto vista_gasto) {
		this.vista_gasto = vista_gasto;
	}

}

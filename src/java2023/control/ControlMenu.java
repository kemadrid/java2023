package java2023.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java2023.vistas.ViewMenu;

public class ControlMenu implements ActionListener{

	private ViewMenu viewMenu;
	public ControlMenu() {
		super();
		// TODO Auto-generated constructor stub
		viewMenu = new ViewMenu();
		viewMenu.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}

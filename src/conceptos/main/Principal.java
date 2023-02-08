package conceptos.main;

import conceptos.modificadores.Modificadores;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hola");
		
		Modificadores obj = new Modificadores();
		System.out.println("En paquete main ");
		System.out.println("public " + obj.stpublic);
		System.out.println("miembro private " + obj.getStprivate());
		obj.accederMetodoProtegido();
		obj.imprimirTexto("primero");
		obj.imprimirTexto("primero y", "segundo");
		
		
	}

}

package conceptos.modificadores;

public class AccesoModificador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modificadores obj = new Modificadores();
		System.out.println("Inicio");
		System.out.println("prede "+obj.stpredeterminado);
		
		System.out.println("En paquete modificadores ");
		System.out.println("public " + obj.stpublic);
		obj.metodoprotected();
		
		ClaseDePaquete clasePaquete = new ClaseDePaquete();
	}

}

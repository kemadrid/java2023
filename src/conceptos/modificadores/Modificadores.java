package conceptos.modificadores;

public class Modificadores {

	//modificadores de acceso
	private String stprivate;
	
	/**
	 * Se puede acceder en cualquier clase de la aplicación, no importa el paquete
	 */
	public String stpublic;
	protected String stprotected;

	/**
	 * Solo se puede acceder con el objeto en clases o subclases del mismo paquete
	 * Modificador: predeterminado
	 */
	String stpredeterminado;
	
	
	public Modificadores() {
		super();
		// TODO Auto-generated constructor stub
		stpredeterminado="Cadena predeterminada";
		stpublic="Cadena publica";
		stprivate="Cadena privada";
		stprotected="Cadena protected";
		
		metodoPrivate();
	}
	
	
	String metodoPredeterminado() {
		return "metodo predeterminado";
	}
	
	public String metodoPublico() {
		return "metodo publico";
	}
	/**
	 * Solo se puede acceder si se llama desde otro metodo de esta clase
	 * No funciona obj.metodoPrivate()
	 */
	private void metodoPrivate() {
		System.out.println("imprimo desde metodo private");
	}
	
	/**
	 * Se comporta como privado si el objeto se usa en una clase de otro paquete, es decir,
	 * solo se accede si se llama desde otro metodo del objeto.
	 * Si el objeto se usa en una clase del mismo paquete: se comporta como publico
	 * 
	 */
	protected void metodoprotected() {
		System.out.println("metodo protected");
	}


	public String getStprivate() {
		return stprivate;
	}


	public void setStprivate(String stprivate) {
		this.stprivate = stprivate;
	}
	
	public void accederMetodoProtegido() {
		metodoprotected();
	}
	
	public void imprimirTexto(String texto1) {
		System.out.println("texto1 " + texto1);
	}
	public void imprimirTexto(String texto1,String texto2) {
		System.out.println("texto1 " + texto1 + " texto2: " + texto2);
	}
}

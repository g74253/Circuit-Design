package estructuras;

// Es una clase de los componentes utilizados en el drag and drop.

public class Components {
	
	String name, entrada1,entrada2,salida;
	
	
	public Components(String name,String entrada1, String entrada2, String salida) {
		this.name = name;
		this.entrada1 = entrada1;
		this.entrada2 = entrada2;
		this.salida = salida;
		
	}
	public String getName() {
		return this.name;
	}
}

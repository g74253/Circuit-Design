package estructuras;

public class Components {
	
	String name, entrada1,entrada2,salida;
	
	
	public Components(String name,String entrada1, String entrada2, String salida) {
		this.name = name;
		this.entrada1 = entrada1;
		this.entrada2 = entrada2;
		this.salida = salida;
		
	}

	public void data() {
		System.out.print(this.name + " " + this.entrada1 + " " + this.entrada2 + " " + this.salida);
	}
	
}

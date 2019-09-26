package estructuras;

// Esta clase es para las variables que van a tener los componentes.

public class Variable {
	String name;
	int value;
	public Variable (String name, int value) {
		this.name = name;
		this.value = value;
		
		
	}
	public void setValue(int c) {
		this.value = c;
		
	}
	public int getValue() {
		return this.value;
	}
}

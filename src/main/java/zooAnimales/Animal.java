package zooAnimales;

public class Animal {
	private int totalAnimales ;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona= new ArrayList<>();
	
	public Animal() {
		
	}
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero = genero;
		
				
	}

	public void movimiento() {
		
	}

	public void totalPorTipo() {
		
	}
	
	public String toString() {
		
	}
}

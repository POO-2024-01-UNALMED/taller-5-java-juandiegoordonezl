package gestion;

public class Zona {
	
	private String nombre;
	private Zoologico[] zoo = new Zoologico[1];
	private ArrayList<Animal> animal= new ArrayList<>();

	public Zona() {
	
	}

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo[0] = zoo;
	
	}

	public void agregarAnimales() {
	
	}
	public void cantidadAnimales() {
	
	}


}
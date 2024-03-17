package zooAnimales;

public class Pez extends Animal {
	
	private ArrayList<Pez> listado= new ArrayList<>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez () {
		
	}
	
	public Pez (int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		
	}
	
	public void cantidadPeces() {
		
	}
	
	@override
	public void movimiento() {
		
	}
	
	public void crearSalmon() {
		
	}
	
	public void crearBacalao() {
		
	}

}




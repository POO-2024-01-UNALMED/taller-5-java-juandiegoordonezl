package zooAnimales;

public class Mamifero extends Animal {
	
	private ArrayList<Mamifero> listado= new ArrayList<>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		
	}
	
	public Mamifero(int caballos,int leones,boolean pelaje,int patas) {
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas;
	}	
	public void cantidadMamiferos() {
		
	}
	
	@override
	public void movimiento() {
		
	}
	
	public void crearCaballo() {
		
	}
	
	public void crearLeon() {
		
	}

}
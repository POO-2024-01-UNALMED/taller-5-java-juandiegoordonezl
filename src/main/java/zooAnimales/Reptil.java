package zooAnimales;

public class Reptil extends Animal {
	
	private ArrayList<Reptil> listado = new ArrayList<>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		
	}
	
	public Reptil(int iguanas, int serpientes, String colorEscamas, int largoCola) {
		this.iguanas=iguanas;
		this.serpientes = serpientes;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	} 
	
	public void cantidadReptiles() {
		
	}
	
	@override
	public void movimiento() {
		
	}
	
	public void crearIguana() {
		
	}
	
	public void crearSerpiente() {
		
	}

}

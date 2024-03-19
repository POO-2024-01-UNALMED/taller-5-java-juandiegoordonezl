package zooAnimales;

public class Reptil extends Animal {
	
	private ArrayList<Reptil> listado = new ArrayList<>();
	public int iguanas;
	public int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	
	
	 private static int cantidadReptiles = 0;
	    private static int iguanas = 0;
	    private static int serpientes = 0;

	    public static int cantidadReptiles() {
	        return cantidadReptiles;
	    }

	    public static int getIguanas() {
	        return iguanas;
	    }

	    public static int getSerpientes() {
	        return serpientes;
	    }

	    public static Reptil crearIguana(String nombre, int edad, String genero) {
	        Reptil iguana = new Reptil("verde", 3, "humedal", nombre, edad, "humedal", genero);
	        iguanas++;
	        cantidadReptiles++;
	        return iguana;
	    }

	    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
	        Reptil serpiente = new Reptil("blanco", 1, "jungla", nombre, edad, "jungla", genero);
	        serpientes++;
	        cantidadReptiles++;
	        return serpiente;
	    }
	
	public Reptil() {
		
	}
	
	public Reptil(int iguanas, int serpientes, String colorEscamas, int largoCola) {
		this.iguanas=iguanas;
		this.serpientes = serpientes;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	} 
	
	public static void cantidadReptiles() {
		
	}
	
	@override
	public String movimiento() {
		return "reptar";
	}}
	


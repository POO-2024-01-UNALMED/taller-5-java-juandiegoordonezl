package zooAnimales;
import java.util.*;
public class Anfibio extends Animal {
	
	private ArrayList<Anfibio> listado= new ArrayList<>();
	public int ranas;
	public int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	
	public Anfibio() {
		 super();
	     listado.add(this);
	}
	
	public Anfibio(int ranas, int salamandras, String colorPiel, boolean venenoso) {
		this.ranas = ranas;
		this.salamandras = salamandras;
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		super(nombre, edad, habitat, genero);
        listado.add(this);
	}
	
	public static void cantidadAnfibios() {
		
	}
	
	@override
	public String movimiento() {
		return "saltar";
	}
	
	public void crearRana() {
		
	}
	
	public void crearSalamandra() {
		
	}

}

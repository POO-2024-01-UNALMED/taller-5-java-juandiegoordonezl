package zooAnimales;
import java.util.*;
public class Ave extends Animal {
	
	private ArrayList<Ave> listado = new ArrayList<>();
	public int halcones;
	public int aguilas;
	private String colorPlumas;
	
	 private static int cantidadAves = 0;
	    private static int halcones = 0;
	    private static int aguilas = 0;

	    public static int cantidadAves() {
	        return cantidadAves;
	    }

	    public static int getHalcones() {
	        return halcones;
	    }

	    public static int getAguilas() {
	        return aguilas;
	    }

	    public static Ave crearHalcon(String nombre, int edad, String genero) {
	        Ave halcon = new Ave("cafe glorioso", "montanas", nombre, edad, "montanas", genero);
	        halcones++;
	        cantidadAves++;
	        return halcon;
	    }

	    public static Ave crearAguila(String nombre, int edad, String genero) {
	        Ave aguila = new Ave("blanco y amarillo", "montanas", nombre, edad, "montanas", genero);
	        aguilas++;
	        cantidadAves++;
	        return aguila;
	    }
	
	public Ave() {
		
	}
	
	public Ave(int halcones, int aguilas, String colorPlumas) {
		this.halcones = halcones;
		this.aguilas = aguilas;
		this.colorPlumas = colorPlumas;
		
	}
	
	public static void cantidadAves() {
		
	}
	
	@override
	public String movimiento() {
		return "volar";
	}
	

}
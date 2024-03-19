
package zooAnimales;
import java.util.*;
public class Pez extends Animal {
	
	private ArrayList<Pez> listado= new ArrayList<>();
	public int salmones;
	public int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	private static int cantidadPeces = 0;
    private static int salmones = 0;
    private static int bacalaos = 0;

    public static int cantidadPeces() {
        return cantidadPeces;
    }

    public static int getSalmones() {
        return salmones;
    }

    public static int getBacalaos() {
        return bacalaos;
    }

	
	public Pez () {
		
	}
	
	public Pez (int salmones, int bacalaos, String colorEscamas, int cantidadAletas) {
		this.salmones = salmones;
		this.bacalaos = bacalaos;
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		
	}
	

	@override
	public String movimiento() {
		return "nadar";
	}
	
	 public static Pez crearSalmon(String nombre, int edad, String genero) {
	        Pez salmon = new Pez("rojo", 6, "oceano", nombre, edad, "oceano", genero);
	        salmones++;
	        cantidadPeces++;
	        return salmon;
	    }

	    public static Pez crearBacalao(String nombre, int edad, String genero) {
	        Pez bacalao = new Pez("gris", 6, "oceano", nombre, edad, "oceano", genero);
	        bacalaos++;
	        cantidadPeces++;
	        return bacalao;
	    }
}




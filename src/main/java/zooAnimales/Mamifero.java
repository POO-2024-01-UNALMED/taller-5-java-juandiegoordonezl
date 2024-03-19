package zooAnimales;
import java.util.*;
public class Mamifero extends Animal {
	
	private ArrayList<Mamifero> listado= new ArrayList<>();
	public int caballos;
	public int leones;
	private boolean pelaje;
	private int patas;
	
	 public static int cantidadMamiferos() {
	        return cantidadMamiferos;
	    }

	    public static int getCaballos() {
	        return caballos;
	    }

	    public static int getLeones() {
	        return leones;
	    }

	    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
	        Mamifero caballo = new Mamifero(true, 4, "pradera", nombre, edad, "pradera", genero);
	        caballos++;
	        cantidadMamiferos++;
	        return caballo;
	    }

	    public static Mamifero crearLeon(String nombre, int edad, String genero) {
	        Mamifero leon = new Mamifero(true, 4, "selva", nombre, edad, "selva", genero);
	        leones++;
	        cantidadMamiferos++;
	        return leon;
	    }
	public Mamifero() {
		
	}
	
	public Mamifero(int caballos,int leones,boolean pelaje,int patas) {
		this.caballos = caballos;
		this.leones = leones;
		this.pelaje = pelaje;
		this.patas = patas;
	}	
	public int cantidadMamiferos() {
        return caballos + leones;
    }
	

}
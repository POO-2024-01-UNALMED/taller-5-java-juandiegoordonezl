package zooAnimales;
import java.util.*;
import gestion.Zona;
public class Animal {
	private int totalAnimales =0 ;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	

	public String getnombre() {
		return this.nombre;
	}
	public int getedad(){
		return this.edad;
	}
	public String gethabitat(){
		return this.habitat;
	}
	public String getgenero(){
		return this.genero;
	}
	public Zona getzona(){
		return this.zona;
	}
	
	public Animal() {
		totalAnimales++;
	}
	
	public Animal(int totalAnimales, String nombre, int edad, String habitat, String genero) {
		this.totalAnimales = totalAnimales;
		this.nombre = nombre;
		this.edad= edad;
		this.habitat = habitat;
		this.genero = genero;
		totalAnimales++;
				
	}

	public String movimiento() {
		return "desplazarse";
	}

	public String totalPorTipo() {
	    System.out.printnl( "Mamiferos: " + cantidadMamiferos() + "\n" +
	            "Aves: " +cantidadAves() + "\n" +
	            "Reptiles: " + cantidadReptiles() + "\n" +
	            "Peces: " + cantidadPeces() + "\n" +
	            "Anfibios: " + cantidadAnfibios());
	}
	public String toString() {
		return "Mi nombre es "+ nombre+ "tengo una edad de "+edad+" habito en " + habitat+"y mi genero es"+
				genero+" la zona en la que me ubico es" +zona+ "en el"+ getzoo(zona);
	
	}
}

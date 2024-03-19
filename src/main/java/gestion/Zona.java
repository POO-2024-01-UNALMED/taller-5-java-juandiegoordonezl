package gestion;
import java.util.*;
import zooAnimales.Animal;
public class Zona {
	
	private String nombre;
	private Zoologico zoo ;
	private ArrayList<Animal> animal= new ArrayList<>();
	
	public Zoologico getzoo() {
		return this.zoo;
	}

	public Zona() {
	
	}

	public Zona(String nombre, Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
	}

	public void agregarAnimales(Animal nuevoanimal) {
		animal.add(nuevoanimal);
	}
	
	public int cantidadAnimales() {
	    return animal.size();
	 }
	
	


}
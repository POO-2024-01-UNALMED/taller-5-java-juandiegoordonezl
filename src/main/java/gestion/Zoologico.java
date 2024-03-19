package gestion;
import java.util.*;
public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas= new ArrayList<>();
	
	public Zoologico() {
		
	}
	
	public Zoologico(String nombre,String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		
		
	}
	public void agregarZonas(Zona nuevazona) {
		zonas.add(nuevazona);
	}
	public int cantidadTotalAnimales() {
        int totalAnimales = 0;
        for (Zona zona : zonas) {
            totalAnimales += zona.cantidadAnimales();
        }
        return totalAnimales;
    }

}

package gestion;
import java.util.ArrayList;

public class Zoologico {
	private String nombre;
	private String ubicacion;
	private ArrayList<Zona> zonas;

	public Zoologico() {
		zonas = new ArrayList<Zona>();
	}
	public Zoologico(String nombre, String ubicacion) {
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		zonas = new ArrayList<Zona>();
	}
	public int cantidadTotalAnimales() {
		int cantidad = 0;
		for (int i=0; i<zonas.size();i +=1) {
			cantidad += zonas.get(i).getAnimales().size();
		}	
		return cantidad;
	
}
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
	public String getNombre() {
		return nombre;
	}
	public ArrayList<Zona> getZona() {
		return zonas;
	}
}

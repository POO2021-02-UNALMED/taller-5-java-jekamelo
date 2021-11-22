package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal{
	private ArrayList<Ave> listado;
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {
		
	}
	
	public Ave(String nombre,int edad,String habitat,String genero,String colorPlumas) {
		this.setEdad(edad);
		this.setGenero(genero);
		this.setHabitat(habitat);
		this.setNombre(nombre);
		this.colorPlumas = colorPlumas;
		
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}
	public static Ave crearHalcon(String nombre,int edad,String genero) {
		halcones += 1;
		return new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
	}
	public static Ave crearAguila(String nombre,int edad,String genero) {
		aguilas += 1;
		return new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
	}
	public static int cantidadAves() {
		return halcones+aguilas;
	}
	public String movimiento() {
		return "volar";
	}
}

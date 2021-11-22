package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal{
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {
		listado.add(this);
		
	}
	
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas) {
		this.setEdad(edad);
		this.setGenero(genero);
		this.setHabitat(habitat);
		this.setNombre(nombre);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
		
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public static int cantidadPeces() {
		return bacalaos+salmones;
	}
	public static Pez crearBacalao(String nombre,int edad,String genero) {
		bacalaos += 1;
		return new Pez(nombre,edad,"oceano",genero,"gris",6);
	}
	public static Pez crearSalmon(String nombre,int edad,String genero) {
		salmones += 1;
		return new Pez(nombre,edad,"oceano",genero,"rojo",6);
}
	public String movimiento() {
		return "nadar";
	}
	public static int Peces() {
		return listado.size();
	}
}

package zooAnimales;

import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio> listado;
	public static int Anfibios =1;
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean veneno;
	
	public Anfibio() {
		Anfibios +=1;
	}
	public Anfibio(String nombre,int edad,String habitat,String genero,String colorPiel,boolean veneno) {
		this.setNombre(nombre);
		this.setGenero(genero);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.colorPiel = colorPiel;
		this.veneno = veneno;
		listado.add(this);
		
	}
	public String getColorPiel() {
		return colorPiel;
	}
	public boolean isVenenoso() {
		return veneno;
	}
	public static int cantidadAnfibios() {
		return ranas+salamandras;
	}
	public static Anfibio crearRana(String nombre,int edad,String genero) {
		ranas += 1;
		return new Anfibio(nombre,edad,"selva",genero,"rojo",true);
}
	public static Anfibio crearSalamandra(String nombre,int edad,String genero) {
		salamandras += 1;
		return new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
}
	public String movimiento() {
		return "saltar";
	}
	
}
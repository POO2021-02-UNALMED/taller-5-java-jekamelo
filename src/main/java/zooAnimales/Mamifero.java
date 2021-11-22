package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
	private static ArrayList<Mamifero> listado;
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre,int edad,String habitat,String genero,boolean pelaje,int patas) {
		this.setEdad(edad);
		this.setGenero(genero);
		this.setHabitat(habitat);
		this.setNombre(nombre);
		this.pelaje = pelaje;
		this.patas = patas;
		
	}
	
	public boolean isPelaje() {
		return pelaje;
	}
	
	public int getPatas() {
		return patas;
	}
	public static Mamifero crearCaballo(String nombre,int edad,String genero) {
		Mamifero.caballos += 1;
		return new Mamifero(nombre,edad,"pradera",genero,true,4);
	}
	public static Mamifero crearLeon(String nombre,int edad,String genero) {
		Mamifero.leones += 1;
		return new Mamifero(nombre,edad,"selva",genero,true,4);
	}
	public static int cantidadMamiferos() {
		return Mamifero.caballos + Mamifero.leones;
	}
	
}

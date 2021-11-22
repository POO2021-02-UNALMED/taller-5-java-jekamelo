package zooAnimales;
import java.util.ArrayList;
import gestion.Zona;

public class Animal {
	private int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private ArrayList<Zona> zona;
	
	public Animal() {
		totalAnimales += 1;
		zona = new ArrayList<Zona>();
	}
	public Animal(String nombre,int edad,String habitat,String genero) {
		this.totalAnimales += 1;
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
	}
	public static String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.cantidadMamiferos()+"\n"+
				"Aves: "+ Ave.cantidadAves()+"\n"+
				"Reptiles: "+ Reptil.cantidadReptiles()+"\n"+
				"Peces: "+ Pez.cantidadPeces()+"\n"+
				"Anfibios: "+ Anfibio.cantidadAnfibios()+"\n";
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getGenero() {
		return genero;
		}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	@Override
	public String toString() {
		return "Mi nombre es "+nombre+", tengo una edad de "+edad+", habito en "+habitat+" y mi genero es "+genero;
	}
	public  String movimiento() {
		return "desplazarse";
	}
}

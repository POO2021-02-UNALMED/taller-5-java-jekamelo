package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
	private String nombre;
	private Zoologico zoo;
	private ArrayList<Animal> animales;
	
	public Zona() {
		animales = new ArrayList<Animal>();
	}
	public Zona(String nombre,Zoologico zoo) {
		this.nombre = nombre;
		this.zoo = zoo;
		animales = new ArrayList<Animal>();
	}
	public void agregarAnimales(Animal animal) {
		animales.add(animal);
	}
	public int cantidadAnimales() {
		return animales.size();
	}
	public String getNombre() {
		return nombre;
	}
	public Zoologico getZoo() {
		return zoo;
	}
	public ArrayList<Animal> getAnimales() {
		return animales;
	}
}

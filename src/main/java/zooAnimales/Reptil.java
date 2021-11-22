package zooAnimales;

import java.util.ArrayList;

public class Reptil extends Animal {
	private ArrayList<Reptil> listado;
	public static int Reptiles = 1;
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil() {
		Reptiles += 1;
		
	}
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola) {
		this.setEdad(edad);
		this.setGenero(genero);
		this.setHabitat(habitat);
		this.setNombre(nombre);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	public int getLargoCola() {
		return largoCola;
	}
	public static Reptil crearIguana(String nombre,int edad,String genero) {
		Reptil.iguanas += 1;
		return new Reptil(nombre,edad,"humedal",genero,"verde",3);
	} 
	public static Reptil crearSerpiente(String nombre,int edad,String genero) {
		Reptil.serpientes += 1;
		return new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		
	}
	public static int cantidadReptiles() {
		return iguanas+serpientes;
	}
	public String movimiento() {
		return "reptar";
	}
}

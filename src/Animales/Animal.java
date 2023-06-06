package Animales;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Animal {
	ModeloDatos datos =new ModeloDatos();
	modeloAnimal Animales = new modeloAnimal();
	
	int codigo;
    String nombre;
    String especie;
    int edad;
  
    public Animal() {
    	
    }
    
	public void ingresar() {
		Animales.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo de la mascota")));
		Animales.setNombre(JOptionPane.showInputDialog("Ingrese nombre de la mascota"));
		Animales.setEspecie(JOptionPane.showInputDialog("Ingrese especie de la mascota"));
		Animales.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota")));
        
        codigo = Animales.getCodigo();
        nombre =Animales.getNombre();
        especie = Animales.getEspecie();
        edad = Animales.getEdad();
    }
    public Animal(String nombre, String especie, int edad) {
    	this.codigo = codigo;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public void mostrarInformacion() {
    	System.out.println("Codigo: " + Animales.getCodigo());
        System.out.println("Nombre: " + Animales.getNombre());
        System.out.println("Especie: " + Animales.getEspecie());
        System.out.println("Edad: " + Animales.getEdad() + " anos");
    }

    public void hacerSonido() {
        if (Animales.getEspecie().equalsIgnoreCase("perro")) {
            System.out.println(""
            		+ "Guau guau!");
        } else if (Animales.getEspecie().equalsIgnoreCase("gato")) {
            System.out.println("Miau miau!");
        }else {
            System.out.println("La mascota no hace sonidos conocidos.");
        }
    }
    public void comer() {
        if (Animales.getEspecie().equalsIgnoreCase("perro")) {
            System.out.println("El perro come!");
        } else if (Animales.getEspecie().equalsIgnoreCase("gato")) {
            System.out.println("El gato come!");
        }else {
            System.out.println("El animal no ha comido.");
        }
    }
	public void jugar() {
        if (Animales.getEspecie().equalsIgnoreCase("perro")) {
            System.out.println("El perro juega!");
        } else if (Animales.getEspecie().equalsIgnoreCase("gato")) {
            System.out.println("El gato juega!");
        }else {
            System.out.println("El animal no juega.");
        }
		
	}
    public void imprimirDatos(ModeloDatos datos) {
   	 HashMap<Integer, Animal> Animal = datos.getSizeMap();
   	Iterator iterator = Animal.keySet().iterator();
   	Animal Animales; Integer llave;
		while(iterator.hasNext()) {
           llave = (Integer) iterator.next();
           Animales = datos.getSizeMap().get(llave);
           System.out.println("ID: " + llave + ", Nombre: " + Animales.nombre + ", edad: " + Animales.edad 
               		+ " y especie " + Animales.especie);
		}
		System.out.println("-----");
   }

}
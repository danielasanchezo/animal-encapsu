package Animales;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ModeloDatos {
    HashMap<Integer, Animal> mapAnimales = new HashMap<Integer, Animal>();
    Animal Animales = null;

    public void iniciar(ModeloDatos datos) {
        String menu = "Informacion del sistema Daniela\n";
        menu += "1. Ingresar el Animal\n";
        menu += "2. Imprimir HashMap\n";
        menu += "3. Consultar Animal individual\n";
        menu += "4. Salir\n";
        menu += "Ingrese una opcion:\n";
        int opc = 0;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog(menu));
            validarDatos(opc);
        } while (opc != 4);
    }

    public void validarDatos(int opc) {
        switch (opc) {
            case 1:
                guardarDatos();
                break;

            case 2:
                if (!mapAnimales.isEmpty()) {
                    imprimirHashMap();
                } else {
                    System.out.println("No existe esta mascota registrada");
                }
                break;
            case 3:
                if (!mapAnimales.isEmpty()) {
                    consultarAnimales();
                } else {
                    System.out.println("No hay mascotas registradas");
                }
                break;
            case 4:
                System.out.println("Salio!");
                break;
            default:
                break;
        }
    }

    public void guardarDatos() {
        String resp = "";
        do {
            Animales = new Animal();
            Animales.ingresar();
            Animales.hacerSonido();
            Animales.jugar();
            mapAnimales.put(Animales.codigo, Animales);
            Animales.mostrarInformacion();
            resp = JOptionPane.showInputDialog("Diga SI, si quiere continuar");
        } while (resp.equalsIgnoreCase("si"));
    }


    public void imprimirHashMap() {
        System.out.println("HashMap : ");
        for (Animal Animales : mapAnimales.values()) {
            Animales.mostrarInformacion();
        }
    }

    public void consultarAnimales() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo del animales que desea buscar"));
        Animal Animales = mapAnimales.get(codigo);
        if (Animales != null) {
            System.out.println("El codigo de la mascota " + codigo + ":");
            Animales.mostrarInformacion();
        } else {
            System.out.println("No se encontro el animal con el codigo."+ codigo);
        }
    }

    public HashMap<Integer, Animal> getSizeMap(){
        return mapAnimales;
    }
}

package Clase1;
import java.util.ArrayList;
import java.util.List;

//PARTE 1 Y 2 TALLER

public class Taller {

    //Creación de una lista y agregación de nombres
    private static List<String> listaDeNombres = new ArrayList<>();

    public static void main(String[] args) {
        // Agregar nombres a la lista
        listaDeNombres.add("Ana");
        listaDeNombres.add("Carlos");
        listaDeNombres.add("Beatriz");
        listaDeNombres.add("David");
        listaDeNombres.add("Elena");

        // Imprimir todos los nombres en la lista
        imprimirLista();

        // Operaciones Condicionales y Búsquedas
        // Búsqueda de un nombre
        buscarNombre("Carlos");

        // Intentar agregar un nombre que ya existe
        agregarNombre("Carlos");
        // Agregar un nuevo nombre
        agregarNombre("Fernando");

        // Eliminar un nombre de la lista
        eliminarNombre("Beatriz");

        // Eliminar un nombre que no existe en la lista
        eliminarNombre("Julio");
    }

    // Función para imprimir la lista
    public static void imprimirLista() {
        System.out.println("Lista de nombres:");
        for (String nombre : listaDeNombres) {
            System.out.println(nombre);
        }
        System.out.println();  // Línea en blanco para mejor visualización
    }

    // Función para buscar un nombre en la lista
    public static void buscarNombre(String nombre) {
        if (listaDeNombres.contains(nombre)) {
            System.out.println(nombre + " fue encontrado en la lista.\n");
        } else {
            System.out.println(nombre + " no fue encontrado en la lista.\n");
        }
    }

    // Función para agregar un nombre si no está en la lista
    public static void agregarNombre(String nombre) {
        if (!listaDeNombres.contains(nombre)) {
            listaDeNombres.add(nombre);
            System.out.println(nombre + " ha sido agregado a la lista.\n");
        } else {
            System.out.println(nombre + " ya está en la lista y no se agregó nuevamente.\n");
        }
        imprimirLista();
    }

    // Función para eliminar un nombre de la lista
    public static void eliminarNombre(String nombre) {
        if (listaDeNombres.remove(nombre)) {
            System.out.println(nombre + " ha sido eliminado de la lista.\n");
        } else {
            System.out.println(nombre + " no se encontró en la lista y no se pudo eliminar.\n");
        }
        imprimirLista();
    }
}










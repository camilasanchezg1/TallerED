package Clase1;


	import java.util.ArrayList;
	import java.util.Scanner;

	public class AplicacionPractica {

	    // Crear la lista de tareas
	    private static ArrayList<String> listaTareas = new ArrayList<>();

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            // Menú de opciones
	            System.out.println("\n--- Gestión de Tareas ---");
	            System.out.println("1. Agregar tarea");
	            System.out.println("2. Eliminar tarea completada");
	            System.out.println("3. Mostrar todas las tareas pendientes");
	            System.out.println("4. Salir");
	            System.out.print("Elige una opción: ");
	            opcion = scanner.nextInt();
	            scanner.nextLine();  // Limpiar el buffer

	            switch (opcion) {
	                case 1:
	                    agregarTarea(scanner);
	                    break;
	                case 2:
	                    eliminarTarea(scanner);
	                    break;
	                case 3:
	                    mostrarTareasPendientes();
	                    break;
	                case 4:
	                    System.out.println("Saliendo del gestor de tareas...");
	                    break;
	                default:
	                    System.out.println("Opción inválida. Intenta de nuevo.");
	            }
	        } while (opcion != 4);
	    }

	    // Función para agregar una tarea
	    private static void agregarTarea(Scanner scanner) {
	        System.out.print("Ingresa la tarea a agregar: ");
	        String tarea = scanner.nextLine();
	        listaTareas.add(tarea);
	        System.out.println("Tarea agregada exitosamente.");
	    }

	    // Función para eliminar una tarea
	    private static void eliminarTarea(Scanner scanner) {
	        mostrarTareasPendientes();
	        System.out.print("Ingresa el número de la tarea a eliminar: ");
	        int indice = scanner.nextInt() - 1;

	        if (indice >= 0 && indice < listaTareas.size()) {
	            listaTareas.remove(indice);
	            System.out.println("Tarea eliminada exitosamente.");
	        } else {
	            System.out.println("Índice inválido.");
	        }
	    }

	    // Función para mostrar todas las tareas pendientes
	    private static void mostrarTareasPendientes() {
	        System.out.println("\n--- Tareas Pendientes ---");
	        if (listaTareas.isEmpty()) {
	            System.out.println("No hay tareas pendientes.");
	        } else {
	            for (int i = 0; i < listaTareas.size(); i++) {
	                System.out.println((i + 1) + ". " + listaTareas.get(i));
	            }
	        }
	    }
	}



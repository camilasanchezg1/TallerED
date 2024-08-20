package Clase2;

public class ComparacionYAnalisis {
	    
	    public static void main(String[] args) {
	        // Tamaño del array 
	        int n = 1000000;
	        int[] array = new int[n];

	        // Inicialización del array con valores aleatorios
	        for (int i = 0; i < n; i++) {
	            array[i] = (int) (Math.random() * 100);
	        }

	        // Medir tiempo para el método iterativo básico
	        long startTimeBasic = System.nanoTime();
	        long sumBasic = iterativeSumBasic(array);
	        long endTimeBasic = System.nanoTime();
	        long durationBasic = endTimeBasic - startTimeBasic;

	        // Medir tiempo para el método iterativo optimizado
	        long startTimeOptimized = System.nanoTime();
	        long sumOptimized = iterativeSumOptimized(array);
	        long endTimeOptimized = System.nanoTime();
	        long durationOptimized = endTimeOptimized - startTimeOptimized;

	        // Imprimir resultados
	        System.out.println("Suma usando método iterativo básico: " + sumBasic);
	        System.out.println("Tiempo de ejecución (método iterativo básico): " + durationBasic + " nanosegundos");

	        System.out.println("Suma usando método iterativo optimizado: " + sumOptimized);
	        System.out.println("Tiempo de ejecución (método iterativo optimizado): " + durationOptimized + " nanosegundos");

	        // Paso 3.1: Comparar los tiempos obtenidos
	        if (durationBasic < durationOptimized) {
	            System.out.println("El método iterativo básico fue más rápido.");
	        } else {
	            System.out.println("El método iterativo optimizado fue más rápido.");
	        }

	        // Paso 3.2: Analizar la eficiencia de los algoritmos
	        System.out.println("\n**Análisis de la eficiencia:**");
	        System.out.println("El método iterativo básico recorre el array de manera secuencial, sumando cada elemento.");
	        System.out.println("El método iterativo optimizado usa técnicas adicionales para mejorar el rendimiento, pero puede no ser efectivo en todos los casos.");
	        System.out.println("En este caso, el método más rápido depende del diseño específico del algoritmo y de la naturaleza de los datos en el array.");
	    }

	    // Método iterativo básico para sumar elementos de un array
	    public static long iterativeSumBasic(int[] array) {
	        long sum = 0;
	        for (int num : array) {
	            sum += num;
	        }
	        return sum;
	    }

	    // Método iterativo optimizado para sumar elementos de un array (ejemplo usando múltiples hilos)
	    public static long iterativeSumOptimized(int[] array) {
	        long sum = 0;

	        // Dividir el trabajo en partes para múltiples hilos (simulación de optimización)
	        int mid = array.length / 2;
	        SumThread thread1 = new SumThread(array, 0, mid);
	        SumThread thread2 = new SumThread(array, mid, array.length);

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        sum = thread1.getSum() + thread2.getSum();

	        return sum;
	    }
	}

	// Clase auxiliar para realizar la suma en un hilo separado
	class SumThread extends Thread {
	    private int[] array;
	    private int start, end;
	    private long sum;

	    public SumThread(int[] array, int start, int end) {
	        this.array = array;
	        this.start = start;
	        this.end = end;
	    }

	    public void run() {
	        sum = 0;
	        for (int i = start; i < end; i++) {
	            sum += array[i];
	        }
	    }

	    public long getSum() {
	        return sum;
	    }
	}



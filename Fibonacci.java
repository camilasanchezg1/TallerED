package Clase2;

public class Fibonacci {
	
	    // Método iterativo básico para calcular el enésimo número de Fibonacci
	    public static long fibonacciIterativoBasico(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        long a = 0, b = 1, c = 0;
	        for (int i = 2; i <= n; i++) {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return c;
	    }

	    // Método iterativo optimizado para calcular el enésimo número de Fibonacci
	    public static long fibonacciIterativoOptimizado(int n) {
	        if (n <= 1) {
	            return n;
	        }
	        long prev = 0, current = 1;
	        for (int i = 2; i <= n; i++) {
	            current += prev;
	            prev = current - prev;
	        }
	        return current;
	    }

	    // Método para medir el tiempo de ejecución de un algoritmo
	    public static long medirTiempoEjecucion(Runnable algoritmo) {
	        long inicio = System.nanoTime();
	        algoritmo.run();
	        long fin = System.nanoTime();
	        return fin - inicio;
	    }

	    // Método principal para probar y medir el tiempo de ejecución de ambos algoritmos
	    public static void main(String[] args) {
	        int n = 30;
	        int repeticiones = 10;
	        
	        // Medir tiempo de ejecución para el método iterativo básico
	        long tiempoTotalBasico = 0;
	        for (int i = 0; i < repeticiones; i++) {
	            tiempoTotalBasico += medirTiempoEjecucion(() -> {
	                fibonacciIterativoBasico(n);
	            });
	        }
	        long tiempoPromedioBasico = tiempoTotalBasico / repeticiones;
	        System.out.println("Tiempo promedio del método iterativo básico: " + tiempoPromedioBasico + " nanosegundos");
	        
	        // Medir tiempo de ejecución para el método iterativo optimizado
	        long tiempoTotalOptimizado = 0;
	        for (int i = 0; i < repeticiones; i++) {
	            tiempoTotalOptimizado += medirTiempoEjecucion(() -> {
	                fibonacciIterativoOptimizado(n);
	            });
	        }
	        long tiempoPromedioOptimizado = tiempoTotalOptimizado / repeticiones;
	        System.out.println("Tiempo promedio del método iterativo optimizado: " + tiempoPromedioOptimizado + " nanosegundos");
	    }
	}



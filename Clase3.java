package Clase3;

public class Clase3 {
	
	//Primera parte (Identificación de Complejidades)
	
	//Primer algortimo 
	
	public void printFirstElement(int[] arr) { 
	    if (arr.length > 0) { // Complejidad temporal y especial O(1)
	        System.out.println(arr[0]); // Complejidad temporal y especial O(1)
	    }
	}
    //Resultado final: Tiene una complejidad temporal O(1) y complejidad espacial O(1)
	
	//Segundo algoritmo
	
	public void printAllElements(int[] arr) {
	    for (int element : arr) { //Complejidad temportal O(n) y complejidad espacial O(1)
	        System.out.println(element); //Complejidad temportal O(1) y complejidad espacial O(1)
	    }
	}
    //Resultado final: Tiene una complejidad temporal O(n) y complejidad espacial O(1)
	
	//Tercer algoritmo
	
	public void printAllPairs(int[] arr) {
	    for (int i = 0; i < arr.length; i++) { //Complejidad temporal O(n^2) y complejidad espacial O(1)
	        for (int j = 0; j < arr.length; j++) { 
	            System.out.println(arr[i] + ", " + arr[j]); //Complejidad temportal O(1) y complejidad espacial O(1)
	        }
	    }
	}

	//Resultado final: Tiene una complejidad temporal O(n^2) y complejidad espacial O(1)
	
	//Cuarto algoritmo
	
	public int binarySearch(int[] arr, int target) { 
	    int low = 0; //Complejidad temporal O(1) y complejidad espacial O(1)
	    int high = arr.length - 1; //Complejidad temporal O(1) y complejidad espacial O(1)

	    while (low <= high) {
	        int mid = (low + high) / 2; //Complejidad temporal O(1) y complejidad espacial O(1)
	        if (arr[mid] == target) { //Complejidad temporal O(1) y complejidad espacial O(1)
	            return mid; //Complejidad temporal O(1) y complejidad espacial O(1)
	        } else if (arr[mid] < target) { //Complejidad temporal O(1) y complejidad espacial O(1)
	            low = mid + 1; //Complejidad temporal O(1) y complejidad espacial O(1)
	        } else {
	            high = mid - 1; //Complejidad temporal O(1) y complejidad espacial O(1)
	        }
	    }
	    return -1;
	}

	//Resultado final: Tiene una complejidad temporal O(n) y complejidad espacial O(1)

    //Quinto algoritmo
	
	public int fibonacci(int n) {
	    if (n <= 1) { //Complejidad temporal O(1) y complejidad espacial O(1)
	        return n; //Complejidad temporal O(1) y complejidad espacial O(1)
	    } else {
	        return fibonacci(n - 1) + fibonacci(n - 2); //Complejidad temporal O(1) y complejidad espacial O(1)
	    }
	}

	//Resultado final: Tiene una complejidad temporal O(1) y complejidad espacial O(1)
	
	//Sexto algoritmo
	
	import java.util.Arrays;

	public void sortAndPrint(int[] arr) {
	    Arrays.sort(arr); // Complejidad O(n log n)
	    for (int element : arr) { //Complejidad temporal O(n) y complejidad espacial O(1)
	        System.out.println(element); //Complejidad temportal O(1) y complejidad espacial O(1)
	    }
	    
	}
    
	//Resultado final: Tiene una complejidad temporal O(n) y complejidad espacial O(1)

	
	//Segunda parte (Optimización de Algoritmos)
	
	public boolean hasDuplicate1(int[] arr) {
	    for (int i = 0; i < arr.length; i++) {
	        for (int j = i + 1; j < arr.length; j++) {
	            if (arr[i] == arr[j]) {
	                return true;
	            }
	        }
	    }
	    return false;
	}

	//La complejidad del algoritmo pasa de ser o(n^2)
	import java.util.HashSet;

	public boolean hasDuplicate(int[] arr) {
	    HashSet<Integer> seen = new HashSet<>();
	    for (int element : arr) {
	        if (seen.contains(element)) {
	            return true;
	        }
	        seen.add(element);
	    }
	    return false;
	}

	
	
	
	
	
	
	
	
	
	
	



package ordenacao;

public class Quicksort {
    public static void main(String[] args) {
        int[] array = {49, 15, 40, 27, 20, 19, 50, 2, 12, 28, 49, 44, 9, 59, 18, 5, 30, 6, 7, 28};

        System.out.println("Array não ordenado:");
        printArray(array);

        quickSort(array, 0, array.length - 1);
    }



	public static void quickSort(int[] array, int low, int high) {
	    if (low < high) {
	        int pivotIndex = partition(array, low, high);
	        System.out.println("Quick Sort - Iteração:");
	        printArray(array);
	        System.out.println("Pivô na iteração: " + array[pivotIndex]);
	
	        quickSort(array, low, pivotIndex - 1);
	        quickSort(array, pivotIndex + 1, high);
	    }
	}
	
	public static int partition(int[] array, int low, int high) {
	    int pivot = array[high]; // Seleciona o elemento mais à direita como pivô
	    int i = low - 1;
	
	    for (int j = low; j < high; j++) {
	        if (array[j] < pivot) {
	            i++;
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
	    int temp = array[i + 1];
	    array[i + 1] = array[high];
	    array[high] = temp;
	
	    return i + 1;
	}
	
	public static void printArray(int[] array) {
	    for (int num : array) {
	        System.out.print(num + " ");
	    }
	    System.out.println();
	}
}

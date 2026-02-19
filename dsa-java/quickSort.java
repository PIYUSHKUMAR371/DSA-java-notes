public class quickSort {
    public static void main(String[] args) {
        int[] array = {8, 3, 4, 5, 7, 4, 6, 3, 6, 2, 6, 1, 7};

        quickSort(array, 0, array.length - 1);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        // 1. Fixed the base case variable names
        if (high <= low) return; 

        int pivotIndex = partition(array, low, high);
        
        // 2. Sort the left side
        quickSort(array, low, pivotIndex - 1); 
        
        // 3. Added the missing right side call
        quickSort(array, pivotIndex + 1, high); 
    }

    private static int partition(int[] array, int low, int high) {
        int pivot = array[high]; 
        int i = low - 1; 

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j);
            }
        }
        // Move pivot to its final sorted position
        swap(array, i + 1, high);
        return i + 1; 
    }

    // 4. Added the helper swap method
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


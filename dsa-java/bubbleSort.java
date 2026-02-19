public class bubbleSort {
    
    //Bubble sort = pairs of adjacent elements are compared , and the elmenst 
    //              are swapped if they are in the wrong order

    //average case = O(n^2)
    //worst case = O(n^2) [when the array is reverse sorted]
    //large data sets = bad

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then the array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}

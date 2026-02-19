public class insertionSort {
    
    //insertion sort = after comapring elements to the left 
    //                 shift elments to the right to make room to inser a valu e
    
    //O(n^2) time complexity
    //O(1) space complexity
    //small data set = good
    //large data set = bad

    //less steps than bubble sort
    //more steps than selection sort
    //best case is O(n) when the array is already sorted,compared to bubble and selection sort which is O(n^2) in the best case

    public static void main(String[] args) {
        int[] arr = {5,2,4,6,1,3};
        insertionSort(arr);
        printArr(arr);
    }
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    private static void printArr(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

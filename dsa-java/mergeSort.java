public class mergeSort {
    public static void main(String[] args) {
        int[] array = {8, 2, 3, 4, 5, 6, 1, 7};
        mergeSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void mergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return; // base case

        int middle = length / 2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];
        
        int i = 0; // index for original array
        int j = 0; // index for right array
        
        for (; i < length; i++) {
            if (i < middle) {
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        mergeSort(leftArray);
        mergeSort(rightArray);
        merge(leftArray, rightArray, array);
    }

    // Fixed the parameter syntax here
    private static void merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int i = 0, l = 0, r = 0; // indices

        // Main merging loop
        while (l < leftSize && r < rightSize) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                l++;
            } else {
                array[i] = rightArray[r];
                r++;
            }
            i++;
        }

        // Cleanup: copy any remaining elements from left side
        while (l < leftSize) {
            array[i] = leftArray[l];
            i++;
            l++;
        }
        
        // Cleanup: copy any remaining elements from right side
        while (r < rightSize) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}


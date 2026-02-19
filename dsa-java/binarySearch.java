import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        int target = 5;

        // Sort the array before performing binary search
        Arrays.sort(arr);

        int result = binarySearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at mid
            if (arr[mid] == target) {
                return mid; // Target found
            }

            // If target is greater than mid, ignore the left half
            if (arr[mid] < target) {
                left = mid + 1;
            } else { // If target is smaller than mid, ignore the right half
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }
}
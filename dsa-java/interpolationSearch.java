public class interpolationSearch {
    public static void main(String[] args) {
        
        //interpolation search = improvment over binary search best used for uniformly distributed data
        //                       "guesses" where a value might be based on calculated probe results
        //                       if probe is incorrect , search area is narrowed, and a new probe is calculated

        //average case = O(log(log(n)))
        //worst case = O(n) [when data is not uniformly distributed]

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 7;
        int result = interpolationSearch(arr, target);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
        
        }
                private static int interpolationSearch(int[] arr, int target) {
            int low = 0;
            int high = arr.length - 1;

            while (low <= high && target >= arr[low] && target <= arr[high]) {
                if (low == high) {
                    if (arr[low] == target) {
                        return low; // Target found
                    }
                    return -1; // Target not found
                }

                // Calculate the probe position
                int pos = low + ((high - low) / (arr[high] - arr[low])) * (target - arr[low]);

                // Check if the target is present at pos
                if (arr[pos] == target) {
                    return pos; // Target found
                }

                // If target is greater than pos, ignore the left half
                if (arr[pos] < target) {
                    low = pos + 1;
                } else { // If target is smaller than pos, ignore the right half
                    high = pos - 1;
                }
            }

            return -1; // Target not found
    }
}

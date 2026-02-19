public class linearSearch {
    public static void main(String[] args) {
        
        //linear search = Iterate through a collection one element at a time

        //                runtime complexity = O(n)

        //                Disadvantage;
        //                Slow for large data sets

        //                Advantage:
        //                Fast for searches of small to medium data sets
        //                Does not require the data to be sorted
        //                useful for data structures that do not allow random access (e.g., linked lists)

        int[] array = {9,1,8,2,7,3,6,4,5};

        int index = linearSearch(array, 7);

        if(index != -1) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found in the array.");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}

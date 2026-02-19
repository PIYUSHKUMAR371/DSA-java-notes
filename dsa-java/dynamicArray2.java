public class dynamicArray2 {
    public static void main(String[] args) {
        
        dynamicArray dynamicArray = new dynamicArray();

        System.out.println(dynamicArray.capacity);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F");
        dynamicArray.add("G");
        dynamicArray.add("H");
        dynamicArray.add("I");
        dynamicArray.add("J");
        dynamicArray.add("K");

        dynamicArray.delete("A");
        dynamicArray.delete("B");
        dynamicArray.delete("C");
        dynamicArray.delete("D");
        dynamicArray.delete("E");

        // dynamicArray.insert(1, "D");
        // dynamicArray.delete("B");
        // dynamicArray.search("C");

        System.out.println(dynamicArray);
        System.out.println("size  " + dynamicArray.size);
        System.out.println("capacity  " + dynamicArray.capacity);
        System.out.println("empty  " + dynamicArray.isEmpty());
       
    }
}

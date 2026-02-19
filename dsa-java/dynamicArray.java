
public class dynamicArray {

        //Dynamic Array = resizable array (can grow and shrink in size)
        //                elements are stored in contiguous memory locations
        //                when the array is full, a new array with double the capacity is created and the old elements are copied to the new array

        //advantages?
        //1. Dynamic data structure (can grow and shrink in size),(allocate needed memory while running)
        //2. Random access (we can access any element in O(1) time complexity)
        //3. better cache locality (elements are stored in contiguous memory locations)

        //disadvantages?
        //1. Insertion and deletion is slower (we have to shift elements to insert or delete an element)
        //2. memory wastage (when the array is not full, we are wasting memory)

        //uses?
        //1. implementing dynamic arrays
        //2. implementing stacks and queues
        //3. hash tables (array of linked lists)

        int size;
        int capacity = 10;
        Object[] array ;

        public dynamicArray() {
            this.array = new Object[capacity];
        }
        public dynamicArray(int capacity){
            this.capacity = capacity;
            this.array = new Object[capacity];
        }
        public void add(Object data){//Object means it accepts anything

            if(size >= capacity){
                grow();//emergency expansion
            }
            array[size] = data;
            size++;
        }
        public void insert (int index , Object data ){
            if(size >=capacity){
                grow();
            }
            for(int i = size ; i > index ; i--){
                array[i] = array[i-1];
            }
            array[index] = data;
            size++;
        }
        public void delete(Object data){
            for(int i = 0 ; i < size ; i++){
                if (array[i] == data){
                    for(int j =0 ; j <(size - i - 1) ; j++){
                        array[i+j] = array[i+j+1];
                    }
                    array[size - 1] = null;
                    size--;
                    if(size <= (int)(capacity/3)){
                        shrink();
                    }
                }
            }
        }
        public int search(Object data){
            for(int i = 0 ; i < size ; i ++){
                if (array[i] == data){
                    return i;
                }
            }
            return -1;
        }
        private void grow(){
            int newCapacity = (int)(capacity * 2);
            Object[] newArray = new Object[newCapacity];

            for(int i =0 ; i < size ; i++){
                newArray[i] = array[i];
            }
            capacity = newCapacity;
            array = newArray;
        }
        private void shrink(){
            int newCapacity = (int)(capacity / 2);
            Object[] newArray = new Object[newCapacity];

            for(int i =0 ; i < size ; i++){
                newArray[i] = array[i];
            }
            capacity = newCapacity;
            array = newArray;
        }
        public boolean isEmpty(){
            return size == 0;
        }
        public String toString(){

            String string = "";
            for (int i = 0 ; i < size ; i++){//if we use capacity instead of size we will see all the elemnts that are not filled in the array
                string += array[i] + ", ";
            }
            if(string != ""){
                string = "[" + string.substring(0, string.length() - 2) + "]"; // Remove trailing comma and space
            }
            return string;
        }

}

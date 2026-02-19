import java.util.*;
public class hashTables {
    public static void main (String args[]){

        //Hashtable = A data structure that stores unique keys to values ex.<Integer,String>
        //            Each key/value pair i sknown as Entry
        //            Fast insertion , look up , deletion of key /value pairs
        //            not ideal fo rsmall data sets , great woith large data sets

        //hashing = takes a key and computes an integer (formula will very based on key & data type)
        //          In a Hashtable , we use the hash % capacity to calculate an index number

        //          key.hashcode() % capacity = index

        //bucket = an indexed storage location for one or more Entries
        //         can store mutiple Entries in case of a collision (Linked similarly a LinkedList)
        
        //collision = when 2 keys hash to the same index
        //            handled by chaining (storing multiple entries in the same bucket)

        //runtime complexity of hashtables
        //Best case = O(1)
        //Worst case = O(n) (when all keys hash to the same index)
        Hashtable<String,String> table = new Hashtable<>(10);

        table.put("100","Spongebob");
        table.put("101","Patrick");
        table.put("102","Squidward");
        table.put("103","Sandy");

        table.remove("102");

        System.out.println(table.get("100"));

        for(String key : table.keySet()){
            System.out.println(key.hashCode() %10 + " : " + table.get(key));//hashcode is used to get the hash value of the key
        }
    }
}

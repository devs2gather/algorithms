import java.util.Scanner;
 
class hashing {
    public static void main(String args[])
    {
 
        // Create a HashTable to store
        // String values corresponding to integer keys
        Hashtable<Integer, String>
            hm = new Hashtable<Integer, String>();
 
        // Input the values
        hm.put(1, "Hey");
        hm.put(12, "Coders");
        hm.put(15, "How are you");
        hm.put(3, "Happy Coding");
 
        // Printing the Hashtable
        System.out.println(hm);
    }
}

package DataStructure.HashTables;

import java.util.Hashtable;

public class HashTablesEx {
    /**
      Hashtable -> A data structure that stores unique keys to values ex.<Integer,String>
                   Each key/value pair is known as an Entry.
                   FAST insertion, look up, deletion of key/value pairs.
                   Not ideal for small data sets, great with large data sets

      Hashing -> takes a key and computes an integer ( formula will very based on key & data type)
                 In a Hashtable, we use the hash % capacity to calculate an index number

                 Key.hashCode() % capacity = index

     Bucket -> an indexed storage location for one more Entries
               can store multiple entries in case of a collision ( Linked similarly a LinkedList)

     Collision -> hash function generates the same index for more than one key
                    less collisions = more efficiency

     run-time complexity -> Best case O(1)
                            Worst case O(n)
      */

    public static void main(String[] args) {
        Hashtable<String, String> table = new Hashtable<>(21);

        table.put("101", "Java");
        table.put("231", "Web");
        table.put("422", "SQl");
        table.put("521", "Python");
        table.put("831", "Aws");
        table.put("567", "Devops");

        //table.remove(101);

        for (String key : table.keySet()) {
            System.out.println(key.hashCode() % 21  + "\t" + key + "\t" +table.get(key));

        }

    }

}

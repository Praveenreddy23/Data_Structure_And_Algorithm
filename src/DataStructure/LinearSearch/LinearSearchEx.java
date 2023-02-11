package DataStructure.LinearSearch;

public class LinearSearchEx {
    /**
     Linear Search -> Iterate through a collection one element at a time.

                        runtime Complexity: O(n)

            Disadvantage :
                     slow for large data sets

            Advantage :
                   Fast for searching of small to medium data sets
                   Does not need to sorted
                   Useful for data structure that do not have random access (Linkedlist)
      */
    public static void main(String[] args) {
        int[] array = {9,5,3,2,5,1,6,7,8};

        int index = linearSearch(array,1);
        if (index != -1){
            System.out.println("Element found at index: "+index);
        }else {
            System.out.println("Element not found");
        }
    }
    private static int linearSearch(int[] array, int value){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value){
                return i;
            }
        }
        return -1;
    }
}

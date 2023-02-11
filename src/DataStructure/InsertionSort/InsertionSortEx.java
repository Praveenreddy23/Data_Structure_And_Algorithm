package DataStructure.InsertionSort;

public class InsertionSortEx {
    public static void main(String[] args) {
        /**
         Insertion Sort -> after comparing elements to the left, shift elements
                           to the right to make room to insert a value
          */

        int[ ] array = {9,2,3,7,5,1,8,6,4};

        insertionSort(array);

        for(int i : array){
            System.out.print(i+" ");
        }
    }

    private static void insertionSort(int[] array) {
        for (int i = 1; i <array.length ; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}

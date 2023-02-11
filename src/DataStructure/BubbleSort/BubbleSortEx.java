package DataStructure.BubbleSort;

public class BubbleSortEx {
    /**
     bubble sort -> pairs of adjacent elements are compared , and the elements swapped if they are not in order.

                    Quadratic time O(n^2)
                   
     */
    public static void main(String[] args) {
        int array [] = {9, 2, 4, 6, 1, 7, 5, 3, 8};

        bubbleSort(array);

        for(int i : array){
            System.out.print(i+" ");
        }
        
    }

    private static void bubbleSort(int array[]) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length -i -1; j++) {
                if (array[j] > array[j+1]){//if (array[j] < array[j+1])// for reverse order
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}

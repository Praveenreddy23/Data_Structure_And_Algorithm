package DataStructure.Recursion;

public class RecursionEx {
    /**
     recursion -> When a thing is defined in terms of itself.

                     Advantage :
                       easier to read/ write
                       easier to debug

                     Disadvantages:
                       sometimes slower
                       uses more memory
      */
    public static void main(String[] args) {

        System.out.println( factorial(7));
    }

    private static int factorial(int nums) {

        if(nums < 1) return 1;

       return nums * factorial(nums - 1);
    }
}

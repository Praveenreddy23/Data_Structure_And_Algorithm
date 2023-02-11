package DataStructure.Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        /**
         Stack -> LIFO data structure. Last-In-First-Out
                  stores objects into a sort of "vertical way"
                  push() to add object to the top
                  pop() to remove object from the top

         uses of stacks ->
                       1. undo/redo features in text editors
                       2. moving back/forward through browser history
                       3.backtracking algorithms
                       4. calling functions (call stack)
         */
        Stack<String> stack = new Stack<>();

        //System.out.println(stack.empty());

        stack.push("stack1");
        stack.push("stack2");
        stack.push("stack3");
        stack.push("stack4");
        stack.push("stack5");

        //System.out.println(stack.empty());
       /** stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();*/

        System.out.println(stack.peek());
        System.out.println(stack);
       // System.out.println(stack.search("stack1"));



    }
}

package DataStructure.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        /**
         Queue -> FIFO data structure. First-In First-Out (Ex: a line of people)
                  a collection designed for holding elements prior to processing linear data structure

                 add ->enqueue,offer()
                 remove ->dequeue,poll()

         uses-> Keyboard buffer
                printer queue
         used in linkedList, priority queue

          */
        Queue<String> queue = new LinkedList<>();

        queue.offer("virat");
        queue.offer("rohit");
        queue.offer("dhavan");
        queue.offer("siraj");

      /*  System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.contains("rohit"));*/

        //System.out.println(queue.peek());

        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();
      //  queue.element();

        System.out.println(queue);


    }
}

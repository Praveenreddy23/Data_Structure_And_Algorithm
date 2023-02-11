package DataStructure.PriorityQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        /**
         Priority Queue -> Is a FIFO data structure that serves elements
                           with the highest priorities first before elements with lower priority

          */
       // Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(3.2);
        queue.offer(2.1);
        queue.offer(4.6);
        queue.offer(1.3);
        queue.offer(5.6);

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        System.out.println("-------------------LinkedList--------------");

        Queue<Double> queue1 = new LinkedList<>();

        queue1.offer(3.2);
        queue1.offer(2.1);
        queue1.offer(4.6);
        queue1.offer(1.3);
        queue1.offer(5.6);

        while (!queue1.isEmpty()){
            System.out.println(queue1.poll());
        }
    }
}

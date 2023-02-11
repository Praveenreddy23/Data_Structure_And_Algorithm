package DataStructure;

import java.util.LinkedList;

public class LinkedListEx {
    public static void main(String[] args) {
        /**
          LinkedList -> stores Nodes in 2 parts (data + address)
                        Nodes are in non-consecutive memory location
                        Elements are liked using pointers

                        -:Singly LinkedList:-
             Node                   Node                  Node
         [data|address] ->     [data|address]  ->    [data|address]

                        -:Doubly LinkedList:-
                  Node                         Node
         [address|data|address] <->   [address|data|address]

         Advantages:-
         1.Dynamic data structure (allows needed memory while running)
         2.Insertion and deletion of Nodes is easy.O(1)
         3.No/Low memory waste

         Disadvantages:-
         1.Greater memory usage (additional pointer)
         2.No random access of elements (no index [i])
         3.Accessing/Searching elements is more time-consuming.O(n)

         Uses:-
         1.implements stacks /Queues
         2.GPS navigation
         3.music playlist
         */

        LinkedList<String> linkedList = new LinkedList<>();
/*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");*/


        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
      //  linkedList.poll();
        linkedList.add(4,"E");
        linkedList.remove("E");

        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("G");

        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.removeLast());

        System.out.println(linkedList);

    }

}

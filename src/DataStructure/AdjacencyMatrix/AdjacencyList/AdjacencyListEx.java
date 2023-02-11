package DataStructure.AdjacencyMatrix.AdjacencyList;



public class AdjacencyListEx {
    /**
     Adjacency List -> An array/arrayList of LinkedLists.
                      Each LinkedList has a unique node at the head.
                      All adjacent neighbors  to that node are added to that node`s linkedList

                    run-time complexity to check an Edge : O(v)
                    space complexity : P(v + e)
      */
    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        System.out.println(graph.checkEdge(0,1));
    }
}

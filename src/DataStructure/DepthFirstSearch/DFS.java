package DataStructure.DepthFirstSearch;

public class DFS {
    /**
     Depth First Search -> Pick a route , keep going .
                           If you reach a dead end or an already visited node ,
                           backtrack to a previous node with unvisited adjacent neighbors.

     DFS -> a search algorithm for traversing
            a tree or graph data structure

        1) pick a route
        2) keep going until you reach a dead end or a previously visited node
        3) backtrack to last node that has unvisited adjacent neighbors


      */
    public static void main(String[] args) {

        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();

        graph.depthFirstSearch(2);

        System.out.println(graph.checkEdge(0,1));

    }
}

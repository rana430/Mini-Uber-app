package Routing;
import java.util.*;
public class CalcDistance {
    public static void main(String[] args) {
        int V = 5;
        int source = 0;
        int destination = 4;

        GraphBuilder graphBuilder = new GraphBuilder(V);
        graphBuilder.addEdge(0, 1, 9);
        graphBuilder.addEdge(0, 2, 6);
        graphBuilder.addEdge(0, 3, 5);
        graphBuilder.addEdge(0, 4, 3);
        graphBuilder.addEdge(2, 1, 2);
        graphBuilder.addEdge(2, 3, 4);

        List<List<Node>> adj = graphBuilder.getAdjacencyList();

        Dijkstra dijkstra = new Dijkstra(V);
        dijkstra.calculateShortestPath(adj, source);

        int minDistance = dijkstra.getShortestDistance(destination);
        if (minDistance != Integer.MAX_VALUE) {
            System.out.println("The shortest distance from node " + source + " to node " + destination + " is " + minDistance);
        } else {
            System.out.println("There is no path from node " + source + " to node " + destination);
        }

    }
}

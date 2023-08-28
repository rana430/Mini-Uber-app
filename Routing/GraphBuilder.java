package Routing;

import java.util.ArrayList;
import java.util.List;

public class GraphBuilder {
    private int V;
    private List<List<Node>> adj;

    public GraphBuilder(int V) {
        this.V = V;
        adj = new ArrayList<List<Node>>();
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj.add(item);
        }
    }

    public void addEdge(int source, int destination, int cost) {
        adj.get(source).add(new Node(destination, cost));
    }

    public List<List<Node>> getAdjacencyList() {
        return adj;
    }
}


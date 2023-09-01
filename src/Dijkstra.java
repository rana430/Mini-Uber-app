
import java.util.*;

public class Dijkstra {
    private int dist[];
    private Set<Integer> settled;
    private PriorityQueue<Node> pq;

    private int V;
    private List<List<Node>> adj;

    public Dijkstra(int V) {
        this.V = V;
        dist = new int[V];
        settled = new HashSet<Integer>();
        pq = new PriorityQueue<Node>(V, new Node());
    }

    public void calculateShortestPath(List<List<Node>> adj, int src) {
        this.adj = adj;

        for (int i = 0; i < V; i++)
            dist[i] = Integer.MAX_VALUE;

        pq.add(new Node(src, 0));
        dist[src] = 0;

        while (settled.size() != V) {
            if (pq.isEmpty())
                return;
            int u = pq.remove().node;
            if (settled.contains(u))
                continue;
            settled.add(u);
            exploreNeighbors(u);
        }
    }

    public int getShortestDistance(int destination) {
        return dist[destination];
    }

    private void exploreNeighbors(int u) {
        int edgeDistance;
        int newDistance;
        for (int i = 0; i < adj.get(u).size(); i++) {
            Node v = adj.get(u).get(i);
            if (!settled.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;
                if (newDistance < dist[v.node])
                    dist[v.node] = newDistance;
                pq.add(new Node(v.node, dist[v.node]));
            }
        }
    }
}

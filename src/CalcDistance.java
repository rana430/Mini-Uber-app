import java.util.List;

public class CalcDistance {

    public   int source;
    public int destination;
    private int V = 5;




    public CalcDistance(int destination,int source) {
        this.destination = destination;
        this.source = source;

        GraphBuilder graphBuilder = new GraphBuilder(V);
        graphBuilder.addEdge(0, 1, 9);
        graphBuilder.addEdge(0, 2, 6);
        graphBuilder.addEdge(0, 3, 5);
        graphBuilder.addEdge(0, 4, 3);
        graphBuilder.addEdge(2, 1, 2);
        graphBuilder.addEdge(2, 3, 5);
        graphBuilder.addEdge(2, 5, 7);
        graphBuilder.addEdge(3, 5, 9);
        graphBuilder.addEdge(1, 5, 10);
        graphBuilder.addEdge(4, 5, 4);


        List<List<Node>> adj = graphBuilder.getAdjacencyList();

        Dijkstra dijkstra = new Dijkstra(V);
        dijkstra.calculateShortestPath(adj, source);

        int minDistance = dijkstra.getShortestDistance(destination);
        public int getDistance()
            {
                return minDistance;
            }
        if (minDistance != Integer.MAX_VALUE) {
            System.out.println("The shortest distance from node " + source + " to node " + destination + " is " + minDistance);
            CalcPrice calculatePrice=new CalcPrice();
            int price=calculatePrice.Price(minDistance);
            Cash payment=new Cash();
            payment.processPayment(price,"EGP");
        } else {
            System.out.println("There is no path from node " + source + " to node " + destination);
        }
    }

}

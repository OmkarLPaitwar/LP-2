import java.util.*;

class AStar {

    static class Node {
        int vertex, cost;

        Node(int v, int c) {
            vertex = v;
            cost = c;
        }
    }

    int v;
    ArrayList<ArrayList<Node>> graph;

    AStar(int v) {
        this.v = v;

        graph = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
    }

    // Add Edge
    void addEdge(int src, int dest, int cost) {
        graph.get(src).add(new Node(dest, cost));
        graph.get(dest).add(new Node(src, cost));
    }

    // A* Algorithm
    void aStar(int start, int goal, int heuristic[]) {

        PriorityQueue<Node> pq = new PriorityQueue<>((a, b) -> a.cost - b.cost);

        int gCost[] = new int[v];
        int parent[] = new int[v];

        Arrays.fill(gCost, Integer.MAX_VALUE);
        Arrays.fill(parent, -1);

        gCost[start] = 0;

        pq.add(new Node(start, heuristic[start]));

        while (!pq.isEmpty()) {

            Node current = pq.poll();

            int u = current.vertex;

            if (u == goal)
                break;

            for (Node neighbor : graph.get(u)) {

                int newCost = gCost[u] + neighbor.cost;

                if (newCost < gCost[neighbor.vertex]) {

                    gCost[neighbor.vertex] = newCost;

                    int fCost = newCost + heuristic[neighbor.vertex];

                    pq.add(new Node(neighbor.vertex, fCost));

                    parent[neighbor.vertex] = u;
                }
            }
        }

        // Print Path
        System.out.print("Path: ");

        printPath(parent, goal);

        System.out.println("\nTotal Cost: " + gCost[goal]);
    }

    // Recursive Path Print
    void printPath(int parent[], int j) {

        if (j == -1)
            return;

        printPath(parent, parent[j]);

        System.out.print(j + " ");
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        AStar g = new AStar(v);

        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();

        // Input edges
        for (int i = 0; i < e; i++) {

            System.out.print("Enter source destination cost: ");

            int s = sc.nextInt();
            int d = sc.nextInt();
            int c = sc.nextInt();

            g.addEdge(s, d, c);
        }

        // Heuristic values
        int heuristic[] = new int[v];

        System.out.println("Enter heuristic values:");

        for (int i = 0; i < v; i++) {
            heuristic[i] = sc.nextInt();
        }

        System.out.print("Enter start node: ");
        int start = sc.nextInt();

        System.out.print("Enter goal node: ");
        int goal = sc.nextInt();

        System.out.println("\nA* Search:");

        g.aStar(start, goal, heuristic);

        sc.close();
    }
}
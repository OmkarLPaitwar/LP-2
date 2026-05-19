import java.util.*;

public class DijkstraSimple {

    static final int INF = 9999;

    public static void dijkstra(int graph[][], int n, int src) {

        int dist[] = new int[n];
        boolean visited[] = new boolean[n];

        // Initialize distances
        for (int i = 0; i < n; i++) {
            dist[i] = INF;
            visited[i] = false;
        }

        dist[src] = 0;

        // Find shortest path
        for (int count = 0; count < n - 1; count++) {

            int min = INF;
            int u = -1;

            // Find minimum distance vertex
            for (int i = 0; i < n; i++) {

                if (!visited[i] && dist[i] < min) {
                    min = dist[i];
                    u = i;
                }
            }

            visited[u] = true;

            // Update distances
            for (int v = 0; v < n; v++) {

                if (!visited[v] &&
                        graph[u][v] != 0 &&
                        dist[u] + graph[u][v] < dist[v]) {

                    dist[v] = dist[u] + graph[u][v];
                }
            }
        }

        // Print result
        System.out.println("Vertex \t Distance");

        for (int i = 0; i < n; i++) {
            System.out.println(i + "\t\t" + dist[i]);
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int graph[][] = new int[n][n];

        System.out.println("Enter adjacency matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter source vertex: ");
        int src = sc.nextInt();

        dijkstra(graph, n, src);

        sc.close();
    }
}
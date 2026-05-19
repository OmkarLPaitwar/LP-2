import java.util.*;

class DFSBFS {

    int v;
    ArrayList<ArrayList<Integer>> adj;

    // Constructor
    DFSBFS(int v) {
        this.v = v;

        adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    // Add edge in undirected graph
    void addEdge(int a, int b) {
        adj.get(a).add(b);
        adj.get(b).add(a);
    }

    // DFS Recursive
    void dfs(int s, boolean visited[]) {

        visited[s] = true;
        System.out.print(s + " ");

        for (int n : adj.get(s)) {
            if (!visited[n]) {
                dfs(n, visited);
            }
        }
    }

    // BFS
    void bfs(int s) {

        boolean visited[] = new boolean[v];

        Queue<Integer> q = new LinkedList<>();

        visited[s] = true;
        q.add(s);

        while (!q.isEmpty()) {

            int x = q.poll();

            System.out.print(x + " ");

            for (int n : adj.get(x)) {

                if (!visited[n]) {

                    visited[n] = true;
                    q.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();

        DFSBFS g = new DFSBFS(v);

        int ch;

        do {

            System.out.println("\n1. Add Edge");
            System.out.println("2. DFS");
            System.out.println("3. BFS");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:

                    System.out.print("Enter source vertex: ");
                    int a = sc.nextInt();

                    System.out.print("Enter destination vertex: ");
                    int b = sc.nextInt();

                    g.addEdge(a, b);

                    System.out.println("Edge Added");
                    break;

                case 2:

                    boolean visited[] = new boolean[v];

                    System.out.print("Enter starting vertex for DFS: ");
                    int d = sc.nextInt();

                    System.out.print("DFS Traversal: ");

                    g.dfs(d, visited);

                    System.out.println();
                    break;

                case 3:

                    System.out.print("Enter starting vertex for BFS: ");
                    int s = sc.nextInt();

                    System.out.print("BFS Traversal: ");

                    g.bfs(s);

                    System.out.println();
                    break;

                case 4:

                    System.out.println("Program Ended");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (ch != 4);

        sc.close();
    }
}
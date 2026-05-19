import java.util.Scanner;

public class GraphColoring {

    static int n, m;
    static int[][] g;
    static int[] color;

    static boolean safe(int v, int c) {

        for (int i = 0; i < n; i++) {
            if (g[v][i] == 1 && color[i] == c)
                return false;
        }

        return true;
    }

    static boolean solve(int v) {

        if (v == n)
            return true;

        for (int c = 1; c <= m; c++) {

            if (safe(v, c)) {

                color[v] = c;

                if (solve(v + 1))
                    return true;

                color[v] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        n = sc.nextInt();

        System.out.print("Enter number of colors: ");
        m = sc.nextInt();

        g = new int[n][n];
        color = new int[n];

        System.out.println("Enter adjacency matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = sc.nextInt();
            }
        }

        if (solve(0)) {

            System.out.println("Solution Exists");

            for (int i = 0; i < n; i++) {
                System.out.println("Vertex " + i + " -> Color " + color[i]);
            }

        } else {
            System.out.println("No Solution");
        }

        sc.close();
    }
}
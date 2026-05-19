import java.util.Scanner;

public class MST {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] g = new int[n][n];

        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                g[i][j] = sc.nextInt();
            }
        }

        boolean[] v = new boolean[n];
        v[0] = true;

        System.out.println("Edges in MST:");

        for (int k = 0; k < n - 1; k++) {

            int min = 999, x = 0, y = 0;

            for (int i = 0; i < n; i++) {
                if (v[i]) {
                    for (int j = 0; j < n; j++) {

                        if (!v[j] && g[i][j] != 0 && g[i][j] < min) {
                            min = g[i][j];
                            x = i;
                            y = j;
                        }
                    }
                }
            }

            System.out.println(x + " - " + y + " = " + min);
            v[y] = true;
        }

        sc.close();
    }
}
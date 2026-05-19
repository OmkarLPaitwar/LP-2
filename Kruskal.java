import java.util.Scanner;

public class Kruskal {

    static int[] p = new int[10];

    static int find(int x) {
        while (p[x] != 0)
            x = p[x];
        return x;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter vertices: ");
        int n = sc.nextInt();

        int[][] a = new int[n][n];

        System.out.println("Enter matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                if (a[i][j] == 0)
                    a[i][j] = 999;
            }
        }

        int e = 0;

        while (e < n - 1) {

            int min = 999, x = 0, y = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] < min) {
                        min = a[i][j];
                        x = i;
                        y = j;
                    }
                }
            }

            int u = find(x), v = find(y);

            if (u != v) {
                p[v] = u;
                System.out.println(x + " - " + y + " = " + min);
                e++;
            }

            a[x][y] = a[y][x] = 999;
        }

        sc.close();
    }
}
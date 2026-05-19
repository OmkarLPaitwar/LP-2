import java.util.*;

public class JobScheduling {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of jobs: ");
        int n = sc.nextInt();

        char[] id = new char[n];
        int[] d = new int[n];
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Job ID, Deadline, Profit:");

            id[i] = sc.next().charAt(0);
            d[i] = sc.nextInt();
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {

                if (p[i] < p[j]) {

                    int t = p[i];
                    p[i] = p[j];
                    p[j] = t;

                    t = d[i];
                    d[i] = d[j];
                    d[j] = t;

                    char c = id[i];
                    id[i] = id[j];
                    id[j] = c;
                }
            }
        }

        boolean[] slot = new boolean[n];
        char[] ans = new char[n];

        for (int i = 0; i < n; i++) {

            for (int j = Math.min(n, d[i]) - 1; j >= 0; j--) {

                if (!slot[j]) {
                    slot[j] = true;
                    ans[j] = id[i];
                    break;
                }
            }
        }

        System.out.println("Selected Jobs:");

        for (int i = 0; i < n; i++) {
            if (slot[i])
                System.out.print(ans[i] + " ");
        }

        sc.close();
    }
}
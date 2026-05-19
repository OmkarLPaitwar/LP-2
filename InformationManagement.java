import java.util.Scanner;

public class InformationManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = new String[5];
        int[] ids = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Employee ID:");
            ids[i] = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Employee Name:");
            names[i] = sc.nextLine();
        }

        System.out.println("\nStored Employee Information:");
        for (int i = 0; i < 5; i++) {
            System.out.println("ID: " + ids[i] + " Name: " + names[i]);
        }

        System.out.println("\nEnter ID to Search:");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (ids[i] == search) {
                System.out.println("Employee Found: " + names[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Employee Not Found");
        }

        sc.close();
    }
}
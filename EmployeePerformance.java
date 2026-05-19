import java.util.Scanner;

public class EmployeePerformance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();

        System.out.println("Enter Attendance Percentage:");
        int attendance = sc.nextInt();

        System.out.println("Enter Project Score:");
        int project = sc.nextInt();

        int total = attendance + project;

        System.out.println("\nEmployee Name: " + name);

        if (total >= 160) {
            System.out.println("Performance: Excellent");
        } else if (total >= 120) {
            System.out.println("Performance: Good");
        } else if (total >= 80) {
            System.out.println("Performance: Average");
        } else {
            System.out.println("Performance: Poor");
        }

        sc.close();
    }
}
import java.util.Scanner;

public class HelpDeskManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Problem Type:");
        System.out.println("1. Network");
        System.out.println("2. Software");
        System.out.println("3. Hardware");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Solution:");
                System.out.println("Restart Router and Check Cable Connection");
                break;

            case 2:
                System.out.println("Solution:");
                System.out.println("Reinstall the Software");
                break;

            case 3:
                System.out.println("Solution:");
                System.out.println("Check Hardware Connections");
                break;

            default:
                System.out.println("Invalid Problem Type");
        }

        sc.close();
    }
}
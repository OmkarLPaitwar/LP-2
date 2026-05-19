import java.util.Scanner;

public class AirlineScheduling {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Cargo Weight in KG:");
        int weight = sc.nextInt();

        System.out.println("Enter Destination Type:");
        System.out.println("1. Domestic");
        System.out.println("2. International");

        int choice = sc.nextInt();

        if (choice == 1) {

            if (weight <= 1000) {
                System.out.println("Schedule Flight: Domestic Cargo Flight");
            } else {
                System.out.println("Extra Cargo Plane Required");
            }

        } else if (choice == 2) {

            if (weight <= 5000) {
                System.out.println("Schedule Flight: International Cargo Flight");
            } else {
                System.out.println("Heavy Cargo Aircraft Required");
            }

        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
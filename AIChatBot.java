import java.util.*;

class ChatBot {

        public static void main(String args[]) {

                Scanner sc = new Scanner(System.in);

                String input;

                System.out.println("=================================");
                System.out.println("      CUSTOMER CHATBOT");
                System.out.println("=================================");
                System.out.println("Type 'bye' to exit");

                while (true) {

                        System.out.print("\nYou: ");
                        input = sc.nextLine().toLowerCase();

                        // Greeting
                        if (input.contains("hello") ||
                                        input.contains("hi")) {

                                System.out.println(
                                                "Bot: Hello! How can I help you?");
                        }

                        // Product Price
                        else if (input.contains("price") ||
                                        input.contains("cost")) {

                                System.out.println(
                                                "Bot: Product prices start from Rs. 500.");
                        }

                        // Delivery Information
                        else if (input.contains("delivery")) {

                                System.out.println(
                                                "Bot: Delivery takes 3 to 5 working days.");
                        }

                        // Payment Methods
                        else if (input.contains("payment")) {

                                System.out.println(
                                                "Bot: We support UPI, Debit Card and Cash on Delivery.");
                        }

                        // Return Policy
                        else if (input.contains("return")) {

                                System.out.println(
                                                "Bot: Return is available within 7 days.");
                        }

                        // Contact Information
                        else if (input.contains("contact")) {

                                System.out.println(
                                                "Bot: Contact us at support@gmail.com");
                        }

                        // Exit
                        else if (input.contains("bye")) {

                                System.out.println(
                                                "Bot: Thank you! Visit again.");
                                break;
                        }

                        // Unknown Input
                        else {

                                System.out.println(
                                                "Bot: Sorry, I did not understand.");
                        }
                }

                sc.close();
        }
}
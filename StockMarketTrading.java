import java.util.Scanner;

public class StockMarketTrading {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Stock Price:");
        int price = sc.nextInt();

        System.out.println("Enter Market Trend (up/down):");
        String trend = sc.next();

        if (trend.equalsIgnoreCase("up") && price < 500) {
            System.out.println("Recommendation: BUY");
        } else if (trend.equalsIgnoreCase("down")) {
            System.out.println("Recommendation: SELL");
        } else {
            System.out.println("Recommendation: HOLD");
        }

        sc.close();
    }
}
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        var console = new Scanner(System.in);
        System.out.println("*** Discount Calculator ***");

        double amountTx = -1;
        while (amountTx <= 0) {
            try {
                System.out.println("Please enter the amount : ");
                amountTx = Double.parseDouble(console.nextLine());
                if (amountTx <= 0) {
                    System.out.println("The amount can't be less than 0, please try again ...");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        int optPercent = 0;
        while (optPercent < 1 || optPercent > 3) {
            try {
                System.out.println("Chosose a discount 1. 5%, 2. 10%, 3. 15% ");
                optPercent = Integer.parseInt(console.next());
                if (optPercent < 1 || optPercent > 3) {
                    System.out.println("Please enter a option between 1 and 3");
                }
            } catch(NumberFormatException e){
            System.out.println("Invalid input. Please enter a number between 1 and 3.");
            }
        }
        double txnPercent = switch (optPercent){
            case 1 -> 0.05;
            case 2 -> 0.10;
            case 3 -> 0.15;
            default -> 0.0;
        };

        double amountDiscount = amountTx * txnPercent;
        System.out.println("The amount of discount is: $ " + String.format("%.2f", amountDiscount ));
        total(amountDiscount, amountTx);
    }

    public static void total(double discount, double original){
        var total = discount + original;
        System.out.println("The total of bill with descount is : $ " + String.format("%.2f", total));
    }
}

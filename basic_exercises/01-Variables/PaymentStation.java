import java.util.Scanner;

public class PaymentStation {
    public static void main(String[] args){
        var console = new Scanner(System.in);
        String[] products ={"Bread", "Milk", "Eggs"};
        double[] prices = {2.50, 3.00, 5.00};

        System.out.println("*** Welcome to MiniSotore ***");
        System.out.println("Avaible Products: ");

        for(int i = 0; i < products.length; ++i){
            System.out.println((i + 1) + ". " + products[i]+ " - $" + prices[i]);
        }

        int productIndex  = -1;
        while (productIndex  < 1 || productIndex > products.length) {
            try{
                System.out.println("Please select a product by entering a number ");
                productIndex = Integer.parseInt(console.nextLine());
            } catch (RuntimeException e) {
                System.out.println("Invalid option try again ...");
            }
        }

        int quantity = 0;
        while (quantity <=0){
            try {
                System.out.println("Please enter the quantity ...");
                quantity = Integer.parseInt(console.nextLine());
                if (quantity <=0){
                    System.out.println("Quantity must be greater than zero.");
                }
            }  catch (NumberFormatException e){
                System.out.println("Please enter a number greater than zero");
            }
        }

        double total = prices[productIndex - 1] * quantity;
        System.out.println("You selected: " + quantity + " x " + products[productIndex - 1]);
        System.out.println("Total to pay: $" + String.format("%.2f", total));

    }
}

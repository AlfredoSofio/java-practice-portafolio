import java.util.Scanner;

public class CalculatorOfTipping {
    public static void main(String[] args){
        var console = new Scanner(System.in);
        System.out.println("*** Restaurant Calculator ***");
        double billAmount = -1;
        while (billAmount <= 0){
            try {
                System.out.print("Please enter your bill amount : ");
                billAmount = Double.parseDouble(console.nextLine());
                if (billAmount <= 0){
                    System.out.println("Amount must be greater than zero. ");
                }
            }
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please enter a number.");
            }
        }
        int tipOption = 0;
        while (tipOption < 1 || tipOption > 3) {
            try {
                System.out.println("Please enter your tip amount: 1) 10%, 2) 15%, 3) 20% : ");
                tipOption = Integer.parseInt(console.nextLine());
                if (tipOption < 1 || tipOption > 3) {
                    System.out.println("Please choose a valid option between 1 and 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter 1, 2, or 3.");
            }
        }

        double tipPercent = switch (tipOption)
        {
            case 1 -> 0.10;
            case 2 -> 0.15;
            case 3 -> 0.20;
            default -> 0.0;
        };
        double tipAmount = billAmount * tipPercent;
        System.out.println("The amount of tip is: $" + String.format("%.2f", tipAmount));
        total(billAmount, tipAmount);
    }

    public static void total(double a, double b){
        var total = a + b;
        System.out.println("The total bill is $:  " + String.format("%.2f", total));
    }
}

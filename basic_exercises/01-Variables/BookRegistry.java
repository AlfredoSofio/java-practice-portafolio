import java.util.Scanner;

public class BookRegistry {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("**** Book Registry ****");
        System.out.print("Please enter the name of the book : ");
        var bookTitle = console.nextLine();
        System.out.print("Please enter the Id of the book : ");
        var bookId = Integer.parseInt(console.nextLine());
        System.out.print("Please enter the price of the book : ");
        var bookPrice = Double.parseDouble(console.nextLine());
        System.out.print("Please confirm the book is available (true) or not available (false) ?: ");
        var available = Boolean.parseBoolean(console.nextLine());
        System.out.println("Display the information");
        System.out.println("Book Title : " + bookTitle);
        System.out.println("Book ID : " + bookId);
        System.out.println("Book Price : $" + String.format("%.2f",bookPrice));
        System.out.println("Available : " + available);
    }
}

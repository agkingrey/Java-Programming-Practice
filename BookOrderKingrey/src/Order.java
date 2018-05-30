//Austin Kingrey
import java.text.DecimalFormat;
import java.util.Scanner;
public class Order {

	public static void main(String[] args) {
		//Variable initialization
		double subtotal = 0;
		final double TAX_RATE = .065;
		final double SHIPPING_COST = 2.95;
		int numberOfBooks = 0;
		
		//scanner in
		Scanner in = new Scanner(System.in);
		
		//Ask the user for book prices
		System.out.println("Please enter the price of your first book or type -1 to exit:");
		double bookPrice = in.nextDouble();
		
		while(bookPrice >= 0)
		{
			subtotal += bookPrice;
			numberOfBooks++;
			
			System.out.println("Enter the price of another book or -1 to exit:");
			bookPrice = in.nextDouble();
			
		}
		
		
		double tax = subtotal * TAX_RATE;
		double shipping = numberOfBooks * SHIPPING_COST;
		double totalPrice = subtotal + tax + shipping;
		
		DecimalFormat df = new DecimalFormat(".00");
		
		System.out.println("Number of Books Purchased: " +numberOfBooks);
		System.out.println("Book Subtotal: $" + df.format(subtotal));
		System.out.println("Tax: $" +df.format(tax));
		System.out.println("Shipping: $" +df.format(shipping));
		System.out.println("-----------");
		System.out.println("Order Total: $" +df.format(totalPrice));
		
		in.close();
		
	}
}

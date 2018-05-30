//Austin Kingrey
import java.text.DecimalFormat;
import java.util.Scanner;
public class ShopperRewards {

	public static void main(String[] args) {
		//First I need to declare my variables for the varying coupon and gas ranges
		double price = 0;
		double coupon1 = 10;
		double coupon2 = 60;
		double coupon3 = 150;
		double coupon4 = 210;
		double couponperc = 0;
		double gas0 = 1;
		double gas1 = 49;
		double gas2 = 99;
		double couponAmount = 0;
		int gasDiscount = 0;

		//Time to get the user input.
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the cost of your groceries: ");
		price = in.nextDouble();
		
		// Now I'll make an if statement for the coupons
		if (price < coupon1) 
		{
			couponperc = 0;
			couponAmount = price * couponperc;
		}
		else if (price >= coupon1 && price <= coupon2)
		{
			couponperc = .08;
			couponAmount = price * couponperc;
		}
		else if (price > coupon2 && price <= coupon3)
		{
			couponperc = .1;
			couponAmount = price * couponperc;
		}
		else if (price > coupon3 && price <= coupon4)
		{
			couponperc = .12;
			couponAmount = price * couponperc;
		}
		else if (price > coupon4)
		{
			couponperc = .14;
			couponAmount = price * couponperc;
		}
		//Now I'll do the same thing for the gas discount
		if (price >= gas0 && price <= gas1)
		{
			gasDiscount = 1;
		}
		else if(price > gas1 && price <= gas2)
		{
			gasDiscount = 2;
		}
		else if(price > gas2)
		{
			gasDiscount = 3;
		}
		//I need some decimal formatters to make sure my percent and money outputs correctly
		DecimalFormat df = new DecimalFormat(".00");
		DecimalFormat df2 = new DecimalFormat("0");
		
		//Now to print out the correct output to the user
		couponperc = couponperc * 100;
		System.out.print("You receive a discount coupon of: $" + df.format(couponAmount));
		System.out.print(" (" + df2.format(couponperc));
		System.out.println("% of your purchase)");
		System.out.print("You have earned a " + gasDiscount);
		System.out.println("¢ discount per gallon of gas.");
	
		in.close();
	}

}

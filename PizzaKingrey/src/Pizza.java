
public class Pizza {
	//Austin Kingrey
	private String topping;
	private String size;
	private double price;
	private int orderNumber;
	private static int nextOrderNumber = 1001;
	
	//constructor
	
	
	public Pizza(String tp, String sz, double pr)
	{
		setTopping(tp);
		setSize(sz);
		setPrice(pr);
		
		nextOrderNumber++;
		this.orderNumber = nextOrderNumber;
		
		//if to check if my size is null
		if(size.equals("error"))
		{
			throw new IllegalArgumentException("No pizza for you");
		}
	}
	
	//getters and setters
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		size.toLowerCase();
		if(size.equals("small") || size.equals("medium")||size.equals("large")||size.equals("extra large"))
		{
		this.size = size;
		}
		else
		{
			this.size = "error";
		}
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getOrderNumber() {
		return orderNumber;
	}

	//repeat order method that returns a string with all components of the current pizza
	public String repeatOrder()
	{
		 topping = getTopping();
		 size = getSize();
		 price = getPrice();
		 String repeatOrderString =  "you ordered a " + size + " " + topping + " pizza for " + price + ": " + orderNumber;
		 
		 return repeatOrderString;
	}
}

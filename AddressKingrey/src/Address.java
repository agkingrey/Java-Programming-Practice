
public class Address {
	private int houseNumber;
	private String street;
	private int aptNumber;
	private String city;
	private String state;
	private int postalCode;
	
	//constructors one with apartment number and one without
	Address(int hn, String strt, int an, String ct, String stte, int pc)
	{
		setHouseNumber(hn);
		setStreet(strt);
		setAptNumber(an);
		setCity(ct);
		setState(stte);
		setPostalCode(pc);
		
		if(state.equals("null") || postalCode == 0 )
		{
			throw new IllegalArgumentException("Nope, not gonna do it");
		}
	}
	Address(int hn, String strt, String ct, String stte, int pc)
	{
		setHouseNumber(hn);
		setStreet(strt);
		setCity(ct);
		setState(stte);
		setPostalCode(pc);
	}
	
	
	//getters and setters
	public int getHouseNumber() {
		return houseNumber;
	}
	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getAptNumber() {
		return aptNumber;
	}
	public void setAptNumber(int aptNumber) {
		this.aptNumber = aptNumber;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		if(state.length() == 2)
		{
		this.state = state;
		}
		else
		{
		this.state ="null";
		}
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		if(postalCode == 5)
		{
		this.postalCode = postalCode;
		}
		else
		{
		this.postalCode = 0;
		}
	}
	
	//print method
	public void print()
	{
		System.out.println(street);
		System.out.println(city + " " +state+ " "+postalCode);
	}
}

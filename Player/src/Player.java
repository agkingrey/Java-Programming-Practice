
public class Player {
	//instance variables
	private int number;
	private String name;
	private String position;
	
	//constructors
	public Player()
	{
		number = 0;
		name = "";
		position = "";
	}
	
	public Player(int num, String n, String p)
	{
		number = num;
		name = n;
		position = p;
	}
	
	
	//getters and setters
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	//toString
	@Override
	public String toString() {
		return "Player [number=" + number + ", name=" + name + ", position=" + position + "]";
	}
	
	
	
	
}

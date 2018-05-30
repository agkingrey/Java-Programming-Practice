package cards;

public class Card {
	private String name;
	
	//constructors
	protected Card()
	{
		name = "";
	}
	
	protected Card(String n)
	{
		name = n;
	}
	
	//getter
	
	public String getName()
	{
		return name;
	}
	
	public boolean isExpired()
	{
		return false;
	}
	
	public String format()
	{
		return "Card holder: " + name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

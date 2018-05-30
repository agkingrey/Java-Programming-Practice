package cards;
public class YMCACard extends Card {
	private String IDNumber;
	
	//constructor
	public YMCACard()
	{
		IDNumber = "";
	}
	
	public YMCACard(String n, String id)
	{
		super(n);
		setIDNumber(id);
	}
	
	public String format()
	{
		return super.format() + ", ID: " + IDNumber;
	}

	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((IDNumber == null) ? 0 : IDNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		YMCACard other = (YMCACard) obj;
		if (IDNumber == null) {
			if (other.IDNumber != null)
				return false;
		} else if (!IDNumber.equals(other.IDNumber))
			return false;
		return true;
	}

}

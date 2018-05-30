package cards;
import java.time.LocalDate;

public class DriverLicense extends Card{
	private String DLNumber;
	private LocalDate expirationDate;
	
	//constructors
	public DriverLicense()
	{
		DLNumber = "";
		expirationDate = LocalDate.now();
	}

	public DriverLicense(String n, String dln, LocalDate e)
	{
		super(n);
		setDLNumber(dln);
		setExpirationDate(e);
	}
	
	public String format()
	{
		return super.format() + ", DLNumber: " + DLNumber + " , Expiration Date: " + expirationDate;
	}
	
	//method to see if the licens is expired
	public boolean isExpired()
	{
		LocalDate current = LocalDate.now();
		LocalDate expires = this.getExpirationDate();
		
		//if statement for the test
		if(expires.isBefore(current))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//getters and setters
	public String getDLNumber() {
		return DLNumber;
	}

	public void setDLNumber(String dLNumber) {
		DLNumber = dLNumber;
	}

	public LocalDate getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(LocalDate expirationDate) {
		this.expirationDate = expirationDate;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((DLNumber == null) ? 0 : DLNumber.hashCode());
		result = prime * result + ((expirationDate == null) ? 0 : expirationDate.hashCode());
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
		DriverLicense other = (DriverLicense) obj;
		if (DLNumber == null) {
			if (other.DLNumber != null)
				return false;
		} else if (!DLNumber.equals(other.DLNumber))
			return false;
		if (expirationDate == null) {
			if (other.expirationDate != null)
				return false;
		} else if (!expirationDate.equals(other.expirationDate))
			return false;
		return true;
	}
	

}

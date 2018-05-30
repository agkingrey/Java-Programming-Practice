package cards;
public class DebitCard extends Card {
	private String cardNumber;
	private int PIN;
	
	public DebitCard()
	{
		cardNumber = "";
		PIN = 0;
	}
	
	public DebitCard(String n, String cn, int pinb)
	{
		super(n);
		setCardNumber(cn);
		setPIN(pinb);
	}
	
	
	
	public String format()
	{
		return super.format() + ", CardNumber: " + cardNumber + " , PIN: " + PIN;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getPIN() {
		return PIN;
	}
	public void setPIN(int pIN) {
		PIN = pIN;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + PIN;
		result = prime * result + ((cardNumber == null) ? 0 : cardNumber.hashCode());
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
		DebitCard other = (DebitCard) obj;
		if (PIN != other.PIN)
			return false;
		if (cardNumber == null) {
			if (other.cardNumber != null)
				return false;
		} else if (!cardNumber.equals(other.cardNumber))
			return false;
		return true;
	}
	
	
}

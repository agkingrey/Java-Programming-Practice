
public class BasketballPlayer extends Player{
	private double freeThrowPercentage;
	
	public BasketballPlayer()
	{
		freeThrowPercentage = 0;
	}
	
	public BasketballPlayer(int num, String n, String p, double ftp)
	{
		super(num,n,p);
		freeThrowPercentage = ftp;
	}
	
	//getters and setters
	public double getFreeThrowPercentage() {
		return freeThrowPercentage;
	}

	public void setFreeThrowPercentage(double freeThrowPercentage) {
		this.freeThrowPercentage = freeThrowPercentage;
	}

	@Override
	public String toString() {
		return "BasketballPlayer [freeThrowPercentage=" + freeThrowPercentage + ", getNumber()=" + getNumber()
				+ ", getName()=" + getName() + ", getPosition()=" + getPosition() + "]";
	}
	

}

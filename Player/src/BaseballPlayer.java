
public class BaseballPlayer extends Player{
	private double battingAverage;
	
	//constructors
	public BaseballPlayer()
	{
		battingAverage = 0;
	}
	public BaseballPlayer(int num, String n, String p, double ba)
	{
		super(num,n,p);
		battingAverage = ba;
	}
	
	//getters and setters
	public double getBattingAverage() {
		return battingAverage;
	}
	public void setBattingAverage(double battingAverage) {
		this.battingAverage = battingAverage;
	}
	@Override
	public String toString() {
		return "BaseballPlayer [battingAverage=" + battingAverage + ", getNumber()=" + getNumber() + ", getName()="
				+ getName() + ", getPosition()=" + getPosition() + "]";
	}
	

}

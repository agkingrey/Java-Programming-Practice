package billfold;
import cards.Card;

public class Billfold {
	private Card card1;
	private Card card2;
	
	public void addCard(Card n)
	{
		if(card1 == null)
		{
			card1 = n;
		}
		else if (card2 == null)
		{
			card2 = n;
		}
		
	}
	
	public int getExpiredCardCount()
	{
		int count = 0;
		if(card1.isExpired())
		{
			count++;
		}
		else if(card2.isExpired())
		{
			count++;
		}
		
		return count;
		
	}
	
	public String formatCards()
	{
		return card1.format() + " | " + card2.format();
	}

}

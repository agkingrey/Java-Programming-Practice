import java.time.LocalDate;

import billfold.Billfold;
import cards.DebitCard;
import cards.DriverLicense;
import cards.YMCACard;

public class BillFoldTesterKingrey {
	public static void main(String[] args){
		//create two cards and a billfold
		DebitCard dc = new DebitCard("Austin Kingrey", "4789 2089 3749 2738 1973", 7897);
		YMCACard yc = new YMCACard("Josh Wilson","AE789070");
		Billfold bf = new Billfold();
		
		//add cards to the billfold
		bf.addCard(dc);
		bf.addCard(yc);
		
		//print out the cards
		System.out.println(bf.formatCards());
		
		//two more cards and a new billfold
		DriverLicense dl = new DriverLicense("Billy Joel", "AJI8897O8", LocalDate.of(2010, 5, 23));
		DebitCard dc2 = new DebitCard("Morgan Stonewall", "1739 3874 7890 1073 2798", 1734);
		
		Billfold bf2 = new Billfold();
		
		//add cards to billfold 2
		bf2.addCard(dl);
		bf2.addCard(dc2);
		
		//print whether there are any expired cards in billfold 2
		System.out.println(bf2.getExpiredCardCount());
		
		YMCACard me = new YMCACard("Kelli", "1QAZXSW");
		YMCACard husband = new YMCACard("Kelli", "1QAZXSW");
		
		System.out.println(me.equals(husband));
	}

}

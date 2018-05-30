
public class PlayerTesterKingrey {

	public static void main(String[] args) {
		BaseballPlayer bp = new BaseballPlayer(23,"Billy Bob", "Catcher", 3.34);
		BaseballPlayer bp2 = new BaseballPlayer(45,"Jo Gene", "2nd Base", 0.55);
		
		BasketballPlayer baskp = new BasketballPlayer(23,"Alex Bowman", "Center",.45);
		BasketballPlayer baskp2 = new BasketballPlayer(47,"Austin Kingrey","Point Guard", .89);
		
		System.out.println(bp.toString());
		System.out.println(bp2.toString());
		System.out.println(baskp.toString());
		System.out.println(baskp2.toString());
	}

}

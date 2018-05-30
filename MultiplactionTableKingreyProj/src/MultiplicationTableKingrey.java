
public class MultiplicationTableKingrey {
	public static void main(String[] args) {
		int mult;
		// first for loop for the collumns
		for (int i = 1; i <= 12; i++) {
			System.out.print(i);
			// This is a creative way I found to clean up the table's appearance
			if (i < 10)
				System.out.print(" :");
			else
				System.out.print(":");

			// Second for loop for rows
			for (int j = 1; j <= 12; j++) {
				mult = i * j;
				System.out.print(" " + mult);

				// Some more creative cleanup:)
				if (mult < 10)
					System.out.print("  ");
				else if (mult < 100)
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

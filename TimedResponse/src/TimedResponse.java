import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class TimedResponse {

	public static void main(String[] args) {
		//declare and set and grab a time right when the program starts
		LocalDateTime beginningTime = LocalDateTime.now();
		
		//set time to valueOfBeg
		int valueOfBeg = beginningTime.getSecond();
		
		Scanner in = new Scanner(System.in);
		JOptionPane.showConfirmDialog(null,"Are you a close TSwift fan?");
		
		LocalDateTime endTime = LocalDateTime.now();
		
		int valueOfEnd = endTime.getSecond();
		
		int difference = valueOfEnd - valueOfBeg;
		

		JOptionPane.showMessageDialog(null, "End seconds: " + valueOfBeg + "\nStart seconds: "
		+ valueOfEnd + "\nIt took " + difference +
		" seconds for you to answer.\nWas it a difficult decision?");
		
		in.close();
		

	}

}

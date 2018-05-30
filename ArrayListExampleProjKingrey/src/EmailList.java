import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class EmailList {

	public static void main(String[] args) throws IOException {

 String address = "http://www.dmacc-diad.com/classroom/emaillist.txt";
 URL pageLocation = new URL(address);
 Scanner in = new Scanner(pageLocation.openStream());

 while(in.hasNextLine()){
 String person = in.nextLine();
 System.out.println(person);
 }


 in.close();
 }

}

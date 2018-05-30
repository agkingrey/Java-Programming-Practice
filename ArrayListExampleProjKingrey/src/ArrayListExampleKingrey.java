import java.util.ArrayList;

public class ArrayListExampleKingrey {

	public static void main(String[] args) {
		
		//skeleton program creating arraylist names and printing it out
		ArrayList<String> names = new ArrayList<String>();
	    System.out.println(names);
	    
	    // a. adding names
	    
	    names.add("Andy");
	    names.add("Angela");
	    names.add("Dwight");
	    names.add("Erin");
	    names.add("Jim");
	    names.add("Michael");
	    names.add("Pam");
	    names.add("Toby");
	    System.out.println(names);
	    
	    //b. use get to print and retrieve the names
	    for(int i = 0; i < names.size(); i++)
	    {
	    	System.out.print(names.get(i) + " ");
	    }
	    System.out.print("\n");
	    
	    //c. print the size
	    System.out.println(names.size());
	    
	    //d. use size to print last element
	   for(int i = 0; i <names.size(); i++)
	   {
		   if((i+1) == names.size())
		   {
			   System.out.println(names.get(i));
		   }
	   }
	   
	   //e. use set to change andys name
	   names.set(0, "Andy Bernard");
	   System.out.println(names);
	   
	   //f. use alternative form of add
	   String kelly = "Kelly";
	   names.add(5,kelly);
	   System.out.println(names);
	   
	   //g. use enhance for loop
	   for(String i: names)
	   {
		   System.out.print(i + " ");
	   }
	   System.out.print("\n");
	   
	   //h. copy names to names 2
	   ArrayList<String> names2 = new ArrayList<String>();
	   
	   names2.addAll(names);
	   System.out.println(names2);
	   
	   //i. remove and from names
	   names.remove(0);
	   System.out.println(names);
	   System.out.println(names2);
	}

}

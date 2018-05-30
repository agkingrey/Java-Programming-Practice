
public class CourseTesterKingrey {

	public static void main(String[] args) {
		Course course1 = new Course("E567", "English", 3);
		Course course2 = new Course("E567", "Math", 2);
		Course course3 = new Course("E567", "Science", 4);
		Course course4 = new Course("E567", "German", 1);
		Course course5 = new Course("E567", "Social Studies", 3);
		
		Course course6 = new Course();
		
		//set instructors
		course1.setInstructor("Bill Bob");
		course2.setInstructor("Jean Shmean");
		course3.setInstructor("Joe Shmoe");
		
		//print
		course1.formattedString();
		course2.formattedString();
		course3.formattedString();
		course4.formattedString();
		course5.formattedString();
		
		course6.duplicateDetails(course1);

	}

}

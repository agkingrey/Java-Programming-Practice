import javax.swing.plaf.synth.SynthSeparatorUI;

//Austin Kingrey
public class Course {
	private int crn;
	private String courseID;
	private String courseName;
	private int credits;
	private String instructor;
	private static int nextcrn = 25000;
	//constructor
	public Course(String courseID, String courseName, int credits)
	{	
		//if statement for verification
		if(!(courseName.equals(null)|| courseID.equals(null) || credits == 0))
		{
			instructor = "staff";
			
			nextcrn++;
			this.crn = nextcrn;
			
		}
		else
		{
			throw new IllegalArgumentException("You suck");
		}
		
		
	}
	public Course()
	{
		
	}
	public Course duplicateDetails(Course c)
	{
		 c = new Course(this.courseID, this.courseName, this.credits);
		 crn++;
		 return c;
	}
	
	
	
	
	public int getCrn() {
		return crn;
	}
	public String getCourseID() {
		return courseID;
	}
	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		if(credits <= 5)
		{
		this.credits = credits;
		}
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	@Override
	public String toString() {
		return "Course [crn=" + crn + ", courseID=" + courseID + ", courseName=" + courseName + ", credits=" + credits
				+ ", instructor=" + instructor + "]";
	}
	
	public void formattedString()
	{
		System.out.println("Course Name: " + courseName);
		System.out.println("Course ID: " + courseID);
		System.out.println("Instructor: " + instructor);
		System.out.println("Credits: " + credits);
		System.out.println("Course Registration Number: " + crn);
	}
	
	

}

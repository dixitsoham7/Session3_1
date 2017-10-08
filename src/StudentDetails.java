
public class StudentDetails {
	
	private static int totalMarks; //variable is a private static created when program starts and destroyed when it stops
	
	private static int uId; //default value of static variable = 0
	
	public static final String Department = "IT";  //department is constant(it cannot change its value)
 	
	public String name;  //visible to any child class
	
	private int marks;   //visible only to Student class
	
	protected int roll;  //visible to all classes in same package
	
	public StudentDetails(String studName,int studMarks) //name and marks variable is assigned in a constructor
	{
		name = studName;
		marks=studMarks;
	}
	
	public void setRoll(int studRoll) //roll variable is assigned a value
	{
		roll=studRoll;
	}
	
	public void printDetails() //method to print details of student
	{
		System.out.println("Example to demonstrate use of INSTANCE variable");      //instance variables are declared in a class but defined outside
		System.out.println("Student Details : \nName -> "+name+"\nMarks -> "+marks+"\nRoll No -> "+roll);  //printing the details
		 
	}
	public static void main(String[] args) {
		 
		StudentDetails obj  = new StudentDetails("Soham",100);  //with the help of new keyword object is created hence instance variables are created
		obj.setRoll(3);  //passing value to setRoll method
		obj.printDetails(); //calling printDetails method
		
		StudentDetails.totalMarks = 100; //accessed by using className.staticVariable
		StudentDetails.uId=3; //static variables are class variables
		System.out.println("\nExample to demonstrate use of CLASS variable ");
		System.out.println("Student Details : \nDepartment -> "+Department + "\nUnique Id -> "+uId+ "\nTotal Marks -> "+totalMarks); //if Department variable(constant) is to be accessed outside class -> StudentDetails.Department

	}

}

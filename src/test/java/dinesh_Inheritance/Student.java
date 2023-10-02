package dinesh_Inheritance;

public class Student extends Teacher {
	
	public static void methodfour()
	{
		System.out.println("methodfour from child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodone();
		methodtwo();
		methodthree();
		methodfour();
	//three methods are obtained from Teacher class as we write EXTENDS key in the class "Student extends Teacher".
		// this is called Inheritance
	}

}

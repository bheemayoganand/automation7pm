package dinesh_Inheritance;

public class subStudent extends Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methodone();
		methodtwo();
		methodthree();
		methodfour();
		
// here subStudent extends from student class. student created his one own method and three methods extends from teacher class.
// now all the four methods will be printed here as subStudent extends Student.
//If subStudent extends Teacher, only THREEE METHODS will print as Teacher having only three methods.
	}

}

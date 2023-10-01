package dinesh_StaticNonstatic;

public class StaticVSnonstatic {
	
		static int x = 9999; //Global variable
	
	public static void methodone() //static method
	{
		int x = 9999; //variable
		System.out.println("static variable value" + " " + x);
	}
	
	public void methodtwo() //instance method or non static method
	{
		int x = 9999;  // variable
		System.out.println("non static variable value" + " " + x);
	}
			

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 9999; //local variable
		System.out.println("local variable value" + " " + x);  // after run the programme first "LOCAL VARIABLE VALUE 9999 will print
												// bcos it is local variable in main method which is static
		
		methodone();//this is used to print "STATIC VARIABLE VALUE 9999". this statement is used to print the value which outside the main method
	
		StaticVSnonstatic obj = new StaticVSnonstatic();// to print the non static values we need to create the object first then call
		obj.methodtwo();
		
		
	}

}

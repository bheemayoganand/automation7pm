package dinesh_polymorphism;

public class Method_OverLoading { // same methods reused or over load in one class. this is called method overloading.
	
	public static void methoddinesh(String s1, int num1, float f1)
	{
		System.out.println(s1+"  "+num1+" " +f1);
	}
	
	public static void methoddinesh(float f2, String s2)
	{
		System.out.println(f2+" "+s2 );
	}
	
	public static void methoddinesh(int num, String s2, int num3)
	{
		System.out.println(num+" "+num3);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		methoddinesh("dinesh",100,12.5f);
		methoddinesh(25.2f,"rudra");
		methoddinesh(25,"rudra",65);
		

	}

}

package harish_package;

public class swapwithoutusingtemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=300, b=400;
		
		System.out.println("Before swapping values are.."+a+"  "+b);
		
		a=a+b;//300+400=700
		
		b=a-b;//700-400=300
		
		a=a-b;//700-300=400
		
		System.out.println("Hi");
		
		
		System.out.println("After swapping values are.."+a+"  "+b);
	}

}

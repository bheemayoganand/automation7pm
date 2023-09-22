package Gowriswapping;

public class gspractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//swapping of two numbers using temp variable
		int a=30,b=60;
		System.out.println("before swapping the numbers = "+a+" "+b);
		int t=a;
		    a=b;
		    b=t;
		 System.out.println("after swapping the numbers = " +a+" "+b);  
		 
		 
//without using the third variable using addition and subtraction
		 
		 int x=20,y=7;
		   x=x+y; // 20+7=27
		   y=x-y;//27-7=20
		   x=x-y;//27-20=7
		  System.out.println("after swapping the numbers.." +x+" "+y);
		  
//swapping without third variable using concatenation and multiplication
		  
		  int g=30,h=10;
		  System.out.println("before swapping the numbers.." +g+" "+h);
		  g=g*h;
		  h=g/h;
		  g=g/h;
		  System.out.println("after the swapping the numbers.."+g+" "+h);
	}

}

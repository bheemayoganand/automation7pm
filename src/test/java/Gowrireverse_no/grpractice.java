package Gowrireverse_no;

import java.util.Scanner;

public class grpractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//write a program to reverse the number 1053
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=1053;
		int rev=0;
		while(num!=0);
		{
		 rev= rev*10+num%10;
		 //rev=0*10+1053%10=3
		 //rev=3*10+105%10=35
		 //rev=35*10+10%10=350
		 
		 //rev=350*10+0%10=3501
		 num=num/10; //num=1053/10 153/10=15 15/10=1 1/10=0
		}
	   System.out.println("Reverse number is :"+rev);
		}
		
	}



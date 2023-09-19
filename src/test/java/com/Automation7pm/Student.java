package com.Automation7pm;

public class Student {
	
	
	
	private int stuNo;//Declaration of the variable type of integer
	
	public String stuName;
	
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	//setting the value to the variable 
	public void setStuNo(int stuNo) //single parameter
	{
		this.stuNo = stuNo;
	}
	
	//getting that paricular value from the variable 
	public int getStuNo() {
		return stuNo;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu=new Student();
		
		stu.setStuNo(101);
		
		System.out.println(stu.getStuNo());
		
		stu.setStuName("Gowri");
		
		System.out.println(stu.getStuName());
		
		//System.out.println("basic way of calling the value:"+sno);
		
	}

}

package dinesh_constructor;

public class studentInfo {
	
	String name;
	int rollno;
	int age;
	
	//creating a constructor
	
	studentInfo(String name, int rollno, int age) //constructor
	{
		this.name=name;
		this.rollno=rollno;
		this.age=age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		studentInfo s1= new studentInfo("dinesh", 101, 15);
		studentInfo s2=new studentInfo("rudra", 102, 15);
		
		System.out.println(s1.name +" "+ s1.rollno+" "+ s1.age);
		System.out.println(s2.name +" "+ s2.rollno +" "+ s2.age);
		
		
	}

}

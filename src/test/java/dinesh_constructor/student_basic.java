package dinesh_constructor;

public class student_basic {
	
	
	String name;
	int rollno;
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student_basic s1=new student_basic();
		System.out.println(s1.name);
		System.out.println(s1.rollno);
		
		student_basic s2=new student_basic();
		System.out.println(s2.name);
		System.out.println(s1.rollno);
		
		student_basic s3=new student_basic();
		System.out.println(s3.name);
		System.out.println(s1.rollno);
		
	}

}

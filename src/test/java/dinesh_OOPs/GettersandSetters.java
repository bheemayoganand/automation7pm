package dinesh_OOPs;

public class GettersandSetters {
	
	private int stuNo;
	public String stuName;
	
	
	//setting the value to the variable
	
	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public void setStuNo(int stuNo) {
		this.stuNo = stuNo;
	}
	
	// getting that particular value from the variable
	public int getStuNo() {
		return stuNo;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//classname  object		  class name
		GettersandSetters stu      =  new GettersandSetters(); // object is created to call the non static methods into main method
		
		stu.setStuNo(006);//set the student number
		
		System.out.println(stu.getStuNo()); // to print the student number write SOP
		
		stu.setStuName("dinesh");			// String name must be given in double quotation
		System.out.println(stu.getStuName());
				
	}

}

package dinesh_constructor;

public class EmployeeInfo_byObj {
	
	String name;
	int ID;
	String designation;
	
	//constructor.... name should be same as class name//
	EmployeeInfo_byObj(String name, int ID, String designation)
	{
		this.name = name;
		this.ID = ID;
		this.designation = designation;
	}
	
	void display()
	{
		System.out.println(name+" "+ ID +" "+ designation);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeInfo_byObj e1 = new EmployeeInfo_byObj("dinesh",101,"Engineer");
		EmployeeInfo_byObj e2 = new EmployeeInfo_byObj("rudra", 102,"Senior Engineer");
		
		e1.display();
		e2.display();
			

	}

}

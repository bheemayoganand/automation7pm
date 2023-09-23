package dinesh_flowcontrols;

public class ifelseif {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		int marks=63;
		
		if (marks<35)
		{
			System.out.println("Fail");
		}
		else if(marks>=35&&marks<50)
		{
			System.out.println("C Grade");
		}
		else if(marks>=50&&marks<65)
		{
			System.out.println("B Grade");
		}
		else if(marks>=65&&marks<80)
		{
			System.out.println("A Grade");
		}
		else if(marks>=80&&marks<100)
		{
			System.out.println("A+ Grade");
		}
		else
		{
			System.out.println("Invalid Data");
		}
	}
	

}

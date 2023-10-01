package dinesh_OOPs;

public class abstraction {
	
	public void methodone()
	{
		int x = 629;
		System.out.println(x);
	}

	public void methodtwo()
	{
		int y = 824;
		System.out.println(y);
	}
	
	public void methodthree()
	{
		int z = 555;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abstraction din = new abstraction(); // object is to created to call the non static data into the main method.
		
		din.methodone();
		din.methodtwo(); 		// once we enter object din.m___ we get the no of methods available in the entire class.
		din.methodthree();		//  this is called ABSTRACTION
	

	}

}

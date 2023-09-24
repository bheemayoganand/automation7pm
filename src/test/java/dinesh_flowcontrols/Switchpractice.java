package dinesh_flowcontrols;

public class Switchpractice {
	
	public static void selectSubscription (String name)
	{
		switch (name)
		{
		case "199 pack":
			System.out.println("mobile pack activated");
			break;
			
		case "249 pack":
			System.out.println("mobile plus laptop pack activated");
			break;
			
		case "349 pack":
			System.out.println("mobile plus laptop gold pack activated");
			break;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 selectSubscription("349 pack");
		  

	}

}

package dinesh_polymorphism;

public class test_overRiding {
	// same method is followed in different classes. this is called method over riding
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bethiredddy_travels bt;
		
		bt=new Orange_travels();
		System.out.println("Orange Travels rate to Goa is"+" "+ bt.getTicketRate());
		
		bt=new KMBT_travels();
		System.out.println("KMBT Travels rate to Goa is"+" "+ bt.getTicketRate());
		
		bt=new kaveri_travels();
		System.out.println("Kaveri Travels rate to Goa is"+" "+ bt.getTicketRate());
		
	}

}

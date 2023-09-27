package gowri_polymorphism_mor;

public class grun_polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gowri_travels t;
		
		t = new g_garuda ();
		System.out.println("garuda travel ticket rate to palakol is" + " = " + t.getTicketRate());
		
		t = new g_godavari ();
		System.out.println("godavari travel ticket rate to palakol is" + " =" + t.getTicketRate());
		
		t = new g_kamakshi ();
		System.out.println("godavari travel ticket rate to palakol is" +" = " + t.getTicketRate());
		
		
		t = new g_kaveri ();
		System.out.println("godavari travel ticket rate to palakol is" + " = " + t.getTicketRate());
		
		
		t = new g_orange ();
		System.out.println("godavari travel ticket rate to palakol is" + "= " + t.getTicketRate());	
		
		
	}

}

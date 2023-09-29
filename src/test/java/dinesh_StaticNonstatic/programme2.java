package dinesh_StaticNonstatic;

public class programme2 {


		static int x=111; //static
		int y=222; //non static or instance
		
		
		public static void main(String[] args) {
			
			System.out.println(x); // to print 111 value, directly we can write SOP because main method and 111 value both are static 
			
			programme2 obj = new programme2(); // 222 value directly cant be printed bcos 222 is non static and main methos is static.
												// therefore, Object need to be created to print 222 value which is non static
			System.out.println(obj.y);
			
			
	}
	}

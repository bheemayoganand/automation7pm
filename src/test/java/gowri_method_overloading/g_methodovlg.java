package gowri_method_overloading;

public class g_methodovlg {

 public static void methodgowri(int number,String s1, float f1) {
	 System.out.println("methodgowri");
 }
 public static void methodgowri(String s2, float f2, int number) {
	 System.out.println("methodgowri");
 }
public static void methodgowri(int number, float f3, String s3) {
	System.out.println("methodgowri");
}
public static void methodgowri(String s4, int number) {
	 System.out.println("methodgowri");
}	
public static void methodgowri(int number,float f5) {
	 System.out.println("methodgowri");
}	
public static void methodgowri(String s6, float f6) {
	 System.out.println("methodgowri");
}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		methodgowri(108,"gowri",3.5f);
		methodgowri("harish", 3.2f,110);
		methodgowri(111,3.6f,"dinesh");
		methodgowri("amala",112);
		methodgowri(113,3.9f);
		methodgowri("jyothi",2.99f);
	}

}

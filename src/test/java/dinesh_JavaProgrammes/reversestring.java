package dinesh_JavaProgrammes;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str="BRSD";
		String rev="";
		int len=str.length();
		
		for(int i = len-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("reversed string is: " +rev);
				
	}

}
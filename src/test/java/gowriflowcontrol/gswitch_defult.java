package gowriflowcontrol;

public class gswitch_defult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String name = "opera";
       switch (name) {
       case "firefox" :
    	   System.out.println("firefox browser started");
    	   break;
       case "google chrome":
    	   System.out.println("google chrome browser started");
    	   break;
       case "edge":
    	   System.out.println("edge browser started");
    	   break;
    	 default:
    		 System.out.println("invalid browser names, please provide the vallid browser name");
  
       }
	}

}

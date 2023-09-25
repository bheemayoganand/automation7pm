package gowriflowcontrol_selective;

public class gowriswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//instead of using many if ...else statements, you can use the switch statements
//the switch statement selects one of many code blocks to be executed
//when java reaches a break keyword,it breaks out of the switch block
//this will stop execution of more code and case testing inside the block
//when match is found, the job is done,its time for break
		int day = 2;
		switch (day) {
		case 1:
			System.out.println("monday");
		break;
		case 2:
			System.out.println("tuesday");
		break;
		case 3:
			System.out.println("wednesday");
		break;
		case 4:
			System.out.println("thursday");
		break;
		}
		
	}

}

package dinesh_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class webrun {
	
	public static WebDriver driver = null;  //polymorphism overloading concept
	public static void commoncode()  //creating a method
	
	//chrome+path
	{
		System.setProperty("webdriver.chrome.driver", "./driversfolder/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//webdriver------>chrome driver
		
	driver=new ChromeDriver(); //polymorphism overloading concept
	driver.get("https://www.amazon.com/");
	System.out.println(driver.getTitle());
	driver.manage().window().maximize();
	
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		commoncode();
		

	}

}

package aSeleniumPractical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayOneTask2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\My Java Programs\\Java and Selenium\\Selenium\\Browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Launching the url
		driver.get("http://www.greenstechnologys.com/");
		String s1 = driver.getTitle();
		System.out.println(s1);
		
		driver.get("http://gmail.com/");
		String s2 = driver.getTitle();
		System.out.println(s2);
	
		driver.get("http://www.flipkart.com/");
		String s3 = driver.getTitle();
		System.out.println(s3);
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		String s4 = driver.getTitle();
		System.out.println(s4);
		

	}
}

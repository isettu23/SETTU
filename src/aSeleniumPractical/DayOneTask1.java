package aSeleniumPractical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DayOneTask1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\My Java Programs\\Java and Selenium\\Selenium\\Browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//Launching the url
		driver.get("http://www.greenstechnologys.com/");
		String s1 = driver.getTitle();
		System.out.println(s1);
		
		driver.get("https://www.facebook.com/");
		String s2 = driver.getTitle();
		System.out.println(s2);
	
		driver.get("https://www.amazon.in");
		String s3 = driver.getTitle();
		System.out.println(s3);
		
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		String s4 = driver.getTitle();
		System.out.println(s4);
		

	}
}

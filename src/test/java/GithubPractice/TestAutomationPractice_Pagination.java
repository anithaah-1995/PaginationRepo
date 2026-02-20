package GithubPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAutomationPractice_Pagination {
	public static void main(String[] args) {

		System.out.println("helo");
		System.out.println("hello-2");

		 String product = "Wireless Earbuds";
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	        driver.get("https://testautomationpractice.blogspot.com/");
	        Actions act = new Actions(driver);
	        act.moveToElement(driver.findElement(By.xpath("//h2[text()='Form']"))).perform();
	        driver.findElement(By.xpath("//table[@id='productTable']//td[text()='" + product + "']/following-sibling::td/input")).click();
	                
	   

	}
}
	


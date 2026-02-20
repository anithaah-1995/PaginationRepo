package GithubPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestAutomatoionDynamicTable {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://testautomationpractice.blogspot.com");
    
    Actions act = new Actions(driver);
    act.scrollByAmount(0, 2000).perform();
    
    String browsername = "Firefox";
    
   WebElement browser = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr/td[text()='"+browsername+"']"));
   String cpu = driver.findElement(By.xpath("//table[@id='taskTable']/tbody/tr/td[text()='"+browsername+"']/following-sibling::td[contains(text(),'%')]")).getText();
   System.out.println(cpu);
   
   
}
}

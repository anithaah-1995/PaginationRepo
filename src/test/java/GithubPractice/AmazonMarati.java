package GithubPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMarati {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    driver.get("https://www.amazon.in");
    Actions act = new Actions(driver);
    act.moveToElement(driver.findElement(By.xpath("//div[@id='icp-nav-flyout']"))).perform();
    driver.findElement(By.xpath("//div[@id='nav-flyout-icp']/descendant::ul[@role='list']/descendant::a[@href='#switch-lang=mr_IN']/span/i")).click();
}
}

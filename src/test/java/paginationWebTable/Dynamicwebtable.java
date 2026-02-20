package paginationWebTable;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Dynamicwebtable {
@Test
public void dynamictabel() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	String name="Chrome";
	WebElement element = driver.findElement(By.xpath("//div[@id='HTML12']"));
	Actions act=new Actions(driver);
	act.scrollToElement(element).perform();
	String cpu = driver.findElement(By.xpath("//div[@id='HTML12']//div[@class='widget-content']/descendant::tr/td[text()='"+name+"']/following-sibling::td[contains(text(),'%')]")).getText();
	System.out.println(cpu);
}
}

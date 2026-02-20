package paginationWebTable;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class PaginateWebTable {
@Test
public void automateWebtable() throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	//WebElement element = driver.findElement(By.xpath("//div[@class='column-center-outer']/descendant::div[@id='HTML8']"));
	WebElement element = driver.findElement(By.xpath("//div[@class='widget Stats']"));
	String expexted_value="E-Reader";
	Thread.sleep(2000);
	Actions act=new Actions(driver);
	act.scrollToElement(element).perform();

						
	for(int j=2; ; j++)
			{
				
				try {
					
					
					for(int i=1; ;i++)
					{
				
						WebElement element1 = driver.findElement(By.xpath("(//h2[text()='Pagination Web Table']/..//div/div//tr/td[2])["+i+"]"));
						String actual = element1.getText();
						System.out.println(actual);
						
						
						if(expexted_value.equals(actual))
						{
							driver.findElement(By.xpath("//td[text()='E-Reader']/following-sibling::td/input[@type='checkbox']")).click();
							return; 
						}
					}
				}
				catch(Exception e) {
					driver.findElement(By.xpath("//ul[@id='pagination']/li/a[text()='"+j+"']")).click();
				
				}
			}
			
			
}
}



		
	

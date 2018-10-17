import java.io.IOException;
import java.sql.Date;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
 


public class Faceoff 
{

	public static void main(String[] args) throws Exception {
		
		try
		{
			java.util.Date d=new java.util.Date();
			String data=d.getDay()+""+d.getMonth()+d.getYear()+d.getHours()+d.getMinutes()+d.getSeconds();
			System.getProperty("webdriver.chrome.driver","/home/webonise/eclipse-workspace/FaceOfAssignment/Resource/chromedriver");
			WebDriver driver=new ChromeDriver();
			driver.get("https://web-stg.gofaceoff.com/");
			System.out.println("Successfully Opened the page");
		
			driver.findElement(By.xpath("//*[@href='/signup']")).click();
			driver.findElement(By.xpath("//*[@name='email']")).sendKeys("ab"+data+"@gmail.com");
			driver.findElement(By.xpath("//*[@name='username']")).sendKeys(data);
			driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Vt@1271710");
			driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("Vaibhav");
			driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("Tapadiya");
			driver.findElement(By.xpath("//*[@name='dateOfBirth']")).sendKeys("05/20/1993");
			WebElement element=driver.findElement(By.xpath("//*[@name='state']"));
			Select state=new Select(element);
			state.selectByValue("IN");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[text()='Skip']")).click();
			driver.findElement(By.xpath("//span[@class='dropDownIcon']")).click();
		    driver.findElement(By.xpath("//div/a[text()='Log Out']")).click();
		    driver.quit();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}

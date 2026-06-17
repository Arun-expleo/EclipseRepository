package Seleniumprac.NewPrat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
    	 System.setProperty("Webdriver.chrome.driver", "‪A:\\ChromeDriver\\chromedriver.exe");
    	 WebDriver driver=new ChromeDriver();
	  	 driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
	  	 WebElement name= driver.findElement(By.xpath("//div[@class='col-sm-9'][1]//input[@id='name']"));
	  	 name.sendKeys("My First xpath program");
	  	 WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	  	 email.sendKeys("sample@gmail.com");
	  	 WebElement gender=driver.findElement(By.xpath("//input[@id='gender']"));
	  	 gender.click();
	  	WebElement dob=driver.findElement(By.xpath("//input[@type='date']"));
	  	 dob.click();
	  	 
    }
}

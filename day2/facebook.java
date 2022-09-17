package week2.day2;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args)
	{
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://en-gb.facebook.com/");
     driver.manage().window().maximize();
     
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
     
     driver.findElement(By.linkText("Create New Account")).click();
     driver.findElement(By.name("firstname")).sendKeys("Gayathri");
     driver.findElement(By.name("lastname")).sendKeys("Balan");
     driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
     driver.findElement(By.id("password_step_input")).sendKeys("Gayathri@123");
     
     WebElement day=driver.findElement(By.id("day"));
     Select dd= new Select(day);
     dd.selectByVisibleText("2");
     
     WebElement month=driver.findElement(By.id("month"));
     Select dd1=new Select(month);
     dd1.selectByIndex(10);
     
     WebElement year=driver.findElement(By.id("year"));
     Select dd2=new Select(year);
     dd2.selectByValue("1992");
     
     driver.findElement(By.name("sex")).click();
     
    		 
     
	}

}

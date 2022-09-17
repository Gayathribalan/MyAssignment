package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) 
	{
      WebDriverManager.chromedriver().setup();
      ChromeDriver driver=new ChromeDriver();
      driver.get("http://leaftaps.com/opentaps/control/login");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
      driver.findElement(By.id("username")).sendKeys("demosalesmanager");
      driver.findElement(By.id("password")).sendKeys("crmsfa");
      driver.findElement(By.className("decorativeSubmit")).click();
      driver.findElement(By.linkText("CRM/SFA")).click();
      driver.findElement(By.linkText("Leads")).click();
      driver.findElement(By.linkText("Create Lead")).click();
      driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
      driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gayathri");
      driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Balan");
      driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Gayu");
      driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Karti");
      driver.findElement(By.name("departmentName")).sendKeys("Automation Testing");
      driver.findElement(By.name("description")).sendKeys("Non IT to IT Transformation");
      driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gayathri@gmail.com");
      driver.findElement(By.className("smallSubmit")).click();
      String title = driver.getTitle();
      System.out.println(title);
    		 
    		 
      
	}

}

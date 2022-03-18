package week4.dayone.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 WebElement username= driver.findElement(By.xpath("//input[@id='username']"));
			username.sendKeys("Demosalesmanager");
			WebElement pwd= driver.findElement(By.xpath("//input[@id='password']"));
			pwd.sendKeys("crmsfa");
			WebElement submitbtn = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
			submitbtn.click();
			WebElement  CRMsfalink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]") );
			CRMsfalink.click();
			driver.findElement(By.partialLinkText("Contacts")).click();
			driver.findElement(By.partialLinkText("Merge Contacts")).click();
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
			Thread.sleep(3000);
		
			
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			List<String> AllWindowslist = new ArrayList<String>();
			AllWindowslist.addAll(windowHandles);
			
			driver.switchTo().window(AllWindowslist.get(1));
			driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
			
			driver.switchTo().window(AllWindowslist.get(0));
			driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
			Thread.sleep(3000);
			
			Set<String> windowHandlesone = driver.getWindowHandles();
			List<String> AllWindowslistone = new ArrayList<String>();
			AllWindowslistone.addAll(windowHandlesone);
			
			driver.switchTo().window(AllWindowslistone.get(1));
			driver.findElement(By.xpath("(//a[@class='linktext'])[8]")).click();
			
			driver.switchTo().window(AllWindowslistone.get(0));
			driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
			
			Alert alertone = driver.switchTo().alert();
			alertone.accept();
			
			
		
			
    
			
			//List<String> AllWindowslistone1 = new ArrayList<String>();
			//AllWindowslistone.addAll(windowHandlesone);
			//driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
			
			
			
			

	}

}

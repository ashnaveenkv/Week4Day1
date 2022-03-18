package week4.dayone.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesAssignmentThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get(" https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//b[@id='topic']//following::input")).sendKeys("Not A Friendly Topic");
		//driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@Id='a']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("frame2");
		
		WebElement animal = driver.findElement(By.xpath("//select[@id='animals']"));
		Select animallist = new Select(animal);
		animallist.selectByVisibleText("Avatar");
		
		
		
		
	
	//driver.quit();
		
		
	}

}

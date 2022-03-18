package week4.dayone.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonassignmentsix {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		search.sendKeys("Oneplus 9 Pro");
		search.sendKeys(Keys.TAB,Keys.ENTER);
		String Price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
		System.out.println("Price is:" +Price);
		String noofcustomersrated = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[2]")).getText();
		System.out.println("No Of customersRated :" +noofcustomersrated);
		
		WebElement star = driver.findElement(By.xpath("(//i[@class='a-icon a-icon-star-small a-star-small-4-5 aok-align-bottom'])[1]"));
		star.click();
		driver.findElement(By.xpath("(//a[@class='a-link-normal 5star'])[1]")).click();
		String rating = driver.findElement(By.xpath("(//a[@class='a-link-normal'])[3]")).getText();
		System.out.println(rating);
		driver.findElement(By.xpath("(//a[@class='a-link-normal'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		Thread.sleep(5000);
		String finalprice = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText();
		System.out.println("Cart Price" +finalprice);
		
		if(Price.equals(finalprice))
		{
			System.out.println("Price is same");
		}
		else
		{
			System.out.println("Not Matching");
		}
		//Actions Builder = new Actions(driver);
		//Builder.moveToElement(star).perform();
		
	}

	private static void If(boolean equals) {
		// TODO Auto-generated method stub
		
	}

}

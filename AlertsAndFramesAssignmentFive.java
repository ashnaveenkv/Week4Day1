package week4.dayone.Assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsAndFramesAssignmentFive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		Alert ok = driver.switchTo().alert();
		ok.accept();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		
		Thread.sleep(3000);
		driver.quit();

	}

}

package week4.dayone.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertsandWindowsAssignmentFive {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[text()=' FLIGHTS ']")).click();
	//	driver.findElement(By.xpath("//div[@class='Nav-icons Flights']"));
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> AllWindowslist = new ArrayList<String>();
		AllWindowslist.addAll(windowHandles);
		
		driver.switchTo().window(AllWindowslist.get(1));
		//	driver.switchTo().newWindow(null)
		driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']")).click();
		//String email = driver.findElement(By.xpath("//a[@class='dropdown-item']//following::i[@class='fas fa-envelope']")).getText();
		String email = driver.findElement(By.partialLinkText("flights") ).getText();
		System.out.println(email);
		Thread.sleep(3000);
		driver.switchTo().window(AllWindowslist.get(0)).close();
		//driver.quit();
		
	}

}

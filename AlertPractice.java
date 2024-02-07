package week4_day1_assignments;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.findElement(By.xpath("//h5[contains(text(),'Prompt')]/following-sibling::button")).click();
		Alert PromptAlert = driver.switchTo().alert();
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		PromptAlert.sendKeys("Testing Prompt alert");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PromptAlert.accept();
			
		
	}

}

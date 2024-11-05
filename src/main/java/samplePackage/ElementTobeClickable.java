package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ElementTobeClickable {

	
	@Test
	public void elementTobeClickable() {

		// elementToBeClickable()

		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.leafground.com/waits.xhtml");

		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		WebElement element = driver.findElement(By.xpath("//span[text()='Click Second']"));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		String button2 = element.getText();
		System.out.println(button2);
	}
}

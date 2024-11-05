package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AttributeContains {

	
	@Test
	public void attributeContains() {

		// wait for attributeContains Method
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.navigate().to("https://leafground.com/link.xhtml");
		WebElement findurl = driver.findElement(By.partialLinkText("clicking me."));
		String attribute1 = findurl.getAttribute("href");
		// If you change the values or attribute or webelement condition will fail
		wait.until(ExpectedConditions.attributeContains(findurl, "href", attribute1));
		System.out.println("Find my destination" + attribute1);

	}

}

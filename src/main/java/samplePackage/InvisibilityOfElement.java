package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvisibilityOfElement {
	public static void main(String[] args) {

		// invisibilityOfTheElementLocated()

		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://leafground.com/waits.xhtml");

		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();

		// After clicking the button the element is invisible
		// Explicitly Wait for the Invisiblity of the element
		WebElement eleToDisappear = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		String attribute = eleToDisappear.getText();
		System.out.println(attribute);
		wait.until(ExpectedConditions.invisibilityOf(eleToDisappear));
		// wait.until(ExpectedConditions.attributeToBeNotEmpty(eleToDisappear,
		// attribute));

	}
}
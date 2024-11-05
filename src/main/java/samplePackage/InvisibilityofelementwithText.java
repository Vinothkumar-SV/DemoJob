package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InvisibilityofelementwithText {

	public static void main(String[] args) {

		// invisibilityOfElementWithText()
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		/*
		 * An expectation for checking that an element with text is either invisible or
		 * not present on the DOM.
		 */
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		// WebElement disabled =
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		WebElement elementtext1 = driver.findElement(By.xpath("//button[@aria-expanded='false']"));
		String attributevalue = elementtext1.getAttribute("aria-expanded");
		System.out.println(attributevalue);
		driver.findElement(By.xpath("//span[text()='Image']")).click();
		wait.until(ExpectedConditions.invisibilityOfElementWithText(By.xpath("//button[@aria-expanded='false']"),
				attributevalue));

	}

}

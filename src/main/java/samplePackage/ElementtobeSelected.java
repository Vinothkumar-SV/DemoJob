package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementtobeSelected {
	public static void main(String[] args) {

		// elementToBeSelected()
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/checkbox.xhtml");
		WebElement selected = driver.findElement(By.xpath("//span[text()='Ajax']"));
		wait.until(ExpectedConditions.elementSelectionStateToBe(selected, false));
		selected.click();
	}

}

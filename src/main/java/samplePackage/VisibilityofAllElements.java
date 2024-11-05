package samplePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityofAllElements {
	public static void main(String[] args) {
		// visibilityOfAllElements()

		ChromeDriver driver = new ChromeDriver();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/waits.xhtml");
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
		List<WebElement> allelement = driver.findElements(By.xpath("//p[text()='Message Content']"));
		wait.until(ExpectedConditions.visibilityOfAllElements(allelement));
		for (int i = 0; i < allelement.size(); i++) {
			System.out.println(allelement.get(i).getText());

		}

	}

}

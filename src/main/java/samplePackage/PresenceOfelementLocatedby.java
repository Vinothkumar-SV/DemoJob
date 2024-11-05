package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PresenceOfelementLocatedby {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://leaftaps.com/opentaps/");
		WebElement presence = driver.findElement(By.id("username"));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		presence.sendKeys("Demosalesmanager");

	}

}

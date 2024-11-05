package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stalenessof {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		// Create a new instance of WebDriverWait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://www.google.com");

		// Locate the search box element
		WebElement searchBox = driver.findElement(By.name("q"));

		// Type "Selenium" into the search box
		searchBox.sendKeys("Selenium");

		// Wait until the search box element is no longer present on the page
		wait.until(ExpectedConditions.stalenessOf(searchBox));

		// Print a message indicating that the search box has been removed
		System.out.println("The search box has been removed from the page");

	}

}

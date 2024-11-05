package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TittleContains {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.google.com");
		// Find the search box and type a query
		driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);

		// Wait for the results page to load
		wait.until(ExpectedConditions.titleContains("Selenium"));

		// Verify that the title contains the search query
		String title = driver.getTitle();
		System.out.println("Title: " + title);

	}

}

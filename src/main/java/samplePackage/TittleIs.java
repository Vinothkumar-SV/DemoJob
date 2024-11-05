package samplePackage;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TittleIs {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// Navigate to Google's homepage
		driver.get("https://www.google.com");

		// Wait until the title of the page contains the word "Google"
		wait.until(ExpectedConditions.titleContains("Google"));

		// Print the title of the page
		System.out.println("The title of the page is: " + driver.getTitle());
		
		

	}

}

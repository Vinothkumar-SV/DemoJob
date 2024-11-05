package samplePackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisibilityofElement {

	public static void main(String[] args) {

		// visibilityOf()
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.findElement(By.xpath("(//span[text()='Click'])[1]")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='I am here']"))));
		String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
		System.out.println(text);
	}
}

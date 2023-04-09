package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertcheck {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumCodoid\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[text()='Alert with OK ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class=\"btn btn-danger\"]")).click();
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			System.out.println("Alert text: " + alertText);
			alert.accept();
			System.out.println("Alert accepted successfully.");
		} catch (NoAlertPresentException e) {
			System.err.println("No alert present.");
		}
		driver.quit();
	}
}

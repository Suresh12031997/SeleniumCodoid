package org.test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement ca = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		ca.sendKeys("iphones");
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		Thread.sleep(2000);
		String as = driver.getWindowHandle();
		System.out.println(as);
		Set<String> af = driver.getWindowHandles();
		System.out.println(af);
	}
}

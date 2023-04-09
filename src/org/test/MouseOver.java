package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.greenstechnologys.com/python-training.html");

		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		
		WebElement ac = driver.findElement(By.xpath("//div[text()='Courses ']"));
		
		a.moveToElement(ac).perform();
		
		WebElement f = driver.findElement(By.xpath("//div[@title='Data Science']"));
		
		a.moveToElement(f).perform();
		

	}
}

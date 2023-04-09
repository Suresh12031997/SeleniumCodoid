package org.test;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		WebElement as = driver.findElement(By.id("month"));
		Select s = new Select(as);
		if (s.isMultiple()) {
			System.out.println("We can select morethan one option");		
		} else {
			System.out.println("We can select one option");
		}
		s.selectByValue("5");
		s.selectByVisibleText("May");
		s.selectByIndex(5);
		List<WebElement> af = s.getOptions();
		WebElement f = af.get(4);
		System.out.println(f.getText());
		int alloption = af.size();
		System.out.println("No of option:"+alloption);
		for (int i = 0; i < af.size(); i++) {
			WebElement p = af.get(i);
			System.out.println(p.getText());
		}
		System.out.println("Enhanced for loop");
		for (WebElement k : af) {
			System.out.println(k.getText());	
		}
	}
}

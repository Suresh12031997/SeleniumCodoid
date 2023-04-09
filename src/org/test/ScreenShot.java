package org.test;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	public static void main(String[] args) throws AWTException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dinesh\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File fe = new File("C:\\Users\\Dinesh\\eclipse-workspace\\SeleniumCodoid\\Snapshot\\fb.png");
		FileUtils.copyFile(f, fe);

	}
}
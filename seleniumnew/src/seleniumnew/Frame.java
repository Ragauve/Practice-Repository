package seleniumnew;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ragauv\\eclipse-workspace\\seleniumnew\\Driver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		TakesScreenshot ss =(TakesScreenshot)driver;
		File source =ss.getScreenshotAs(OutputType.FILE);
		File f= new File("C:\\Users\\Ragauv\\eclipse-workspace\\seleniumnew\\screenshot\\Ss.png");
		FileUtils.copyFile(source,f);
}
}
 
package seleniumnew;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.initialization.qual.Initialized;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.UnknownKeyFor;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium {
	
	public static void main(String[] args) throws InterruptedException, AWTException, IOException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Ragauv\\eclipse-workspace\\seleniumnew\\Driver\\chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://preview.colorlib.com/theme/bootstrap/multiselect-02/");
		String info = driver.getTitle();
		System.out.println(info);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().window().maximize();
		WebElement ddn = driver.findElement(By.xpath("//i[@class='dropdown icon']"));
		ddn.click();
		WebElement drop = driver.findElement(By.xpath("//select[@name='skills']"));
		Select 	dropDown = new Select( drop);
		boolean multiple = dropDown.isMultiple();
		System.out.println(multiple);
		Thread.sleep(1000);
		//for(int i=0;i<12;i++) {
		//dropDown.selectByIndex(i);
		//}
		List<WebElement> divTag = driver.findElements(By.xpath("//div[@class='item']"));
		for(int i=0;i<11;i++) {
			divTag.get(i).click();
		}
		
		//Actions a = new Actions(driver);
		//a.click(divTag).perform();
		//Robot robot = new Robot();
		//for(int i=0;i<12;i++) {
			//robot.keyPress(KeyEvent.VK_DOWN);
			//robot.keyPress(KeyEvent.VK_ENTER);
			//robot.keyRelease(KeyEvent.VK_ENTER);
			//robot.keyRelease(KeyEvent.VK_DOWN);
		
	}
}





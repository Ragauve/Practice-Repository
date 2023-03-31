package seleniumnew;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ragauv\\eclipse-workspace\\seleniumnew\\Driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/windows");
		WebElement element = driver.findElement(By.id("home"));
		element.click();
	Set<String> winids = driver.getWindowHandles();
	List<String> winid = new ArrayList(winids);
	System.out.println(winid);
	driver.switchTo().window(winid.get(1));
	System.out.println(driver.getCurrentUrl());
	driver.switchTo().window(winid.get(0));
	driver.close();
	}

}

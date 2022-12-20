package classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hyrtutorials_2 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Users/farukalam/eclipse-workspace/project.selenium/Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/");
		WebElement slpractic=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		Actions act=new Actions(driver);
		act.moveToElement(slpractic).build().perform();
		Thread.sleep(3000);
		driver.close();
		

	}
	
}

package classroom;

import java.util.concurrent.BrokenBarrierException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Task_3 extends utilities_2{
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
	browser("chrome","https://www.amazon.com/");
	Thread.sleep(3000);
WebElement bestseller=driver.findElement(By.linkText("Best Sellers"));
bestseller.click();

	}

}

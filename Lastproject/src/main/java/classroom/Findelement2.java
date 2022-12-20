package classroom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelement2 {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String ud= System.getProperty("user.dir");
System.setProperty("webdriver.chrome.driver",ud+"/driver/chromedriver");
driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.amazon.com/");
List<WebElement> bestseller=driver.findElements(By.linkText("Best Sellers 2"));
int total=bestseller.size();
if (total==1) {
	driver.findElement(By.linkText("Best Sellers 2")).click();
}
else {
	System.out.println("multiple element has founded");
}

Thread.sleep(1000);
Thread.sleep(1000);
System.out.println("faruk are you okay");
Thread.sleep(10000);
driver.close();

	
	
	}

}

package classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
static WebDriver driver;
	public static void main(String[] args) {
		String ud= System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",ud+"/driver/chromedriver");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	

	}

}

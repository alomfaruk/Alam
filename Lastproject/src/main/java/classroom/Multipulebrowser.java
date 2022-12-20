package classroom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Multipulebrowser {
static WebDriver driver;
	public static void main(String[] args) {
		

	}
	public static void Ibrowser(String browser_name,String browser_url) {
		String pathlink=System.getProperty("user.dir");//
	if(browser_name.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","/Users/farukalam/eclipse-workspace/Lastproject/driver/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(browser_url);
		
	}
	else if(browser_name.equalsIgnoreCase("edge")) {
		System.setProperty("webdriver.edge.driver","/Users/farukalam/eclipse-workspace/Lastproject/driver/msedgedriver");
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(browser_url);
		
	}
	}

}

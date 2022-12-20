package classroom;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class firstutilities {
static WebDriver driver;

	public static void  browser(String browser_name,String urladdress) throws InterruptedException {
		String ud= System.getProperty("user.dir");
		if(browser_name.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", ud+"/driver/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(urladdress);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		}
		else if(browser_name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver",ud+"/driver/msedgedriver");
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			driver.get(urladdress);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		}
	}
	public static void screenshorts() throws IOException {
		String ud= System.getProperty("user.dir");
		Date datein=new Date();
		String date= datein.toString().replace(" ","_").replace(":", "_");
		File screen= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen,new File(ud+"/screenshorts/Alert/"+date+"myss.jpg"));
	}

}

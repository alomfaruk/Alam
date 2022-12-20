package classroom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_elements {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		String ud= System.getProperty("user.dir");
System.setProperty("webdriver.chrome.driver",ud+"/driver/chromedriver");
driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
driver.get("https://www.amazon.com/");
Thread.sleep(3000);
List<WebElement> linkpage=driver.findElements(By.tagName("a"));
int number_of_page= linkpage.size();
System.out.println(linkpage.size());
for(int ind=0;ind<linkpage.size();ind++) {
	System.out.println("link page text is:"+linkpage.get(ind).getText());
	System.out.println("link page link is:"+linkpage.get(ind).getAttribute("href"));
	
}


	}

}

package classroom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.security.cert.CertificateExpiredException;
import javax.sql.rowset.serial.SerialArray;
import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazonvrsion extends firstutilities {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/farukalam/eclipse-workspace/project.selenium/Drivers/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		String currenturl= driver.getCurrentUrl();
		System.out.println("the current url is="+currenturl);
		
			if(currenturl.equals("https://www.amazon.com/")) {
		System.out.println("the url is correct");
	}
	else {
		System.out.println("the url is wrong");
	}
	String title= driver.getTitle();
	System.out.println("the title is ="+title);
	if(title.equals(title)) {
		System.out.println("the title is correct");
	}
	else {
		System.out.println("the title is wrong");
	}	
	Thread.sleep(2000);
	WebElement acc_list= driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	Actions act=new Actions(driver);
	act.moveToElement(acc_list).build().perform();
	Thread.sleep(2000);
	//screenshorts();
	WebElement selleingbt=driver.findElement(By.xpath("(//span[text()='Start a Selling Account'])[1]"));
	//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
	//wait.until(ExpectedConditions.invisibilityOf(selleingbt));
	Thread.sleep(2000);
	flashingblue(selleingbt, driver);
	Thread.sleep(1000);
	draW_border(driver, selleingbt);
	Thread.sleep(1000);

	//screenshorts();
	act.keyDown(Keys.SHIFT).build().perform();
	selleingbt.click();
	act.keyUp(Keys.SHIFT).build().perform();
	Set<String>sessionid= driver.getWindowHandles();
	Iterator<String> it=sessionid.iterator();
	String sid1= it.next();
	String sid2=it.next();
	Thread.sleep(2000);
	System.out.println("this is parrent sessionid="+sid1);
	System.out.println("this is child sessionid="+sid2);
	driver.switchTo().window(sid2);
	String newurl= driver.getCurrentUrl();
	System.out.println("the new url is="+newurl);
	if(newurl.equals("//www.amazon.com/b/?node=12766669011&ld=AZUSSOA-yaflyout&ref_=nav_AccountFlyout_cs_sell")) {
		System.out.println("new url is correct");
	}
	else {
		System.out.println("the new url is wrong");
	}
	String childtitle= driver.getTitle();
	System.out.println("the new child title is="+childtitle);
	if(childtitle.equals("Amazon.com: Sell Products Online with Selling on Amazon.")) {
		System.out.println("the child title is correct");
	}
	else {
		System.out.println("the child title is wrong");
	}
//Thread.sleep(2000);
//driver.close();
	driver.switchTo().window(sid1);
	Thread.sleep(1000);
	List<WebElement> allbtn= driver.findElements(By.tagName("button"));
	 int totalbtn= allbtn.size();
	 System.out.println("total button number="+totalbtn);
	// for(int i=0;i<allbtn.size();i++) {
		 //System.out.println("the button text="+allbtn.get(i).getText());
		 //System.out.println("the button link="+allbtn.get(i).getAttribute("href"));
	// }
	WebElement search_field=driver.findElement(By.xpath("//div[@class='nav-fill']/descendant::input[@id='twotabsearchtextbox']"));
	search_field.click();
	Thread.sleep(2000);
	search_field.sendKeys("phones");
	Thread.sleep(1000);
	act.keyDown(Keys.COMMAND).build().perform();
	Thread.sleep(1000);
	search_field.sendKeys("a");
	act.keyUp(Keys.COMMAND).build().perform();
	Thread.sleep(1000);
	act.keyDown(Keys.COMMAND).build().perform();
	search_field.sendKeys("c");
	act.keyUp(Keys.COMMAND).build().perform();
	Thread.sleep(1000);
	WebElement searchbox=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	searchbox.click();
	Thread.sleep(1000);
	String texts= driver.findElement(By.xpath("(//div[@class='a-section a-spacing-small a-spacing-top-small']/child::span)[1]")).getText();
	//System.out.println(texts);
	if(texts.equals("1-16 of over 100,000 results for")) {
		System.out.println("the text is correct");
	}
	else {
		System.out.println("the text is wrong");
	}
	
	
	Thread.sleep(5000);
	driver.close();
	

	
	}
	//all utilities
	public static void screenshorts() {
		String ud= System.getProperty("user.dir");
		System.out.println(ud);
		Date dateinformat=new Date();
		String date= dateinformat.toString().replace(" ","_").replace(":","_");
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(screen,new File(ud+"/screenshorts/utilities"+date+"myss.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void jsclick(WebDriver driver,WebElement element) {
		JavascriptExecutor javaexecutor=(JavascriptExecutor)driver;
		javaexecutor.executeScript("arguments[0].click()",element);
	}
	public static void selectdatejs(WebDriver driver,String datevalue,WebElement element) {
		JavascriptExecutor javaexecutor=(JavascriptExecutor)driver;
		javaexecutor.executeScript("arguments[0].setAttribute('value','"+datevalue+"')",element);
	}
	public static void scrollIntoView(WebDriver driver,WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	public static void scrollpagedown(WebDriver driver) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void changecolor(String color,WebElement element,WebDriver driver)   {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.backgroundColor='"+color+"'",element);
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void flashing(WebElement element,WebDriver driver) {
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<20;i++) {
			changecolor("#FF0000", element, driver);
			changecolor(bgcolor, element, driver);
			
		
	}
}
	public static void draW_border(WebDriver driver,WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.border='5px solid red'",element);
	}
	public static void generatealert(WebDriver driver,String message) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("alert('"+message+"')");
	}
	public static void flashinggreen(WebElement element,WebDriver driver) {
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<20;i++) {
			changecolor("#00FF00", element, driver);
			changecolor(bgcolor, element, driver);
		}
	}
	public static void flashingblue(WebElement element,WebDriver driver) {
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<20;i++) {
			changecolor("#0000FF", element, driver);
		}
	}
	public static void draW_borderblue(WebDriver driver,WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.border='5px solid blue'",element);
	}
	public static void draW_bordergreen(WebDriver driver,WebElement element) {
		JavascriptExecutor jsexecutor=(JavascriptExecutor)driver;
		jsexecutor.executeScript("arguments[0].style.border='5px solid green'",element);
	}

}

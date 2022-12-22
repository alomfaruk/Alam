package classroom;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javascriputilites.Javascriptutilities;

public class Task_2 extends firstutilities {
	public static void main(String[] args) throws InterruptedException, IOException {
		/*
		 * browser("chrome", "https://www.hyrtutorials.com/"); Thread.sleep(2000);
		 * WebElement
		 * slpractice=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		 * Actions act=new Actions(driver);
		 * act.moveToElement(slpractice).build().perform(); Thread.sleep(1000);
		 * WebElement alertbt=driver.findElement(By.xpath("//a[text()='Alerts']"));
		 * Javascriptutilities.jsclick(driver, alertbt); Thread.sleep(2000);
		 * //List<WebElement> links= driver.findElements(By.tagName("a")); // int total=
		 * links.size(); //System.err.println("total links of alert="+total); //for(int
		 * i=0;i<links.size();i++) { //
		 * System.err.println("link page link is="+links.get(i).getAttribute("href"));
		 * //System.err.println("link page text is="+links.get(i).getText()); // }
		 * WebElement
		 * click1=driver.findElement(By.cssSelector("button[id='alertBox']"));
		 * Javascriptutilities.flashing(click1, driver); Thread.sleep(1000);
		 * Javascriptutilities.draW_borderblue(driver, click1); Thread.sleep(1000);
		 * //screenshorts(); // Thread.sleep(1000); click1.click();
		 * driver.switchTo().alert().accept(); Thread.sleep(6000); WebElement
		 * confirm=driver.findElement(By.cssSelector("button[id='confirmBox']"));
		 * Javascriptutilities.flashing(confirm, driver); Thread.sleep(1000);
		 * Javascriptutilities.draW_bordergreen(driver, confirm); Thread.sleep(1000);
		 * //screenshorts(); confirm.click(); Thread.sleep(6000);
		 * driver.switchTo().alert().dismiss(); Thread.sleep(1000); WebElement
		 * promt=driver.findElement(By.cssSelector("button[id='promptBox']"));
		 * Javascriptutilities.scrollIntoView(driver, promt); Thread.sleep(1000);
		 * Javascriptutilities.flashing(promt, driver); Thread.sleep(1000);
		 * Javascriptutilities.draW_bordergreen(driver, promt); Thread.sleep(1000);
		 * Javascriptutilities.jsclick(driver, promt); Thread.sleep(6000);
		 * driver.switchTo().alert().accept(); Thread.sleep(1000); //screenshorts();
		 * 
		 * Thread.sleep(5000); driver.close();
		 */
browser("chrome","https://demoqa.com/alerts");
WebElement alertbt=driver.findElement(By.cssSelector("button[id='alertButton']"));
Javascriptutilities.flashing(alertbt, driver);
Thread.sleep(1000);
Javascriptutilities.draW_border(driver, alertbt);
Thread.sleep(1000);
alertbt.click();
Thread.sleep(1000);
driver.switchTo().alert().accept();
Thread.sleep(6000);
//screenshorts();
WebElement timealert=driver.findElement(By.cssSelector("button[id='timerAlertButton']"));
Javascriptutilities.flashing(timealert, driver);
Thread.sleep(1000);
Javascriptutilities.draW_border(driver, timealert);
Thread.sleep(1000);
Javascriptutilities.jsclick(driver, timealert);
Thread.sleep(6000);
driver.switchTo().alert().accept();
Thread.sleep(1000);
screenshorts();

Thread.sleep(2000);
driver.close();
	}


}

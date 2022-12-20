package classroom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Task5_1 extends Utilities{

	public static void main(String[] args) throws InterruptedException {
		Ibrowser("chrome","https://www.hyrtutorials.com/");
	WebElement slpractic=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
	Actions act=new Actions(driver);
	
	Javascriptutilities.flashing(slpractic, driver);
	Thread.sleep(2000);
	Javascriptutilities.draW_border(driver, slpractic);
	Thread.sleep(2000);
	act.moveToElement(slpractic).build().perform();
	//screenshorts();
	Thread.sleep(2000);
	WebElement calender=driver.findElement(By.xpath("//a[text()='Calendars Practice']"));
	//Javascriptutilities.scrollIntoView(driver, calender);
	//act.moveToElement(calender).build().perform();
	Javascriptutilities.jsclick(driver, calender);
	Thread.sleep(2000);
	
	//Javascriptutilities.draW_border(driver, calender);
	//Thread.sleep(4000);
	
	WebElement firtsdate=driver.findElement(By.cssSelector("input[id='first_date_picker']"));
	Javascriptutilities.draW_border(driver, firtsdate);
	Thread.sleep(2000);
	Javascriptutilities.flashinggreen(firtsdate, driver);
	Thread.sleep(2000);
	
	//screenshorts();
	
	firtsdate.click();
	
	String date1="02/03/2002";
	Javascriptutilities.selectdatejs(driver, date1, firtsdate);
	Thread.sleep(1000);
	
	Javascriptutilities.draW_borderblue(driver, firtsdate);
	Thread.sleep(2000);
	
	//screenshorts();
	
	WebElement secounddate=driver.findElement(By.cssSelector("input[id='second_date_picker']"));
	Javascriptutilities.jsclick(driver, secounddate);
	
	String date2="10/23/1999";
	Javascriptutilities.selectdatejs(driver, date2, secounddate);
	
	Javascriptutilities.draW_border(driver, secounddate);
	Thread.sleep(2000);
	
	//screenshorts();
	
	WebElement thirddate=driver.findElement(By.cssSelector("input[id='third_date_picker']"));
	//String date3="01/04/1998";
	Thread.sleep(1000);
	thirddate.click();
	Thread.sleep(1000);
	WebElement month=driver.findElement(By.cssSelector("select[class='ui-datepicker-month']"));
	act.moveToElement(month).build().perform();
month.click();

	Select slob=new Select(month);
	slob.selectByValue("2");
	Thread.sleep(2000);
	
	WebElement year=driver.findElement(By.cssSelector("select[class='ui-datepicker-year']"));
	act.moveToElement(year).build().perform();
	year.click();
	
	Select sly=new Select(year);
	sly.selectByValue("2016");
	Thread.sleep(2000);
	
	//thirddate.click();
	//String day3="02/00/1999";
	//Javascriptutilities.selectdatejs(driver,day3,thirddate);
	WebElement dates=driver.findElement(By.xpath("(//a[@class='ui-state-default'])[16]"));
	act.moveToElement(dates);
	dates.click();
	
	WebElement sixdate=driver.findElement(By.cssSelector("input[id='sixth_date_picker']"));
	Javascriptutilities.scrollIntoView(driver, sixdate);
	Javascriptutilities.flashing(sixdate, driver);
	Javascriptutilities.draW_border(driver, sixdate);
	
//screenshorts();

String seesionid= driver.getWindowHandle();
System.out.println("this is window seession id="+seesionid);

String currenturl= driver.getCurrentUrl();
System.out.println("the current url="+currenturl);


	
	
	
	
	Thread.sleep(3000);
	
	driver.close();

	}

}

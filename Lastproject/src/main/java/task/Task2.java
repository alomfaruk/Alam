package task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import classroom.Utilities;
import javascriputilites.Javascriptutilities;

public class Task2 extends Utilities {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		Ibrowser("chrome","https://www.hyrtutorials.com/");
		
		WebElement slpractic=driver.findElement(By.xpath("//a[text()='Selenium Practice']"));
		Actions act=new Actions(driver);
		act.moveToElement(slpractic);
		//WebElement alertbtn=driver.findElement(By.xpath("//a[text()='Alerts']"));
		//Javascriptutilities.jsclick(driver, alertbtn);
		Thread.sleep(5000);
		driver.close();
	}

}
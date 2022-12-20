package classroom;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshorts {
  static WebDriver driver;
	public static void screenshorts() throws IOException {
		String path=System.getProperty("user.dir");
		Date dateinformate=new Date();
		dateinformate.toString().replace(" ","_").replace(":","_");
		File screenshort= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screenshort,new File(path+"/screenshorts/Amazon/"+dateinformate+"myss.jpg"));
	
	}
}

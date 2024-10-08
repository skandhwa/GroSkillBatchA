package Utilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import constants.Constant;

public class BaseClass {
	
	 static String browsername;
	public static WebDriver driver;
	
	
	public static WebDriver initializeDriver() 
	{
		try {
			browsername=FetchDataFromProperty.readDataFromProperty().getProperty("browser");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}
		
		if(browsername.equalsIgnoreCase("edge"))
		{
			driver=new EdgeDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}
		
		if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			try {
				driver.get(FetchDataFromExcel.getURL());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
		}

		return driver;
		
	}
	
	public static void getTitle()
	{
		String title=driver.getTitle();
		System.out.println(title);
	}
	
	public static void addImplicitWait()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public static void addHardCodedwait() throws InterruptedException
	{
		Thread.sleep(5000);
	}
	
	public static void scrollDown()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)","");
	}
	
	
	public static void takescreenshot() throws IOException
	{
		TakesScreenshot srcshot=(TakesScreenshot)driver;
		File srcfile=srcshot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(Constant.ScreenShotPath);
		FileUtils.copyFile(srcfile, DestFile);
		
		
	}
	
	
	
	
	
	
	

}

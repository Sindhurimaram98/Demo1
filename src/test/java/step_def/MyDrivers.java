package step_def;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.testng.annotations.Test;
public class MyDrivers {

	public static WebDriver getDriver(String BrNm)
	{
		if(BrNm.equals("chrome"))
		{
			 System.setProperty("webdriver.chrome.driver","C:\\MyDrivers\\chromedriver_win32\\chromedriver.exe");
				return new ChromeDriver();
		}
		else if(BrNm.equals("ie"))
		{
			 System.setProperty("webdriver.ie.driver", "C:\\MyDrivers\\IEDriverServer_x64_3.14.0\\IEDriverServer.exe");
				return new  InternetExplorerDriver();
		}
		
		else 
			return null;
	}
}

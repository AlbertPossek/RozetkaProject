package RozetkaPackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;



public class ChromeSettings{
	
	public static WebDriver driver;
	protected String userEmail = "lolik1@gmail.com";
	protected String userPassword = "Aa123123";
	
    WebDriverWait wait = new WebDriverWait(driver, 10);

    @BeforeClass
    public static void openBrowser()
    {
    	 //System.setProperty("webdriver.gecko.driver", "C:\\SeleniumDriversJava\\geckodriver\\geckodriver.exe");
	     //driver = new FirefoxDriver();
    	 System.setProperty("webdriver.chrome.driver", "C:\\GitHubFiles\\SeleniumChromeWebDriver\\chromedriver.exe");
	     driver = new ChromeDriver();
	     driver.get("https://rozetka.com.ua/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }	

      
    @AfterClass
    public static void coseBrowser()
    {  
        driver.quit();
    }
}
    

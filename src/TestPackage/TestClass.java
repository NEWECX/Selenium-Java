package TestPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {
	
	
		
	 public static String driverPath = "/Users/sajjadshafiq/Desktop/Selenium Jars/";
	 public static WebDriver driver;
	 
		public static void main(String []args) {
			System.out.println("test");
			System.out.println("launching chrome browser");
			System.setProperty("webdriver.chrome.driver", "/Users/sajjadshafiq/Desktop/Selenium Jars/chromedriver");
			driver = new ChromeDriver();
			driver.navigate().to("http://ritani.com");
			driver.close();
		}
	}


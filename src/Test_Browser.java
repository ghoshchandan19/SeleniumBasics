import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test_Browser {

	public static void main(String[] args) {
		
		//Launching Firefox Browser
		
		//System.setProperty("webdriver.gecko.driver","F:\\BrowserDriver\\geckodriver-v0.21.0-win32\\geckodriver.exe");
		//FirefoxDriver driver=new FirefoxDriver();
		
		//Launching Chrome Browser
		//System.setProperty("webdriver.chrome.driver","F:\\BrowserDriver\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.hometown.in");//Opening Hometown website
		System.out.println(driver1.getTitle());//Getting the title of the page of the website
		
		

	}

}

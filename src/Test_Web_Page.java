import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Web_Page {

	public static String browser ="Chrome";//Assume it reading from excel
	//public static String browser ="Firefox";
	public static WebDriver driver;//Webdriver is an interface
	//public static ChromeDriver driver;
	public static void main(String[] args) {
		
		if(browser.equals("Chrome"))
		{
			 driver=new ChromeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			 driver=new FirefoxDriver();
		}
		
		driver.get("https://www.hometown.in");//Opening Hometown website
		System.out.println(driver.getTitle());
		
		/*String searchKeyword="Chair";
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys(searchKeyword);
		driver.findElement(By.xpath("//button[@name='submit']")).click();
		*/
		//driver.findElement(By.xpath("//a[@id='cat_131']")).click();
		
	}

}

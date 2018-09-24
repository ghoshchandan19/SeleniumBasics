import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test_Login {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		//ChromeDriver driver = new ChromeDriver();
	/*Options opt=driver.manage();//options is an interface
    Window win=	opt.window();
    win.maximize();
    */
    driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		String title=driver.getTitle();
		System.out.println(title);
		//title.length();
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("test");
		
		WebElement button=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]"));
		button.click();
		

	}

}

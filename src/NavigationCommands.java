import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationCommands {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//Maximizing the window
		driver.manage().window().maximize();
		//Navigating to a url
		//Navigate is an interface and to(),back(),refresh(),forward() are abstract methods with void return type
		driver.navigate().to("http://demo.automationtesting.in/Index.html");
		driver.findElement(By.id("btn1")).click();
		//Navigating to back
		driver.navigate().back();
		//Navigating to forward
		driver.navigate().forward();
		//Refreshing the page
		driver.navigate().refresh();

	}

}

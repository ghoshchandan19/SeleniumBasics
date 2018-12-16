import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElements {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		// Maximizing the window
		driver.manage().window().maximize();
		// Navigating to a url
		// Navigate is an interface and to(),back(),refresh(),forward() are
		// abstract methods with void return type
		driver.navigate().to("http://demo.automationtesting.in/Register.html");
		// ------------Clear Command------------------------------
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
		// --------------SendKeys------------------------------
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Chandan");
		// ----------------Click Command----------------------------
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		// --------------------isDisplayed Command-------------------------
		boolean display = driver.findElement(By.xpath("//button[@id='submitbtn']")).isDisplayed();
		System.out.println("Is the element present on the page: " + display);
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		//To get text from the alert pop up
		String alert_text = driver.switchTo().alert().getText();
		System.out.println(alert_text);
		Thread.sleep(2000);
		//To accept the alert popup
		driver.switchTo().alert().accept();
		//To dismiss the alert popup
		driver.switchTo().alert().dismiss();

	}

}

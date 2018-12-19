import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bccresearch.com/");
		Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.id("search_keyword_header"));
		//To do right click we use contextClick method of the Action Class
		act.contextClick(ele).build().perform();
		
		
	}

}

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.indiamart.com/");
		WebElement main_menu=driver.findElement(By.xpath("//span[contains(text(),'Industrial Machinery')]"));
		WebElement sub_menu=driver.findElement(By.xpath("//a[contains(text(),'Paper Plate Making Machines')]"));
		//Create the object of the actions class
		Actions action = new Actions(driver);
		action.moveToElement(main_menu).perform();
		//moveToElement method moves the mouse to the middle of the element
		sub_menu.click();

	}
}


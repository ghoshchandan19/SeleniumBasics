import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/tooltip/");
		Actions action = new Actions(driver);
		WebElement toolTip = driver.findElement(By.xpath("//a[@title='LinkedIn']"));
		action.moveToElement(toolTip).perform();
		String tooltip_msg = toolTip.getText();
		System.out.println(tooltip_msg);

	}

}

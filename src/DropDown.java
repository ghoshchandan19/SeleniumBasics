import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Register.html");
		Select skill= new Select(driver.findElement(By.id("Skills")));//Select is a class used for drop down
		skill.selectByValue("C");//selecting the dropdown by valuw
		//skill.selectByIndex(5);//Selecting dropdown by index
		//skill.selectByVisibleText("C");//Selecting dropdown by visibleText
		
		
		//Get the list of all dropdown values
		
		Select year=new Select(driver.findElement(By.id("yearbox")));
	    List<WebElement> dropdown= year.getOptions();
	    
	    for(int i=0;i<dropdown.size();i++)
	    {
	    	String text=dropdown.get(i).getText();
	    	System.out.println("Dropdown values := "+text);
	    }
	
		
		

	}

}

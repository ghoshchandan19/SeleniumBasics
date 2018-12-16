import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxRadiobutton {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
		male.click();//Click method to check the radio button
		
		//To verify first before performong on radio button and checkboxes
		
		System.out.println(male.isDisplayed());//To verify radio button is present on the webpage or not
		System.out.println(male.isEnabled());//To verify radio button is already enabled or not
		WebElement female = driver.findElement(By.xpath("//input[@value='FeMale']"));
		System.out.println(female.isSelected());
		
		//Click all checkboxes on the webpage
		List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		System.out.println(checkbox.size());
		for(WebElement el:checkbox)//Enhanced for loop to click all the checkboxes
		{
			if(!el.isSelected())//To verify if checkbox is not selected then click
			{
			el.click();
			}
		}
			
		

	}

}

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTables {

	public static void main(String[] args) {
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://toolsqa.com/automation-practice-table/");
			WebElement my_table=driver.findElement(By.xpath("//*[@id='content']/table"));
			List<WebElement> table_row=my_table.findElements(By.tagName("tr"));
			
		//Counting total number of rows in the table
			int row_count=table_row.size();
			System.out.println("Total Number of Rows = "+row_count);
			String before_xpath="//*[@id='content']/table/tbody/tr[";
			String after_xpath="]/td[2]";
			//Getting the city Names
			System.out.println("-----Name of the Cities------");
			for(int i=1;i<=row_count-2;i++)
			{
				String City_Name=driver.findElement(By.xpath(before_xpath+i+after_xpath)).getText();
				System.out.println(City_Name);
			}
					
		
		}

	}



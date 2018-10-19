import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		//Maximizing the window
		driver.manage().window().maximize();
		//get() commands is used to open a new browser and pass the string url as parameters
		driver.get("http://demo.automationtesting.in/Index.html");
		//to get the title of the page we will use getTitle method and return type will be String
		String pageTitle=driver.getTitle();
		System.out.println("Title of the page : "+pageTitle);
		//To get the current url of the page we will use the getCurrentUrl() method and the return type will be String
		String currentUrl=driver.getCurrentUrl();
		System.out.println("Current URL of the page: "+currentUrl);
		//To get text from any webelement we will use getText() method and return type is String
		String textofelement =driver.findElement(By.id("btn1")).getText();
		System.out.println("Text of an element "+textofelement);
		//To get the placeholder value we will use getAttribute() Method
		String placeholdervalue=driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println("PlaceHolder Value :"+placeholdervalue);
		//To get the pageSource we will use getPageSource() method
	    String page_source=	driver.getPageSource();
	    System.out.println("The page source: "+page_source);
	    //Closing the window
	    driver.close();//

	}

}

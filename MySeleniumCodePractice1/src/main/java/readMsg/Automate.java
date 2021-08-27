package readMsg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Automate {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		String url = ("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		  driver.get(url); 
		  Select select=new Select( driver.findElement(By.
		  xpath("//span[@class=\"select2-selection select2-selection--single\"]/../../../child::select[@id=\"country\"]"
		 )));
		  String str="India";
		  select.selectByValue(str); 
		 select.getFirstSelectedOption();
		 
			 
		 
		  Thread.sleep(5000); driver.navigate().forward();
		  WebElement we= driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']"));
		  Select s1=new Select(we);
		  s1.selectByIndex(1);
		  s1.selectByIndex(2);
		  List<WebElement> allopt= s1.getOptions();
		  for(WebElement web:allopt) {
			  System.out.println("selected options:"+ web.getText());
		  }
		 
		/*
		 * driver.get ("https://www.demoqa.com/elements"); driver.findElement(By.
		 * xpath("//span[@class='text'][contains(.,'Radio Button')]")).click();
		 * 
		 * WebElement radiobutton=driver.findElement(By.
		 * xpath("//div[@class=\"custom-control custom-radio custom-control-inline\"]/child::input[@id=\"yesRadio\"]"
		 * )); radiobutton.click(); Boolean status = radiobutton.isSelected();
		 * System.out.println("radiobutton is selected"+status);
		 */
	        driver.quit();
		
	}

}

package readMsg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetOTP {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		String url = ("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}

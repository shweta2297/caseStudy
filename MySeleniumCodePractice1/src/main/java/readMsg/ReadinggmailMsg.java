package readMsg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadinggmailMsg {

	public static void main(String[] args)  throws InterruptedException, FileNotFoundException, IOException{
	//EmailUtils utils= new EmailUtils();
	Properties  prop= new Properties();
	prop.load(new FileInputStream(""));
	}

}

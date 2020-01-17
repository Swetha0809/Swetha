package GradleTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GradleFBlogin {
	@Test
	public void launchApp() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Downloads\\Selenium Softwares\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://facebook.com");
	driver.close();
	}
}

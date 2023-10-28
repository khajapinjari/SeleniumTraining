package genericLibrary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

public class BaseTest {
	public WebDriver driver;
@BeforeClass
public void browserSetUp() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
}
@AfterClass
public void browserTearDown() {
	driver.quit();
}	
}

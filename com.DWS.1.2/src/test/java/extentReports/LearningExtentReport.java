package extentReports;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReport {

	public static void main(String[] args) {
		ExtentSparkReporter reporter=new ExtentSparkReporter("./Reports/firstReport.html");
		ExtentReports report =new ExtentReports();
		report.attachReporter(reporter);
		ExtentTest test=report.createTest("LoginTest");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		test.log(Status.INFO, "WebPage is Loaded");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		test.log(Status.INFO, "Login Page is Displayed");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gana123@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("gana123");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
		WebElement text = driver.findElement(By.xpath("(//a[@class='account'])[1]"));
		if(text.getText().equals("gana123@gmail.com"))
		{
			System.out.println("PASS : user is logged in");
			test.log(Status.PASS, "user is logged in");
		}
		else
		{
			test.log(Status.FAIL, "user is not logged in");
		}
		
		driver.quit();
		report.flush();

	}}



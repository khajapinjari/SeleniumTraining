package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;

public class FirstTest {

	@Test(dataProvider = "registerData")
	public void registerTest(String firstName,String LastName,String email,String password,String ConfirmPassword) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\maham\\\\eclipse-workspace\\\\SeleniumProject\\\\drivers\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();		
driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys(firstName);
		driver.findElement(By.id("LastName")).sendKeys(LastName);
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
		driver.findElement(By.xpath("//input[@id='register-button']")).click();
		driver.close();

	}
	@DataProvider(name = "registerData")
	public Object[][] registerData() {
		Object[][] data=new Object[2][5];
		data[0][0]="praneeth";
		data[0][1]="reddy";
		data[0][2]="praneeth143@gmail.com";
		data[0][3]="praneeth@123";
		data[0][4]="praneeth@123";
	    data[1][0]="ganesh";
		data[1][1]="setty";
		data[1][2]="setty123@gmail.com";
		data[1][3]="setty@123";
		data[1][4]="setty@123";
		return data;
		

	}
	}



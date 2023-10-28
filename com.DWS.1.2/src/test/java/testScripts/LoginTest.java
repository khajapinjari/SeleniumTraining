package testScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ReadExcelData;
import pomRepo.WelcomePage;
@Listeners(genericLibrary.ListenerImplementation.class)
public class LoginTest extends BaseTest {
@Test(dataProvider = "loginData")
public void loginTest(String userName,String Password) {
	//driver.findElement(By.xpath("//a[text()='Log in']")).click();
	WelcomePage page=new WelcomePage(driver);
	page.clickOnLoginLink();
	WebElement el1 = driver.findElement(By.id("Email"));
	el1.sendKeys(userName);
	WebElement el2 = driver.findElement(By.id("Password"));
	el2.sendKeys(Password);
	driver.findElement(By.id("RememberMe")).click();
	driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	
}
@DataProvider(name = "loginData")
public Object[][] loginData() throws EncryptedDocumentException, IOException {
	return ReadExcelData.loginData();
}
}



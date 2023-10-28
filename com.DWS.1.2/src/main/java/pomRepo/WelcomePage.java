package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath ="//a[text()='Log in']")
	private WebElement loginlink;

	public WebElement getLoginlink() {
		return loginlink;
	}

	public void setLoginlink(WebElement loginlink) {
		this.loginlink = loginlink;
	}
	public void clickOnLoginLink() {
		loginlink.click();
	}
	
	}


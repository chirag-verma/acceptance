package com.qats.page;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qats.utilities.TestBase;

public class QATS_LoginPage extends TestBase {

	@FindBy(xpath = "//*[@id='txtUserID']")
	WebElement Username;

	@FindBy(xpath = "//*[@id='txtPassword']")
	WebElement Password;

	@FindBy(xpath = "//*[@id='sub']")
	WebElement Login;

	public QATS_LoginPage() throws IOException {
		
		PageFactory.initElements(driver, this);
	}

	public String LoginPageTitle() {

		return driver.getTitle();

	}

	public QATS_HomePage Login(String username, String password) throws InterruptedException, IOException {

		Username.sendKeys(username);
		Password.sendKeys(password);
		Thread.sleep(2000);
		Login.click();
		return new QATS_HomePage();
	}

}

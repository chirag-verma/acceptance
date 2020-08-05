package com.qats.test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qats.page.QATS_HomePage;
import com.qats.page.QATS_LoginPage;
import com.qats.utilities.TestBase;

public class QATS_LoginPageTest extends TestBase {

	QATS_LoginPage LoginPage;

	public QATS_LoginPageTest() throws IOException {

		super();

	}

	@BeforeMethod
	public void LaunchingBrowser() throws IOException {
		initialization();
		LoginPage = new QATS_LoginPage();
	}

	@Test
	public void LoginPageTitleTest() {

		System.out.println("Login Page Title is " + LoginPage.LoginPageTitle());
		Assert.assertEquals(LoginPage.LoginPageTitle(), prop.getProperty("LoginPageTitle"));

	}

	@Test
	public void LoginTestAdmin() throws InterruptedException, IOException {

		QATS_HomePage homepage = LoginPage.Login(prop.getProperty("AdminUserName"), prop.getProperty("AdminPassword"));
		Thread.sleep(4000);
		System.out.println("Home Page Title Admin is " + homepage.HomePageTitle());
		Assert.assertEquals(homepage.HomePageTitle(), prop.getProperty("HomePageTitleAdmin"));
		System.out.println("Login successful");
		System.out.println();

	}
	@Test
	public void LoginTestManager() throws InterruptedException, IOException {

		QATS_HomePage homepage = LoginPage.Login(prop.getProperty("ManagerUserName"), prop.getProperty("ManagerPassword"));
		Thread.sleep(4000);
		System.out.println("Home Page Title Manager is " + homepage.HomePageTitle());
		Assert.assertEquals(homepage.HomePageTitle(), prop.getProperty("HomePageTitleManager"));
		System.out.println("Login successful");
		System.out.println();

	}
	
	@Test
	public void LoginTestReviewer() throws InterruptedException, IOException {

		QATS_HomePage homepage = LoginPage.Login(prop.getProperty("ReviewerUserName"), prop.getProperty("ReviewerPassword"));
		Thread.sleep(4000);
		System.out.println("Home Page Title Reviewer is " + homepage.HomePageTitle());
		Assert.assertEquals(homepage.HomePageTitle(), prop.getProperty("HomePageTitleReviewer"));
		System.out.println("Login successful");
		System.out.println();

	}

	@AfterMethod
	public void teardown() {

		driver.quit();
	}

}

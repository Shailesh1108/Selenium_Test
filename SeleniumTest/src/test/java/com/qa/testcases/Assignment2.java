package com.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ControlGroup;
import com.qa.pages.HomePage;
import com.qa.pages.OlaWelComePage;
import com.qa.pages.RegisterPage;

public class Assignment2 extends TestBase
{
	public Assignment2()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	
	}
	
	@Test
	public void VerificationDatePickerTest() throws InterruptedException
	{
		OlaWelComePage olawelcomepage= new OlaWelComePage();
		   olawelcomepage.verification();
		   olawelcomepage.RegisterClick();
		   
		
		   
		 RegisterPage registerpage= new RegisterPage();
		 registerpage.RegisterwithFields();
		 registerpage.verifySuccessfullRegistration();
		 	
			
	}
	
	
	@AfterMethod()
	public void actionaftrtest()
	{
		driver.close();
	}

}

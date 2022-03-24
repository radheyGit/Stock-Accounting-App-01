package com.stockaccounting.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AT_001_Ravina {
	
	/***
	 * AT_001 : Verify admin user is able to login with valid login credentials
	 * 
	 * Steps :
	 * 			01 : Open Browser
	 * 			02 : Launch Application Url : http://orangehrm.qedgetech.com/webapp/login.php
	 * 			03 : Enter User Name : admin
	 * 			04 : Enter Password  : master
	 * 			05 : Click On Login Button
	 * 			06 : Validate Result : Check if login successful or not
	 * */

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Browser Plugin/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://orangehrm.qedgetech.com/webapp/login.php");

	}

}

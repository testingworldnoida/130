package testcases;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import pages.LoginPage;

public class TC_001 {

	@Test
	public void tcase1()
	{
		
		ExtentReports rep = new ExtentReports("./Reports/index.html", true);
		ExtentTest test1 = rep.startTest("Test1");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\TestingWorld\\Downloads\\chromedriver_win3\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		LoginPage page = PageFactory.initElements(driver, LoginPage.class);
	
		driver.get("https://www.facebook.com");
		
		test1.log(LogStatus.PASS, "Done");
		rep.endTest(test1);
		rep.flush();
		
	}
	
	
}


import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestClass {

	WebDriver driver;
	Keywords keywords;
	Utility utility;
	Date date=new Date();
	@BeforeTest
	public void initialization()
	{
		utility=new Utility();
		driver=new FirefoxDriver();
		utility.createPropertyPath();
		driver.get("file:///home/shivamtiwari1/Desktop/html%20folder/first.html");
		keywords=new Keywords(driver);
	}
	
	@Test
	public void verify_Day_Text_Data()
	{
		
	int dataFromApplication=Integer.parseInt(utility.getLocatorId(keywords.getDataFromDayButton()));
	int dataFromSystem=date.getDay();
	Assert.assertEquals(dataFromApplication, dataFromSystem);
	Reporter.log("Assert Passed verify_Day_Text_Data!!",true);
	}

	@Test
	public void verify_Month_Text_Data()
	{
		int dataFromApplication=Integer.parseInt(utility.getLocatorId(keywords.getDataFromMonthButton()));
		int dataFromSystem=date.getMonth();
		Assert.assertEquals(dataFromApplication, dataFromSystem);
		Reporter.log("Assert Passed verify_Month_Text_Data!!",true);

	}

	@Test
	public void verify_Year_Text_Data()
	{
		int dataFromApplication=Integer.parseInt(keywords.getDataFromYearButton());
		int dataFromSystem=date.getYear()+1900;
		Assert.assertEquals(dataFromApplication, dataFromSystem);
		Reporter.log("Assert Passed verify_Year_Text_Data!!",true);
	}

	
	@Test
	public void verify_Hour_Text_Data()
	{
		int dataFromApplication=Integer.parseInt(keywords.getDataFromHourButton());
		int dataFromSystem=date.getHours();
		Assert.assertEquals(dataFromApplication, dataFromSystem);
		Reporter.log("Assert Passed verify_Hour_Text_Data!!",true);
	}

	
}

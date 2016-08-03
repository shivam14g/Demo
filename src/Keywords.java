import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Keywords {

	Utility utility;
	WebDriver driver;
	
	
	public Keywords(WebDriver driver) {
		utility=new Utility();
		utility.createPropertyPath();
		this.driver=driver;
		
	}
	
	
   public String getDataFromDayButton()
   {
	driver.findElement(By.id(utility.getLocatorId("dayButton"))).click();   
	return driver.findElement(By.id(utility.getLocatorId("dayTextField"))).getText();
   }
	
   public String getDataFromMonthButton()
   {
	driver.findElement(By.id(utility.getLocatorId("monthButton"))).click();   
	return driver.findElement(By.id(utility.getLocatorId("monthTextField"))).getText();
   }
	
   public String getDataFromYearButton()
   {
	driver.findElement(By.id(utility.getLocatorId("yearButton"))).click();   
	return driver.findElement(By.id(utility.getLocatorId("yearTextField"))).getText();
   }
   
   public String getDataFromHourButton()
   {
	driver.findElement(By.id(utility.getLocatorId("hourButton"))).click();   
	return driver.findElement(By.id(utility.getLocatorId("hourTextField"))).getText();
   }
   
   
	
}

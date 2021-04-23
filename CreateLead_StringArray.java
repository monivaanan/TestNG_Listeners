package AssignmentWeek5_DataProvider;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead_StringArray extends LeadBase {

	
	@Test(dataProvider="sendData")
	public void runCreateLead(String companyName, String firstName, String lastName) 
	{

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastName);
		driver.findElement(By.name("submitButton")).click();
		
	}
	
	@DataProvider
	public String[][] sendData() {
		String[][] data = new String [1][3];
		
		data[0][0]="Marina";
		data[0][1]="Movie";
		data[0][2]="Mall";
		
		return data;

	}
	
}

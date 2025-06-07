package week2.homeasg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CeateLead {

	public static void main(String[] args) {
		
		//Launch the Browser
				ChromeDriver driver = new ChromeDriver();
				//Load the Url
				driver.get("http://leaftaps.com/opentaps/");
				//Enter Username
				driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
				//Enter Password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				//Click the Login Button
				driver.findElement(By.className("decorativeSubmit")).click();
				//Click the CRM/SFE link
				driver.findElement(By.linkText("CRM/SFA")).click();
				//Select the Leads tab
				driver.findElement(By.linkText("Leads")).click();
				//wait
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement creatLeadElement = wait
						.until(ExpectedConditions.elementToBeClickable(By.linkText("Create Lead")));
				//Click Create Lead Button
				creatLeadElement.click();
				//Enter first name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("abc");
				//Enter Last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("def");
				//Enter Company Name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				//Enter Title
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Test Engineer");
				//Click Create Lead Button
				driver.findElement(By.name("submitButton")).click();
				//Close the Browser
				//driver.close();

	}

}

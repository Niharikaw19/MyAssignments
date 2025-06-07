package week2.homeasg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassAsg {

	public static void main(String[] args) {
		
				// Creating driver instance
				ChromeDriver driver = new ChromeDriver();
				// Launch URL
				driver.get("https://en-gb.facebook.com/");
				// Maximize the web page
				driver.manage().window().maximize();
				//click on create account
				driver.findElement(By.linkText("Create new account")).click();
				//fill details
				driver.findElement(By.name("firstname")).sendKeys("Niharika");
				driver.findElement(By.name("lastname")).sendKeys("P");
				driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");
				driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
				//select class
				Select selectDate = new Select(driver.findElement(By.name("birthday_day")));
				selectDate.selectByValue("19");
				Select selectMonth = new Select(driver.findElement(By.id("month")));
				selectMonth.selectByValue("2");
				Select selectYear = new Select(driver.findElement(By.id("year")));
				selectYear.selectByValue("1996");
				//gender
				driver.findElement(By.xpath("//*[@id=\"sex\"]")).click();
	}

}

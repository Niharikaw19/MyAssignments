package week2.homeasg;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchAndLoadBrowser {

	public static void main(String[] args) {
		
		// Creating driver instance
		ChromeDriver driver = new ChromeDriver();
		// Launch URL
		driver.get("https://www.facebook.com/");
		// Maximize the web page
		driver.manage().window().maximize();
		// Close the window
		driver.close();

	}

}

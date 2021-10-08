package common;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	public WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@BeforeMethod
	public void navigate(String url) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterClass(alwaysRun = true)
	public void teardown() {
		driver.quit();
	}
}

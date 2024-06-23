package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestcase {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		LoginPage.username(driver).sendKeys("practice");
		LoginPage.password(driver).sendKeys("SuperSecretPassword!");
		LoginPage.loginButton(driver).click();
		
		HomePage.contact(driver).click();
		HomePage.name(driver).sendKeys("Soundarya");
		HomePage.email(driver).sendKeys("sound123@gmail.com");
		HomePage.message(driver).sendKeys("Good Application");
		
		
	}

}

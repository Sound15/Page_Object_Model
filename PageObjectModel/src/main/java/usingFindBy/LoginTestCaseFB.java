package usingFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class LoginTestCaseFB {
	
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		PageFactory.initElements(driver, LoginPageFB.class);
		LoginPageFB.username.sendKeys("practice");
		LoginPageFB.password.sendKeys("SuperSecretPassword!");
		LoginPageFB.login.click();
		
		PageFactory.initElements(driver, HomePageFB.class);
		HomePageFB.contact.click();
		HomePageFB.name.sendKeys("Soundarya");
		HomePageFB.email.sendKeys("sound123@gmail.com");
		HomePageFB.message.sendKeys("Good Application");
	}

}

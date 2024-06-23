package withoutFindBy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

//Without findby we can only find elements with id and name not xpath

public class LoginWithoutFindBy {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		PageFactory.initElements(driver, LoginPageWithoutFindBy.class);
		LoginPageWithoutFindBy.username.sendKeys("practice");
		LoginPageWithoutFindBy.password.sendKeys("SuperSecretPassword!");
	}

}

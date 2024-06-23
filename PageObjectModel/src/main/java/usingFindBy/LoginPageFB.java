package usingFindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageFB {
	@FindBy(how=How.NAME,using="username")
	public static WebElement username;
	@FindBy(name="password")
	public static WebElement password;
	@FindBy(xpath="//button[@type=\"submit\"]")
	public static WebElement login;

}

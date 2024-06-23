package usingFindBy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageFB {
	@FindBy(xpath="//*[@id=\"main-navbar\"]/ul[1]/li[4]/a")
	public static WebElement contact;
	@FindBy(xpath="/html/body/main/div/div/div/div[1]/div/div[1]/div[1]/div/input")
	public static WebElement name;
	@FindBy(xpath="/html/body/main/div/div/div/div[1]/div/div[1]/div[2]/div/input")
	public static WebElement email;
	@FindBy(xpath="/html/body/main/div/div/div/div[1]/div/div[2]/div/div/textarea")
	public static WebElement message;
	

}

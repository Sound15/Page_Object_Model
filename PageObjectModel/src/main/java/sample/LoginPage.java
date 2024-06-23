package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	public static WebElement username(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name=\"username\"]"));
	}
	
	public static WebElement password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name=\"password\"]"));
	}
	
	public static WebElement loginButton(WebDriver driver) {
		return driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	}

}

package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static WebElement contact(WebDriver driver) {
		return driver.findElement(By.xpath("//*[@id=\"main-navbar\"]/ul[1]/li[4]/a"));
	}
	public static WebElement name(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div[1]/div[1]/div/input"));
	}
	public static WebElement email(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div[1]/div[2]/div/input"));
	}
	public static WebElement message(WebDriver driver) {
		return driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div[2]/div/div/textarea"));
	}
	
}

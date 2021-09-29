package com.picnic.mavsel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Individual_Activity {
	
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\balajiva\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	
	driver.manage().window().maximize();

	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	
	String actualTitle = driver.getTitle();
	System.out.println(actualTitle);
	String expectedTitle = "Swag Labs";
	if(actualTitle.equalsIgnoreCase(expectedTitle))
	System.out.println("Title Matched");
	else
	System.out.println("Title NOT match");
	
	driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
	driver.findElement(By.xpath("/html/body/div/div/div/div[1]/div[1]/div[3]/a")).click();
	driver.findElement(By.id("checkout")).click();
	driver.findElement(By.id("first-name")).sendKeys("Balaji");
	driver.findElement(By.id("last-name")).sendKeys("Varadharaj");
	driver.findElement(By.id("postal-code")).sendKeys("636455");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("finish")).click();
	driver.findElement(By.id("back-to-products")).click();
	driver.findElement(By.id("react-burger-menu-btn")).click();
	Thread.sleep(1000);

	driver.findElement(By.id("logout_sidebar_link")).click();
	}
}
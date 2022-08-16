package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "J:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String url = "https://demoqa.com/text-box";
		driver.get(url);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		driver.findElement(By.id("userName")).sendKeys("Zaenal");
		System.out.println("Input User Name");
		driver.findElement(By.id("userEmail")).sendKeys("zainalgo@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("Jateng");
		driver.findElement(By.id("permanentAddress")).sendKeys("Wonosobo, Sukoharjo, Sempol");
		
//		js.executeScript("window.scrollBy(0,700)");
		WebElement btnSubmit = driver.findElement(By.id("submit"));
		js.executeScript("arguments[0].scrollIntoView();",btnSubmit);
		
		btnSubmit.click();
		System.out.println("Click Button Submit");
		
		delay(3);
		driver.quit();
//		driver.quit();
//		driver.getTitle();
	}
	static void delay(int detik) {
		try {
			Thread.sleep(1000*detik);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}

}

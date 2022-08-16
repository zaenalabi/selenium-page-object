package com.juaracoding.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleXPath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "J:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		String url = "https://formy-project.herokuapp.com/form";
		driver.get(url);
		driver.manage().window().maximize();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);

		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Zaenal");
		System.out.println("Input First Name Sucess");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("Abidin");
		System.out.println("Input Last Name Sucess");
		driver.findElement(By.xpath("//input[@id='job-title']")).sendKeys("Programmer");
		System.out.println("Input Job Title Sucess");
		Thread.sleep(500);

		driver.findElement(By.xpath("//input[@id='radio-button-1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='radio-button-2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='radio-button-3']")).click();
		Thread.sleep(500);

		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(500);

		driver.findElement(By.xpath("//input[@id='checkbox-1']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='checkbox-2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='checkbox-3']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='checkbox-3']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='checkbox-2']")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='checkbox-1']")).click();
		Thread.sleep(500);
		System.out.println("Input Checkbox Sucess");

		WebElement menu = driver.findElement(By.xpath("//select[@id='select-menu']"));
		Select select = new Select(menu);

		select.selectByValue("2");
		Thread.sleep(500);
		System.out.println("Input Select Menu Sucess");

		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		driver.findElement(By.xpath("//td[normalize-space()='15']")).click();
		System.out.println("Input Date Sucess");

		driver.findElement(By.xpath("//a[@role='button']")).click();
		System.out.println("Submit Button Sucess");

		delay(3);
		driver.quit();

	}

	static void delay(int detik) {
		try {
			Thread.sleep(1000 * detik);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

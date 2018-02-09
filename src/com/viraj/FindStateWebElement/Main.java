package com.viraj.FindStateWebElement;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Main {

	WebDriver driver;
	String baseUrl = "https://www.google.com/";

	@BeforeEach
	void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "/Users/viraj/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}

	@Test
	void test() {
		WebElement e1 = driver.findElement(By.id("lst-ib"));
		System.out.println("E1 is enabled : " + e1.isEnabled());

		WebElement e2 = driver.findElement(By.id("gs_sc0"));
		System.out.println("E1 is enabled : " + e2.isEnabled());

		WebElement e3 = driver.findElement(By.id("gs_taif0"));
		System.out.println("E1 is enabled : " + e3.isEnabled());
	}


	@AfterEach
	void tearDown() throws Exception {

		Thread.sleep(3000);
		driver.quit();

	}


}

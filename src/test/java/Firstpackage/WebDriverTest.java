package Firstpackage;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverTest {

	public static void main(String[] args) {
		
		WebDriver driver = WebDriverManager.edgedriver().create();
		driver.get("https://www.amazon.in");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}

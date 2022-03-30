package com.careerhack.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjects {
	
	WebDriver driver;

	public PageObjects(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="q")
	WebElement searchBox;
	
	public void enterSearch(String text) {
		
		searchBox.sendKeys(text);
		

	}
	
	@FindBy(name = "btnK")
	WebElement searchBtn;
	
	public void clicksearch() {
		searchBtn.submit();
	}
	
	
	@FindBy(name = "result-stats")
	WebElement resultstats;
	
	public void results() {
		
		System.out.println("============================================");
		System.out.println(resultstats);
		System.out.println("=============================================");
		
	
	}
	public void close() {
	
	driver.close();
	}
}

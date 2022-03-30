package com.careerhack.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.careerhack.common.GoogleBaseHeists;
import com.careerhack.pages.PageObjects;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchHeist extends GoogleBaseHeists {

@Given("i am on google homepage")
public void i_am_on_google_homepage() {
	
	launchBrowser();
	
}

@When("i enter a search {string}")
public void i_enter_a_search(String string) {
	
	//1.identify the web element and give the element name.
	
	//2. perform action
	//3. 8 loactors: id,name,tag,class name, linktext, partial linktext, xpath, css-selector.
   
	PageObjects po = new PageObjects(driver);
	po.enterSearch(string);
	
}

@When("i click on search button")
public void i_click_on_search_button() {
	
	//WebElement searchBtn;
	//searchBtn = driver.findElement(By.name("btnK"));
	//searchBtn.click();
	
	PageObjects po = new PageObjects(driver);
	po.clicksearch();
	
   
}

@Then("I see the number of results return")
public void i_see_the_number_of_results_return() {
	
	//WebElement resultStats;
	//resultStats = driver.findElement(By.id("result-stats"));
	
	//String results = resultStats.getText();
	
	//System.out.println("============================================");
	//System.out.println(results);
	//System.out.println("=============================================");
	
	//if the click or submit doesnt work
	//WebElement.sendKeys(Keys.RETURN);
	PageObjects po = new PageObjects(driver);
	po.results();
	po.close();

}


}

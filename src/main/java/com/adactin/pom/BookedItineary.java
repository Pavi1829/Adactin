package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineary {
	public static WebDriver driver;
	
	@FindBy(name="ids[]")
	private WebElement radiobtn;
	
	@FindBy(id="logout")
	private WebElement logout;
	
	public BookedItineary(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getRadiobtn() {
		return radiobtn;
	}

	public WebElement getLogout() {
		return logout;
	}


}

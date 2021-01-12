package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel {
	
    public static WebDriver driver;
	@FindBy(id="radiobutton_0")
	private WebElement selectradiobtn;
	
	@FindBy(id="continue")
	private WebElement continuebtn;
	
	public SelectHotel(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getSelectradiobtn() {
		return selectradiobtn;
	}

	public WebElement getContinuebtn() {
		return continuebtn;
	}

}

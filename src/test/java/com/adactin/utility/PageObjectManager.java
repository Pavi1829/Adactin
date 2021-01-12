package com.adactin.utility;

import org.openqa.selenium.WebDriver;

import com.adactin.pom.*;

public class PageObjectManager {
	public static WebDriver driver;

	private HomePage hp;
	private SelectHotel s1;
	private SearchHotel sh;
	private BookAHotel bh;
	private BookedItineary bi;

	public PageObjectManager(WebDriver ldriver) {
		this.driver = ldriver;
	}

	public HomePage getHp() {
		hp=new HomePage(driver);
		return hp;
	}

	public SelectHotel getS1() {
		return s1;
	}

	public SearchHotel getSh() {
		return sh;
	}

	public BookAHotel getBh() {
		return bh;
	}

	public BookedItineary getBi() {
		return bi;
	}

}

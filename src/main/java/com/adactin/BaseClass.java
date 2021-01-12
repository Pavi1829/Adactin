package com.adactin;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\Admin\\eclipse-workspace\\Selenium\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else {
				System.out.println("Invalid browsername");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void waitforElement(WebElement element) {
		try {
			WebDriverWait Wait = new WebDriverWait(driver, 25);
			Wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void getUrl(String Url) {
		try {
			driver.get(Url);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void close() {
		try {
			driver.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void quit() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void Alert() {
		try {
			driver.switchTo().alert();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void inputToElement(WebElement element, String value) {
		waitforElement(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void clickOnWebElement(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void SelectDropDown(WebElement element, String value, String option) {
		try {
			Select s = new Select(element);
			if (option.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (option.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);
			} else if (option.equalsIgnoreCase("index")) {
				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}

	public static void moveToElement(WebElement element) {
		waitforElement(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void frames(String option) {

			try {
				driver.switchTo().frame(option);
				if (option.equalsIgnoreCase("value")) {
					driver.switchTo().frame(option);

				} else if (option.equalsIgnoreCase("element")) {
					driver.switchTo().frame(option);

				}else if (option.equalsIgnoreCase("index")) {
					driver.switchTo().frame(Integer.parseInt(option));
				}
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
				
	}
	public static void getScreenshot(String filename) throws IOException {
		try {
			TakesScreenshot ts=(TakesScreenshot) driver;
			File scrfile = ts.getScreenshotAs(OutputType.FILE);
			File desfile = new File(System.getProperty("user.dir")+"\\Screenshot\\" + filename + ".png" );
			FileUtils.copyFile(scrfile, desfile);
		} catch (WebDriverException e) {
			
			e.printStackTrace();
		}
	}
	public static void FrameUsingId(String option, int index) {
		try {
			if (option.equalsIgnoreCase("id")) {
				
				driver.switchTo().frame(index);
				
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}
	
	public static void FrameUsingname(String option, String name) {
		try {
			if (option.equalsIgnoreCase("name")) {
				driver.switchTo().frame(name);
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public static void FrameUsingwebelement(String option, String frameElement) {
	try {
		if (option.equalsIgnoreCase("element")) {
			driver.switchTo().frame(frameElement);
			
		}
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}

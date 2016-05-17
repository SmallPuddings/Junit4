package com.tju.junit;

import java.io.IOException;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {
	private WebDriver wd;
	private String url;
	
	@Before
	public void setUp() throws IOException {
		/*Chrome*/
		String chDriver = new File(new File(".").getCanonicalPath()+"\\" + "driver/chromedriver.exe").getCanonicalPath();
		System.setProperty("webdriver.chrome.driver", chDriver);
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)"
				+ "\\Google\\Chrome\\Application\\chrome.exe");
		url = "https://www.google.com/";
		wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		/*Firefox*/
		/*wd=new FirefoxDriver();
		url = "www.baidu.com";*/
	}
	
	@Test 
	public void testWebDriver(){
		wd.get(url);
	}
}

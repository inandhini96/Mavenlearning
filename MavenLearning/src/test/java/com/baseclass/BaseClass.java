package com.baseclass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;

	public static void browserLaunch(String url) {
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}

	public static void input_text(WebElement element, String value) { // typeText
		element.sendKeys(value);

	}

	public static void click_Value(WebElement element) {
		element.click();

	}

    public static String prop_Test(String data) {
    	String value=null;
    
		
		try {
			
			FileReader read = new FileReader("/Users/mohamedmustafa/eclipse-workspace/MavenLearning/src/test/resources/TestData/config.properties");
			Properties prop = new Properties();
			prop.load(read);
			value = prop.getProperty(data);
			
			
		} catch (FileNotFoundException e) {
              e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
    }

}

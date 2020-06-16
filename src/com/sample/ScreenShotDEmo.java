package com.sample;




import java.io.File;

import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ScreenShotDEmo {

@Test
 public void TestJavaS1()
{
	System.setProperty("webdriver.chrome.driver","E:\\selenuim\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

driver.manage().window().maximize();


driver.get("http://demo.automationtesting.in/Alerts.html");


File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
try {

FileUtils.copyFile(src, new File("E:/selenium/error1.png"));
}

catch (IOException e)
{ 
	System.out.println(e.getMessage());
}
}
}

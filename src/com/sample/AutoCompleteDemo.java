package com.sample;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDemo {
	 @Test
	  public void list() throws InterruptedException {
		  
		  System.setProperty("webdriver.chrome.driver","E:\\selenuim\\chromedriver.exe");
			WebDriver d1=new ChromeDriver();
			
			d1.get("http://demo.automationtesting.in/AutoComplete.html");
	
	 WebElement inputbox=    d1.findElement(By.id("searchbox"));
	 
	 inputbox.sendKeys("india");
	 
	 Thread.sleep(4000);
	 
	 List<WebElement> list=  d1.findElements(By.xpath("//*[@class='ui-autocomplete-input']/li"));
		
	 for (WebElement ele1:list) {
		if( ele1.getText().equalsIgnoreCase("india")){
			ele1.click();
			break;
		}
	 }
	  }
}

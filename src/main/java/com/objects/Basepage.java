package com.objects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basepage {
	     static WebDriver driver;    
	     String browser="firefox";
	     public Basepage() {
	    	             if (driver==null) {
	    		             if (browser.equals("firefox")) {
	    		              System.setProperty("webdriver.gecko.driver", "D:\\Gecko\\Geckodriver.exe");
	    		                  driver=new FirefoxDriver();
	    		             }
	    		             else if(browser.equals("chrome")) {
	    		            	 System.setProperty("webdriver.chrome.driver","D:\\chrome78\\chromedriver.exe");
	    		            	 driver =new ChromeDriver();
	    		             }
	    		       driver.manage().window().maximize();
	    		       driver.manage().timeouts().implicitlyWait(12,TimeUnit.SECONDS);
	    		       driver.get("https://adactin.com/HotelApp/");
	    	 }
	    	public boolean              
	    	             
	    	             
	    	             
	    	             
	    	             
	    	             
	    	             
	    	             
	    	             
	    	 
	     }
	     
	     
}

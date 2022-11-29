package com.selenium.addressbook_selenium_testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
		
    public static void main( String[] args ) 
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\ED\\chromedriver.exe");
        
        ChromeOptions chromeOptions =new ChromeOptions();
        chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");
        chromeOptions.setBinary("C:\\Program Files\\BraveSoftware\\Brave-Browser\\Application\\brave.exe");
        WebDriver driver = new ChromeDriver(chromeOptions);
        
        
        System.out.println("TestCase Execution Starts");
        
        driver.get("http://127.0.0.1:8085/addressbook-demo/");
        
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        
        driver.findElement(By.className("v-button")).click();
        
        driver.findElement(By.id("gwt-uid-5")).sendKeys("Rucchin");
        
        driver.findElement(By.id("gwt-uid-7")).sendKeys("Sharma");
        
        driver.findElement(By.id("gwt-uid-9")).sendKeys("9876543210");
        
        driver.findElement(By.id("gwt-uid-11")).sendKeys("Rucchin@sharma.com");
        
        driver.findElement(By.id("gwt-uid-13")).sendKeys("11/2/22");
        
        driver.findElement(By.className("v-button-primary")).click();
        
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        
        
        
        driver.quit();
        
        System.out.println("Test case executed successfully");
        
        
        
        
        
        
        
         
        
        
    
    
    
    }
    
    
    
}

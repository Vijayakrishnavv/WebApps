package com.emobility.utility;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Helper 
{
	 WebDriver driver;
	
	public static void captureScreenshot(WebDriver driver)
	{
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		try 
		{
			org.openqa.selenium.io.FileHandler.copy(src, new File("./Screenshots/Portal" + getCurrentDateTime() + ".png"));
		} 
		catch (IOException e) 
		{
			
			System.out.println("Not able to take screenshot"+e.getMessage());
		}
		
		
			
		
	}
	
	public static String getCurrentDateTime()
	{
		DateFormat customDate = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		
		Date date = new Date();
		
		return customDate.format(date);
		 
		
		
		
	}
	
	
	public void handleFrames()
	{
		
	}
	
	
	public void acceptAlert()
	{
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		
		
	}
	
	public void dismissaAlert()
	{
		
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		
		
		
	}
	
	public void getAlertText()
	{
		
		Alert alert = driver.switchTo().alert();
		alert.getText();
		
		
		
	}
	
	public void sendKeyToAlert(String alertText)
	{
		
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(alertText);
		
		
		
	}
	
	
	public void handleWindow(String window)
	{
		
		driver.getWindowHandle();
		
		driver.switchTo().window(window);
		
	}
	
	
	public void handleWindows(String childWindow)
	{
		
		
		driver.getWindowHandles();
		
		driver.switchTo().window(childWindow);
		
	}
	
	public void dragAnDrop(WebElement source , WebElement target )
	{
		
		Actions action=new Actions(driver);					
		
        action.dragAndDrop(source, target).build().perform();
		
       
        
	}
	
	
	public void doubleclick()
	{
		Actions action = new Actions(driver);
		
		action.doubleClick().perform();
		
	}
	
	
	public void rightClick()
	{
		
		Actions action = new Actions(driver);
		action.contextClick().perform();
		
		action.contextClick(driver.findElement(By.xpath(""))).perform();
		
		
		
	}
	
	
	
	public  void imp_wait()
	{
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
	}
	
	public  WebDriver explicit()
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
		return driver;
		
		
	}
	
	public void threadWait()
	{
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

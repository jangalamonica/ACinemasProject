/**
 * 
 */
package com.acinemas.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Manila
 *
 */
public class MovieDetailsPage {
	WebDriver driver;
	By avatime=By.xpath("//p[contains(text(),'92 Available')]");
	By startover=By.xpath("//button[contains(text(),'Start Over!')]");
	By back=By.xpath("//button[contains(text(),'Back')]");
	public MovieDetailsPage()
	{
		this.driver=driver;
	}
	
	public void selectAvailableTime()
	{
		driver.findElement(avatime).click();
	}
	
	public void selectStartOver()
	{
		driver.findElement(startover);
	}
	
	public void selectBack()
	{
		driver.findElement(back);
	}
	
	

}

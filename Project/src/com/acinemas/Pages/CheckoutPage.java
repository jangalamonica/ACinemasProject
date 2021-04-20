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
public class CheckoutPage extends AddTicketsPage{
	WebDriver driver;
	By deletefoodbutn=By.xpath("//i[@class='fa fa-trash']");
	public CheckoutPage()
	{
		this.driver=driver;
	}
	
	public void ClickDeleteFoodItemButton()
	{
		driver.findElement(deletefoodbutn).click();
	}
	

}

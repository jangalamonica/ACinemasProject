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
public class FoodItemsPage extends AddTicketsPage{
	WebDriver driver;
	By popcorndecbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-foodselection[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[1]");
	By popcornincrbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-foodselection[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/button[2]");
	By pizzadecbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-foodselection[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[26]/div[1]/div[1]/button[1]");
	By pizzaincrbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-foodselection[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[26]/div[1]/div[1]/button[2]");
	
	public FoodItemsPage()
	{
		this.driver=driver;
	}
	
	public void ClickPopcornDecreaseButton()
	{
		driver.findElement(popcorndecbutn).click();
	}
	
	public void ClickPopcornIncreaseButton()
	{
		driver.findElement(popcornincrbutn).click();
	}
	
	public void ClickPizzaDecreaseButton()
	{
		driver.findElement(pizzadecbutn).click();
	}
	
	public void ClickPizzaIncreaseButton()
	{
		driver.findElement(pizzaincrbutn).click();
	}
	
	
	
	
	

}

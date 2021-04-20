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
public class AddTicketsPage extends MovieDetailsPage {
	WebDriver driver;
	By matineedecbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-add-ticket[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/button[1]");
	By matineeincrbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-add-ticket[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/button[2]");
	By adultdecbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-add-ticket[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/button[1]");
	By adultincrbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-add-ticket[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/div[2]/div[1]/button[2]");
	By testcombodecbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-add-ticket[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/button[1]");
	By testcomboincrbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-add-ticket[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/button[2]");
	By fooditemdecbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-add-ticket[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[1]/button[2]");
	By fooditemincrbutn=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-add-ticket[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[5]/div[2]/div[1]/button[2]");
	By nextbutton=By.xpath("//button[contains(text(),'Next')]");
	
	public AddTicketsPage()
	{
		this.driver=driver;
	}
	
	public void ClickMatineeDecreaseButton()
	{
		driver.findElement(matineedecbutn).click();
	}
	
	public void ClickMatineeIncreaseButton()
	{
		driver.findElement(matineeincrbutn).click();
	}

	public void ClickAdultDecreaseButton()
	{
		driver.findElement(adultdecbutn).click();
	}
	
	public void ClickAdultIncreaseButton()
	{
		driver.findElement(adultincrbutn).click();
	}
	
	public void ClickTestComboDecreaseButton()
	{
		driver.findElement(testcombodecbutn).click();
	}
	
	public void ClickTestComboIncreaseButton()
	{
		driver.findElement(testcomboincrbutn).click();
	}
	
	
	public void ClickFoodItemDecreaseButton()
	{
		driver.findElement(testcombodecbutn).click();
	}
	
	public void ClickFoodItemincreaseButton()
	{
		driver.findElement(testcomboincrbutn).click();
	}
	
	public void ClickNextButton()
	{
		driver.findElement(nextbutton).click();
	}
}

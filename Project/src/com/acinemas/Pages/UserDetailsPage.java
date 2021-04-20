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
public class UserDetailsPage extends AddTicketsPage{
	WebDriver driver;
	By firstname=By.xpath("//input[@name='first_name']");
	By lastname=By.xpath("//input[@name='last_name']");
	By zipcode=By.xpath("//input[@name='zipcode']");
	By email=By.xpath("//input[@name='user_email']");
	By phone=By.xpath("//input[@name='user_phonenumber']");
	
	
	public UserDetailsPage()
	{
		this.driver=driver;
	}
	
	public void EnterFirstName(String fname)
	{
		driver.findElement(firstname).sendKeys(fname);
	}
	
	public void EnterLastName(String lname)
	{
		driver.findElement(lastname).sendKeys(lname);
	}
	
	public void EnterZipCode(String zc)
	{
		driver.findElement(zipcode).sendKeys(zc);
	}
	
	public void EnterEmail(String mail)
	{
		driver.findElement(email).sendKeys(mail);
	}
	
	public void EnterPhoneNumber(String phne)
	{
		driver.findElement(phone).sendKeys(phne);
	}

}

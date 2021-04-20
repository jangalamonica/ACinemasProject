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
public class HomePage {
	WebDriver driver;
	By selectdate=By.xpath("//h2[contains(text(),'22')]");
	By selectmovie=By.xpath("//h3[contains(text(),'Ant-Man and the Wasp')]");
	public HomePage()
	{
		this.driver=driver;
	}
	
	public void selectDate()
	{
		driver.findElement(selectdate).click();
	}
	
	public void selectMovie()
	{
		driver.findElement(selectmovie).click();
	}

	
}

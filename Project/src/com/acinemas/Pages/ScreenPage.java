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
public class ScreenPage extends AddTicketsPage {
	WebDriver driver;
	By selectseat1=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-seatselection[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul[5]/li[3]/div[1]/a[1]");
	By selectseat2=By.xpath("//body/app-root[1]/app-applayout[1]/div[1]/app-seatselection[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/ul[5]/li[4]/div[1]/a[1]");
	
	 public ScreenPage()
	 {
		 this.driver=driver;
	 }
	 
	 public void SelectSeat1()
	 {
		 driver.findElement(selectseat1).click();
	 }
	 
	 public void SelectSeat2()
	 {
		 driver.findElement(selectseat2).click();
	 }

}

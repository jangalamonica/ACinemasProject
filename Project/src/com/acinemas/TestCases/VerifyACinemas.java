/**
 * 
 */
package com.acinemas.TestCases;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.acinemas.Pages.AddTicketsPage;
import com.acinemas.Pages.FoodItemsPage;
import com.acinemas.Pages.HomePage;
import com.acinemas.Pages.MovieDetailsPage;
import com.acinemas.Pages.ScreenPage;
import com.acinemas.Pages.UserDetailsPage;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Manila
 *
 */
public class VerifyACinemas {
	
	
	@Test
	public void ACinemasProject()throws Exception
	{

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
    driver.get("https://cinema360onlineweb.azurewebsites.net/movies");
    
    HomePage home=new HomePage();
    home.selectDate();
    Thread.sleep(3000);
    home.selectMovie();
    Thread.sleep(3000);
    
    
    MovieDetailsPage movie=new MovieDetailsPage();
    movie.selectAvailableTime();
    Thread.sleep(3000);
    
    AddTicketsPage ticket=new AddTicketsPage();
    ticket.ClickMatineeIncreaseButton();
    Thread.sleep(2000);
    ticket.ClickAdultIncreaseButton();
    Thread.sleep(2000);
    ticket.ClickNextButton();
    Thread.sleep(2000);
    
    
    ScreenPage sc=new ScreenPage();
    sc.SelectSeat1();
    Thread.sleep(2000);
    sc.SelectSeat2();
    Thread.sleep(2000);
    sc.ClickNextButton();
    Thread.sleep(2000);
    
    FoodItemsPage food=new FoodItemsPage();
    food.ClickPopcornIncreaseButton();
    Thread.sleep(2000);
    food.ClickNextButton();
    Thread.sleep(3000);
    food.selectBack();
    Thread.sleep(3000);
    JavascriptExecutor js=(JavascriptExecutor)driver;
    js.executeScript("window.scrollBy(0,800)");
    food.ClickPizzaIncreaseButton();
    Thread.sleep(2000);
    food.ClickNextButton();
    Thread.sleep(3000);

    FileInputStream fis=new FileInputStream("C:\\Users\\Manila\\eclipse-workspace\\Project\\src\\data.properties");
    Properties p=new Properties();
    p.load(fis);
    String firstname=p.getProperty("firstname");
    String lastname=p.getProperty("lastname");
    String zipcode=p.getProperty("zipcode");
    String email=p.getProperty("email");
    String phonenumber=p.getProperty("phonenumber");
    UserDetailsPage details=new UserDetailsPage();
    details.EnterFirstName(firstname);
    Thread.sleep(2000);
    details.EnterLastName(lastname);
    Thread.sleep(2000);
    details.EnterZipCode(zipcode);
    Thread.sleep(2000);
    details.EnterEmail(email);
    Thread.sleep(2000);
    details.EnterPhoneNumber(phonenumber);
    Thread.sleep(2000);
    details.ClickNextButton();
    Thread.sleep(2000);
    File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    Files.copy(screenshotFile, new File("./screenshot/"+"UnabletogototransactionPage"+System.currentTimeMillis()+".png"));
    Thread.sleep(3000);
    driver.quit();
    
    
    
    
    
	}

}

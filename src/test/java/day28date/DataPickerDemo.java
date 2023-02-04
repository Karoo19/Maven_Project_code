package day28date;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DataPickerDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		//Approche1
		//driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("06/09/2022");
		
		//Approche2
		//Select month and year
		String year="2023";
		String month="March";
		String date="25";
		
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();    //will open picker
		
			
		while(true) {
		String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		if(mon.equals(month) && yr.equals(year));
			{
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();    //next button
		}
		
		//Select Date:
		 list<WebElement> allDates=driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
		 
		 for(WebElement dt:allDates)
		 {
			 if(dt.getText().equals(date));
		 }
		 dt.click();
		 break;
	
		
	}

	}



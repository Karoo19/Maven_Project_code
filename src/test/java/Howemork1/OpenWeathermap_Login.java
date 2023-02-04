package Howemork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWeathermap_Login {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://home.openweathermap.org/users/sign_in");
		driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys("Helloworld12@gmail.com");
		driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys("Helloworld@123");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

	}

}

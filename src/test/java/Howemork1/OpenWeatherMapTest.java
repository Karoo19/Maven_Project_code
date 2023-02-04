package Howemork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenWeatherMapTest {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://openweathermap.org/");
		driver.findElement(By.xpath("//ul[@id='mobile-menu']/preceding-sibling::*/child::div/descendant::a[11]")).click();
		
	}

}

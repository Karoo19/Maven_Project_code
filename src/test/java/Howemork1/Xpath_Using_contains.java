package Howemork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Using_contains {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Samy");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Sarah");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Selenium223344@gmail.com");

	}

}

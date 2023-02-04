package Howemork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartTest2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Samy");
		driver.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Sarah");
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Selenium223344@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("12312345645690");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@id='input-confirm']")).sendKeys("Selenium@123");
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		

	}

}

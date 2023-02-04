package Howemork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_CreateAccount {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/success");
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")).click();
		driver.findElement(By.xpath("//fieldset[@id='account']/child::div[2]/div/input")).sendKeys("world1");
		driver.findElement(By.xpath("//form[@class='form-horizontal']/child::fieldset[1]/child::div[3]/child::label/following::div/input[1]")).sendKeys("world2");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Helloworld12@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-telephone']")).sendKeys("11223344550");
		driver.findElement(By.xpath("//fieldset[@id='account']/following-sibling::*[1]/descendant::input[1]")).sendKeys("Helloworld@123");
		driver.findElement(By.xpath("//fieldset[@id='account']/following-sibling::*[1]/descendant::input[2]")).sendKeys("Helloworld@123");
		driver.findElement(By.xpath("//fieldset[@id='account']/following-sibling::*[1]/descendant::input[2]/ancestor::*/following::*/descendant::input[2]")).click();
		driver.findElement(By.xpath("//fieldset[@id='account']/following-sibling::*[1]/descendant::input[2]/ancestor::*/following::*/following-sibling::div[@class='buttons']/descendant::input")).click();
		driver.findElement(By.xpath("//fieldset[@id='account']/following-sibling::*[1]/descendant::input[2]/ancestor::*/following::*/following-sibling::div[@class='buttons']/descendant::input[2]")).click();
		
		driver.findElement(By.xpath("//li[@class='dropdown open']/descendant::span[1]")).click();
		driver.findElement(By.xpath("//li[@class='dropdown open']/descendant::li[5]/a")).click();
		

	}

}

package Howemork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TutorialsNinja_Login {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=common/home");
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Helloworld12@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Helloworld@123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}

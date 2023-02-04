package Howemork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff_CreateAccount_Test1 {

	//Create Account link = 20 xpaths
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		//driver.findElement(By.xpath("(//a[normalize-space()='Create Account'])[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[3]/p/a[2]")).click();
		//driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']")).click();
		//driver.findElement(By.xpath("//a[@title='Create Rediffmail Account'][text()='Create Account']")).click();
		//driver.findElement(By.xpath("//a[@title='Create Rediffmail Account' and text()='Create Account']")).click();
		//driver.findElement(By.xpath("//a[@title='Create Rediffmail Account' or text()='Create Account']")).click();
		//driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']//ancestor::a")).click();
		//driver.findElement(By.xpath("//a[@title='Create Rediffmail Account']//ancestor::*/a[2]")).click();
		//driver.findElement(By.xpath("//a[contains(@title,'Create Rediffmail Account')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();
		//driver.findElement(By.xpath("//div[@class='cell alignR toprlinks']/descendant::a[2]")).click();
		//driver.findElement(By.xpath("//div[@class='table']/descendant::a[7]")).click();
		//driver.findElement(By.xpath("//div[@class='fnt0']/following-sibling::div[1]/descendant::a[7]")).click();
		//driver.findElement(By.xpath("//div[@class='navbar']/preceding-sibling::div[3]/descendant::a[7]")).click();
		//driver.findElement(By.xpath("//div[@class='table']/child::div[3]/descendant::a[2]")).click();
		//driver.findElement(By.xpath("//div[@class='table']/descendant::a[7]")).click();
		//driver.findElement(By.xpath("//div[@class='table']/child::div[2]/following-sibling::div/child::p/child::a[2]")).click();
		//driver.findElement(By.xpath("//p[@id='signin_info']/child::a[2]")).click();
		//driver.findElement(By.xpath("//p[@id='signin_info']/a[2]")).click();
		driver.findElement(By.xpath("//span[@id='username']/following::a[2]")).click();

	}

}

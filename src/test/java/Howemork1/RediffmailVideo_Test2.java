package Howemork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffmailVideo_Test2 {

	public static void main(String[] args) {
		
		////driver.findElement(By.xpath("//div[@id='beacon_b5bb5be59a']/ancestor::div/following-sibling::div[@class='logobar']/descendant::a[4]")).click();    Not sure why not opening Video
		//driver.findElement(By.xpath("//div[@id='beacon_b5bb5be59a']/ancestor::div/following-sibling::div[1]/child::div/descendant::a[4]")).click();    Not sure why not opening Video!!
		//driver.findElement(By.xpath("//div[@id='beacon_b5bb5be59a']/ancestor::div/following::a[@class='vdicon']")).click();
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[4]")).click();
		//driver.findElement(By.xpath("//a[@class='vdicon']")).click();
		//driver.findElement(By.xpath("//a[@title='Watch videos']")).click();
		//driver.findElement(By.xpath("(//a[@title='Watch videos'])[1]")).click();
		//driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[4]")).click();
		//driver.findElement(By.xpath("//div[@class='fnt0']/following-sibling::*/child::*/child::div[2]/a[4]")).click();
		//driver.findElement(By.xpath("//div[@class='fnt0']/following-sibling::*/descendant::*/child::*[@class='cell topicons']/a[4]")).click();
		//driver.findElement(By.xpath("//div[@id='red_container_main']/preceding-sibling::div[@class='logobar']/descendant::a[4]")).click();
		//driver.findElement(By.xpath("//a[@class='vdicon']/parent::div/descendant::a[4]")).click();
		//driver.findElement(By.xpath("//div[@class='div_newssearch']/ancestor::div/preceding-sibling::div[@class='logobar']/descendant::a[@class='vdicon']")).click();
		//driver.findElement(By.xpath("//a[@class='mailicon']/following::a[@class='vdicon']")).click();
		//driver.findElement(By.xpath("//span[@class='hmsprite logo']/parent::div/following-sibling::div[@class='cell topicons']/descendant::a[@class='mailicon']/following::a[@class='vdicon']")).click();
		//driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='vdicon']")).click();
		//driver.findElement(By.xpath("//input[@id='OAS_subsection']/following-sibling::*/descendant::a[@class='vdicon']")).click();
		//driver.findElement(By.xpath("//input[@id='OAS_subsection']/parent::*/child::*/descendant::div[@class='table']/descendant::a[4]")).click();
		//driver.findElement(By.xpath("//div[@class='red_container']/preceding-sibling::*/descendant::a[@title='Watch videos']")).click();
		//driver.findElement(By.xpath("//a[@class='mailicon']/following::a[3]")).click();
		//driver.findElement(By.xpath("//a[@title='Watch videos']")).click();
		//driver.findElement(By.xpath("//span[@id='username']/parent::div/parent::*/descendant::a[@class='vdicon']")).click();
		driver.findElement(By.xpath("//li[@class='news']/ancestor::div/preceding-sibling::div/descendant::*/following::a[@class='vdicon']")).click();
		

	}

}

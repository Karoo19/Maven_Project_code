package Howemork1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffBusinessEmail {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/a[3]")).click();
		//driver.findElement(By.xpath("//a[@title='Lightning fast business email hosting']")).click();
		//driver.findElement(By.xpath("a[title='Lightning fast business email hosting']")).click();
		//driver.findElement(By.xpath("//a[text()='Business Email']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Business Email')]")).click();
		//driver.findElement(By.xpath("//a[contains(@class,'bmailicon relative')]")).click();
		//driver.findElement(By.xpath("//a[@class='bmailicon relative']")).click();
		//driver.findElement(By.xpath("//a[@class='mailicon']/following::a[2]")).click();
		//driver.findElement(By.xpath("//a[@class='mailicon']/parent::*/descendant::a[@class='bmailicon relative']")).click();
		//driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[3]")).click();
		//driver.findElement(By.xpath("//div[@class='logobar']/child::div/child::*/following-sibling::*/a[@class='bmailicon relative']")).click();
		//driver.findElement(By.xpath("//div[@class='logobar']/child::div/descendant::a[@class='bmailicon relative']")).click();
		//driver.findElement(By.xpath("//div[@id=\"lasttab\"]/ancestor::div[@id='tabtable']/parent::div/ancestor::*/preceding-sibling::*/descendant::a[@class='bmailicon relative']")).click();
		//driver.findElement(By.xpath("//div[@id=\"lasttab\"]/ancestor::div[@id='tabtable']/parent::div/ancestor::div/preceding-sibling::*/descendant::a[3]")).click();
		//driver.findElement(By.xpath("//input[@id='OAS_subsection']/parent::*/child::*/descendant::div[@class='table']/descendant::a[3]")).click();
		//driver.findElement(By.xpath("//div[@class='red_container']/preceding-sibling::*/descendant::a[3]")).click();
		//driver.findElement(By.xpath("//a[@class='vdicon']/parent::*/child::a[@class='bmailicon relative']")).click();
		//driver.findElement(By.xpath("//span[@id='username']/parent::div/parent::*/descendant::a[@class='bmailicon relative']")).click();
		//driver.findElement(By.xpath("//li[@class='news']/ancestor::div/preceding-sibling::div/descendant::*/following::a[@class='bmailicon relative']")).click();
		driver.findElement(By.xpath("//div[@class='logobar']/descendant::a[3]")).click();
		

	}

}

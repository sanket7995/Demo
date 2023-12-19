package differentpages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakingPayment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		
		Thread.sleep(2000);
		
		WebElement scrolldown=driver.findElement(By.xpath("//div[@class='_3V8rao']/child::span"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",scrolldown);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@class='_1bEAQy _2iN8uD'])[12]/child::img[2]")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[normalize-space()='Google Pixel 8 Pro (Obsidian, 128 GB)']")).click();
		
		Thread.sleep(1000);
		
        //for clicking on add to cart we have to switch our selenium control to next window i.e add to cart window
		
		Set<String> a=driver.getWindowHandles();
		
		ArrayList al=new ArrayList(a);
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		driver.switchTo().window((String)al.get(1));
		
		WebElement cart=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
		
		cart.click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//span[normalize-space()='Place Order']")).click();
		
		Thread.sleep(1000);
		
		WebElement num=driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']"));
		
		num.click();
		
		num.sendKeys("9689686198");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _20xBvF _3AWRsL']")).click();
		
		

	}

}

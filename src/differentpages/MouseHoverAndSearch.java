package differentpages;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverAndSearch {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='JFPqaw']/child::span")).click();
		
		WebElement a=driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[4]"));
		
		Thread.sleep(2000);
		
		Actions b=new Actions(driver);
		
		b.moveToElement(a).build().perform();
		
		Thread.sleep(2000);
		
		WebElement c=driver.findElement(By.xpath("//div[@class='_16rZTH']/child::object/child::a[5]"));
		
		Actions d=new Actions(driver);
		
		Thread.sleep(2000);
		
		d.moveToElement(c).build().perform();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='uAl2uE']/following::a[6]")).click();
		
		Thread.sleep(1000);
		
		WebElement e=driver.findElement(By.xpath("//span[normalize-space()='Price']"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView();",e);
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='s1Q9rs'])[3]")).click();
		
        Set<String> f=driver.getWindowHandles();
		
		ArrayList al=new ArrayList(f);
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		
		driver.switchTo().window((String)al.get(1));
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		
		

	}

}

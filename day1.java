package locator;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1 {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=cms/demo");
		driver.manage().window().maximize();
		
		//driver.findElement(By.name("newsletter")).sendKeys("pant");
		
		driver.findElement(By.linkText("Features")).click();
		driver.findElement(By.partialLinkText("Dem")).click();
		
		// This is valid — single class name
		List<WebElement> headerLinks = driver.findElements(By.className("list-unstyled"));
		System.out.println("Number of header links: " + headerLinks.size());
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("No. of Links = " + links.size());
		
		//driver.quit(); // Always good to close the browser after running
	}
}

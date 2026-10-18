package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//logo
		/*WebElement logo=driver.findElement(By.xpath(""));
		System.out.println("display status of logo:"+logo.isDisplayed());
	*/
		
		boolean status=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(status);
		
		
		//search box is enable or not
		WebElement searchbox=driver.findElement(By.xpath(""));
		
		
		//System.out.println("Display ststus:"+searchbox.isDisplayed());
		//System.out.println("Display ststus:"+searchbox.isDisplayed());
		//System.out.println("Enable ststus:"+searchbox.isEnabled());
		
		
		WebElement male_rd=driver.findElement(By.xpath("//span[@class='male']"));
		WebElement female_rd=driver.findElement(By.xpath("//span[@class='female']"));
		
		//before selection
		System.out.println("Before seletion...");
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		
		//after selection of male
		System.out.println("after selecting of male radio button");
		male_rd.click();
		System.out.println(male_rd.isSelected());
		System.out.println(female_rd.isSelected());
		
		//after selection of female
				System.out.println("after selecting of female radio button");
				female_rd.click();
				System.out.println(male_rd.isSelected());
				System.out.println(female_rd.isSelected());
	}

}

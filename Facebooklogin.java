package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://en-gb.facebook.com/");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElement(By.linkText("Create New Account")).click();
				driver.findElementByName("firstname").sendKeys("Aswini");
				driver.findElementByName("lastname").sendKeys("Gunasekran");
				driver.findElementByName("reg_email__").sendKeys("gaswini313@gmail.com");
				driver.findElementByName("reg_passwd__").sendKeys("Aswini@123");
				WebElement drp1=driver.findElement(By.id("day"));
				Select drpdwn1=new Select(drp1);
				drpdwn1.selectByValue("18");
				WebElement drp2=driver.findElement(By.id("month"));
				Select drpdwn2=new Select(drp2);
				drpdwn2.selectByValue("1");
				WebElement drp3=driver.findElement(By.id("year"));
				Select drpdwn3=new Select(drp3);
				drpdwn3.selectByVisibleText("1997");
				driver.findElementByClassName("_58mt").click();			
	}
}

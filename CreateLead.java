package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/login");
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Create Lead")).click();
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Aswini");
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gunasekaran");
				WebElement drp1=driver.findElement(By.id("createLeadForm_dataSourceId"));
				Select drpdwn1=new Select(drp1);
				drpdwn1.selectByIndex(1);
				WebElement drp2=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select drpdwn2=new Select(drp2);
				drpdwn2.selectByValue("9000");
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ammu");
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Vicky");
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Automation");
				driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("01/18/97");
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("SeleniumProject");
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("ECE");
				driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");
				WebElement drp3=driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select drpdwn3=new Select(drp3);
				drpdwn3.selectByVisibleText("Computer Software");
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
				WebElement drp4=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
				Select drpdwn4=new Select(drp4);
				drpdwn4.selectByVisibleText("Partnership");
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("1234");
				driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("23456");
				driver.findElement(By.id("createLeadForm_description")).sendKeys("A sample project");
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("A sample project");
				WebElement countryCode=driver.findElement((By.id("createLeadForm_primaryPhoneCountryCode")));
				countryCode.clear();
				countryCode.sendKeys("5");
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("123456");
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("1234567898");
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("9090909009");
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("gaswini313@gmail.com");
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Aswini");
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.google.com");
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("vicky");
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Vignesh");
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("37/4d1");
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("t.b.link road");
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("krishnagiri");
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("635001");
				driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("635001");
				WebElement drp5=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select drpdwn5=new Select(drp5);
				drpdwn5.selectByValue("IND");
				WebElement drp6=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select drpdwn6=new Select(drp6);
				drpdwn6.selectByValue("IN-TN");
				driver.findElementByClassName("smallSubmit").click();
	}

}

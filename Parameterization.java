package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
 @Parameters({"Preeti","Sharma"})
	@Test
  public void f(String Preeti,String Sharma) {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\CDAC\\Desktop\\Selenium Data\\chromedriver-win32\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.navigate().to("https://demo.automationtesting.in/Register.html");
		dr.manage().window().maximize();
		dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]")).sendKeys(Preeti);
		dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/input[1]")).sendKeys(Sharma);
       // Select ds=new Select(dr.findElement(By.xpath("")));
		//	dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Pune");
	//	dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]")).sendKeys("preeti@gmail.com");
	//  dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[4]/div[1]/input[1]")).sendKeys("9359127635");
	//  dr.findElement(By.xpath("//body/section[@id='section']/div[1]/div[1]/div[2]/form[1]/div[5]/div[1]/label[2]/input[1]")).click();
	//  dr.findElement(By.id("checkbox2")).click();
  }
}

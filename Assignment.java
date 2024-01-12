import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
public static void main(String args[])
{
    
System.setProperty("webdriver.chrome.driver","C:\\Users\\CDAC\\Desktop\\Selenium Data\\chromedriver-win32 (1)\\chromedriver-win32.exe");
WebDriver dr = new ChromeDriver();
dr.get("https://demo.guru99.com/test/newtours/");
dr.findElement(By.xpath("//a[contains(text(),'REGISTER')]")).click();
System.out.println("Current Page URL ->"+dr.getCurrentUrl());
dr.manage().window().maximize();
dr.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("Preeti");
dr.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).sendKeys("Sharma");
dr.findElement(By.xpath("//tbody/tr[4]/td[2]/input[1]")).sendKeys("1234567899");
dr.findElement(By.xpath("//input[@id='userName']")).sendKeys("preeti@gmail.com");
dr.findElement(By.xpath("//tbody/tr[7]/td[2]/input[1]")).sendKeys("Kalyani Nagar");
dr.findElement(By.xpath("//tbody/tr[8]/td[2]/input[1]")).sendKeys("Pune");
dr.findElement(By.xpath("//tbody/tr[9]/td[2]/input[1]")).sendKeys("Maharastra");
dr.findElement(By.xpath("//tbody/tr[10]/td[2]/input[1]")).sendKeys("411009");
Select ds= new Select(dr.findElement(By.xpath("//tbody/tr[11]/td[2]/select[1]")));
ds.selectByVisibleText("INDIA");

dr.findElement(By.xpath("//input[@id='email']")).sendKeys("Preeti");
dr.findElement(By.xpath("//tbody/tr[14]/td[2]/input[1]")).sendKeys("abcd123");
dr.findElement(By.xpath("//tbody/tr[15]/td[2]/input[1]")).sendKeys("abcd123");
dr.findElement(By.xpath("//tbody/tr[17]/td[1]/input[1]")).click();
dr.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
WebElement w=dr.findElement(By.xpath("//a[contains(text(),'sign-in')]")); 
w.sendKeys("Preeti");
String username=w.getAttribute("Preeti");
System.out.println("User name ->"+username);
w=dr.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]"));
w.sendKeys("abcd123");
String password=w.getAttribute("abcd123");
System.out.println("Password"+password);
dr.findElement(By.xpath("//tbody/tr[4]/td[1]/input[1]")).click();

}
}

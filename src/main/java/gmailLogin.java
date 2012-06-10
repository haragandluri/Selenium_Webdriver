import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class gmailLogin {
	
	public static void main(String args[]){
		
	 
	
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.gmail.com");
	
	
	driver.findElement(By.xpath(".//*[@id='Email']")).sendKeys("haragandluri");
	driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("07817418499");
	driver.findElement(By.xpath(".//*[@id='signIn']")).click();
	
 	

}
	}

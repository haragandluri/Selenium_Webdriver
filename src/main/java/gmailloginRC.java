import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.*;


public class gmailloginRC {
//http://localhost:4444/selenium-server/driver/?cmd=shutDownSeleniumServer
 
	public static void main(String[] args)throws Exception  {
		
		Selenium selenium;
		SeleniumServer seleniumserver;
 
		RemoteControlConfiguration rc = new RemoteControlConfiguration();
		seleniumserver = new SeleniumServer(rc);
		selenium = new DefaultSelenium("localhost", 4444, "*firefox","http://");
		seleniumserver.start();
		selenium.start();

				
		selenium.open("http://www.gmail.com");
		
		selenium.windowMaximize();
		//Thread.sleep(10000);
		selenium.type("Email","haragandluri");
		selenium.type("Passwd","07817418499");
		selenium.click("signIn");
		
		
		
	//	seleniumserver.stop();
		//selenium.stop();


	}

}

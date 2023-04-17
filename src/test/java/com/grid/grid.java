package com.grid;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class grid {
	public class Grid_Test {
		
		String Baseurl ="https://google.com";
		String Nodeurl = "http://localhost:4444/wd/hub";
		WebDriver d;
		
		@BeforeTest
	public void OpeningBrowser() throws MalformedURLException {
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WIN10);
		// d = new RemoteWebDriver(new URL(Nodeurl),cap);
		 d= new RemoteWebDriver(new URL(Nodeurl),cap);
		 d.get(Baseurl);
		 d.manage().window().maximize();
		}
		@Test
		public void tittlecheck() {
			
		String actualtitle = d.getTitle();
		String expedtedtittle  = "Facebook Login";
		Assert.assertEquals(actualtitle, expedtedtittle);
		
	}


	public void  close() {
		d.close();
	}
	
 
	}
	


}

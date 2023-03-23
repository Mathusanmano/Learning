package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Initialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("http://www.google.co.in");
        driver.findElement(By.name("q")).sendKeys("http//www.epf.lk"+Keys.ENTER);
        threadsleep(3000);
        driver.findElement(By.linkText("https://epf.lk/")).click();
        
        
        
        //driver.quit();
	}

	private static void threadsleep(int i) {
		// TODO Auto-generated method stub
		
	}

}

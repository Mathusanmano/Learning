package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.leafground.com/");
        Thread.sleep(3000);
        
        //Click the Element
        driver.findElement(By.xpath("//*[@id=\"j_idt107\"]/div[2]")).click();
        
        //Click the weekly Assignment
        WebElement Weekly =driver.findElement(By.xpath("//*[@id=\"j_idt109\"]/div[2]"));
        Weekly.click();
        
       
	boolean weeklyselected= Weekly.isSelected();
       System.out.println(Weekly);
        
	}

}

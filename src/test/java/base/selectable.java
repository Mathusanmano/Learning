package base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	private static final org.openqa.selenium.interactions.Actions New = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://jqueryui.com/draggable/");
        Thread.sleep(3000);
        
        //Click the Selectable
        WebElement Selectable = driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[4]/a"));
         Selectable.click();
         Thread.sleep(3000);
         
         //Click the Selectable1
         Thread.sleep(3000);
        WebElement Selectable1 = driver.findElement(By.className("ui-widget-content ui-selectee"));
         Selectable1.click();
         //Thread.sleep(3000);
         
         
         //List<WebElement> table1 = driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
	    // int listsize = table1.size();
	    // System.out.println(listsize);
	 
 //Actions actions = new Actions(driver);
 //actions.clickAndHold(table1.get(1));
 //actions.clickAndHold(table1.get(2));
 //actions.clickAndHold(table1.get(3));	
 //actions.build().perform();
	 
	
	}

	private static void Actions(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	private static void Action(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	

}

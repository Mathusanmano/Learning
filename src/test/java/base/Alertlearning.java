package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertlearning {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.leafground.com/");
        Thread.sleep(3000);
       
        //Browser click
        driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a/i[1]")).click();
        Thread.sleep(3000);
	    
        //Alert click
        driver.findElement(By.xpath("//*[@id=\"menuform:m_overlay\"]/a")).click();
       
        //Simple Alert box click
        WebElement Alertbox1= driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]"));
        Alertbox1.click();
        
	    //driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]/span[2]")).click();
       
	    //Click ok Button
	    Alert alert = driver.switchTo().alert();
        Thread.sleep(3000);
        alert.accept();
	}

	
	}


package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpomptbox {

	
	

	private static final Alert PompAlert = null;
	private static final String PrompAlert = null;

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
        
        //Click Alert PomptDaialog box
        driver.findElement(By.id("j_idt88:j_idt104")).click();
        
        // Enter the Mass
       Alert proptalert = driver.switchTo().alert();
       Thread.sleep(3000);
       proptalert.sendKeys("Mathusan");
       Thread.sleep(3000); 
      proptalert.accept();
   
	}
	

}

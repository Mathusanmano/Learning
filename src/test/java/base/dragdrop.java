package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragdrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.leafground.com/");
        Thread.sleep(3000);
        
        //Browser click
        driver.findElement(By.xpath("//*[@id=\"menuform:j_idt39\"]/a/i[1]")).click();
        Thread.sleep(3000);
        
      //Drag click
        driver.findElement(By.xpath("//*[@id=\"menuform:m_drag\"]/a/span")).click();
        
        WebElement from = driver.findElement(By.xpath("//*[@id=\"form:drag_content\"]/p"));
        WebElement To  =  driver.findElement(By.xpath("//*[@id=\"form:drop_header\"]/span"));
        
        Actions action = new Actions(driver);
        
        //action.clickAndHold(from).moveToElement(To).release(To).build().perform();
        action.dragAndDrop(from, To).build().perform();
        
	}

}

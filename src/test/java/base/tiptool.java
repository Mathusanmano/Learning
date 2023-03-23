package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tiptool {



	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
        driver.get("https://jqueryui.com/tooltip/");
        Thread.sleep(3000);
        
       WebElement Tooltip = driver.findElement(By.id("age"));
        		Tooltip.click();
       
	String toolTip = Tooltip.getAttribute("title");
	System.out.println(toolTip);
       
	}

}

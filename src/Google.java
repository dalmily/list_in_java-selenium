

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/daniaalmilly/Downloads/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");
		
		driver.manage().window().maximize();
		
		String title = driver.getTitle();
		
          System.out.println(title);
		

          List <WebElement> listOfOptions = driver.findElements(By.tagName("option"));

          for (int i=0; i < listOfOptions.size(); i++ ) {
        	  
        	  
        	 System.out.println(listOfOptions.get(i).getText());
        	  
        	  
        	  
          }
          
          
		
	 
		

}
}

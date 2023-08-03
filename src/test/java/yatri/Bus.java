package yatri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bus {
  @Test
  public void bus() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opeining flights", true);
	  driver.get("https://www.sastasafar.com/");
	  Thread.sleep(2000);
	  driver.close();
  }
}

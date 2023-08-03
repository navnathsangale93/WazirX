package yatri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Railyatri {
  @Test
  public void railticket() throws InterruptedException {
	  WebDriver driver = new ChromeDriver();
	  Reporter.log("opeining rail", true);
	  driver.get("https://www.irctc.co.in/");
	  Thread.sleep(2000);
	  driver.close();
  }
}

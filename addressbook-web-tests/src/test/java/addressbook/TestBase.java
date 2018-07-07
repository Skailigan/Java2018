package addressbook;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase extends ApplicationManager {

  @BeforeMethod
  public void setUp() throws Exception {
    init();
  }

  @AfterMethod
  public void tearDown() {
    stop();
  }

}

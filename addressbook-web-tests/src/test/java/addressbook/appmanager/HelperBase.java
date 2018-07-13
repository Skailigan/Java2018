package addressbook.appmanager;

import org.openqa.selenium.*;

public class HelperBase {
  protected WebDriver wd;

  public HelperBase(WebDriver wd) {
    this.wd = wd;
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    if (text != null) {
      String existingTest = wd.findElement(locator).getAttribute("value");
      if (!text.equals(existingTest)) {
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
      }

    }

  }
  public static boolean isAlertPresent(WebDriver wd) {
    try {
     wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  protected boolean isElementPresent(By locator) {
    try {
      wd.findElement(locator);
      return true;
    } catch (NoSuchElementException ex) {
      return false;
    }
  }
}

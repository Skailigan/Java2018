package addressbook.appmanager;

import addressbook.dataobjects.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper {
  private FirefoxDriver wd;

  public ContactHelper(FirefoxDriver wd) {
    this.wd = wd;
  }

  public void submitContactCreation() {
      wd.findElement(By.name("submit")).click();
  }

  public void fillContactForm(ContactData contactData) {
      wd.findElement(By.name("firstname")).click();
      wd.findElement(By.name("firstname")).clear();
      wd.findElement(By.name("firstname")).sendKeys(contactData.getContactfirstName());
      wd.findElement(By.name("lastname")).click();
      wd.findElement(By.name("lastname")).clear();
      wd.findElement(By.name("lastname")).sendKeys(contactData.getContactLastName());
      wd.findElement(By.name("address")).click();
      wd.findElement(By.name("address")).clear();
      wd.findElement(By.name("address")).sendKeys(contactData.getContactMainAddress());
      wd.findElement(By.name("home")).click();
      wd.findElement(By.name("home")).clear();
      wd.findElement(By.name("home")).sendKeys(contactData.getContactHomePhoneNumber());
      wd.findElement(By.name("email")).click();
      wd.findElement(By.name("email")).clear();
      wd.findElement(By.name("email")).sendKeys(contactData.getContactEmail());
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[" + contactData.getBirthDayNumber() + "]")).isSelected()) {
          wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[" + contactData.getBirthDayNumber() + "]")).click();
      }
      if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[" + contactData.getBirthMonthNumber() + "]")).isSelected()) {
          wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[" + contactData.getBirthMonthNumber() + "]")).click();
      }
      wd.findElement(By.name("byear")).click();
      wd.findElement(By.name("byear")).clear();
      wd.findElement(By.name("byear")).sendKeys(contactData.getBirthYear());
  }

  public void initContactCreation() {
      wd.findElement(By.linkText("add new")).click();
  }
}

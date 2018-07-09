package addressbook.appmanager;

import addressbook.dataobjects.ContactData;
import addressbook.tests.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getContactfirstName());
    type(By.name("lastname"), contactData.getContactLastName());
    type(By.name("address"), contactData.getContactMainAddress());
    type(By.name("home"), contactData.getContactHomePhoneNumber());
    type(By.name("email"), contactData.getContactEmail());
    click(By.xpath("//div[@id='content']/form/select[1]//option[" + contactData.getBirthDayNumber() + "]"));
    click(By.xpath("//div[@id='content']/form/select[2]//option[" + contactData.getBirthMonthNumber() + "]"));
    type(By.name("byear"), contactData.getBirthYear());
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void closeDelAlert() {
    wd.switchTo().alert().accept();
  }

  public void deleteContact() {
    click(By.xpath("//input[@value='Delete']"));

  }
}

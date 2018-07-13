package addressbook.appmanager;

import addressbook.dataobjects.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitContactCreation() {
    wd.findElement(By.name("submit")).click();
  }

  public void fillContactForm(ContactData contactData, boolean creation) {
    type(By.name("firstname"), contactData.getContactfirstName());
    type(By.name("lastname"), contactData.getContactLastName());
    type(By.name("address"), contactData.getContactMainAddress());
    type(By.name("home"), contactData.getContactHomePhoneNumber());
    type(By.name("email"), contactData.getContactEmail());
    click(By.xpath("//div[@id='content']/form/select[1]//option[" + contactData.getBirthDayNumber() + "]"));
    click(By.xpath("//div[@id='content']/form/select[2]//option[" + contactData.getBirthMonthNumber() + "]"));
    type(By.name("byear"), contactData.getBirthYear());

    if (creation) {
      new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
    } else {
      Assert.assertFalse(isElementPresent(By.name("new_group")));

    }
  }

  public void initContactCreation() {
    click(By.linkText("add new"));
  }

  private By getTableRow(String rowNumber) {
    return By.cssSelector("#maintable > tbody > tr:nth-child(" + rowNumber + ")");
  }

  private By clickOnRowItem(String rowNumber, String rowColumn) {
    By contact = getTableRow(rowNumber);
    click(contact.cssSelector("td:nth-child(" + rowColumn + ")"));
    return contact;
  }

  public By initContactModification() {
    return clickOnRowItem("2", "8");
  }

  public By initContactModification(String rowNumber) {
    return clickOnRowItem(rowNumber, "8");
  }

  public By selectContact(String rowNumber) {
    return clickOnRowItem(rowNumber, "1");
  }

  public By selectContact() {
    return clickOnRowItem("2", "1");
  }

  public void closeDelAlert() {
    wd.switchTo().alert().accept();
  }

  public void deleteContact() {
    click(By.xpath("//input[@value='Delete']"));

  }

  public void updateContact() {
    click(By.name("update"));
  }


  public void createContact(ContactData contact) {
    initContactCreation();
    fillContactForm(contact, true);
    submitContactCreation();


  }

  public boolean isThereAContact() {
    // return isElementPresent(By.partialLinkText("edit.php?id="));
    return isElementPresent(By.cssSelector("a[href^=edit]"));
  }
}

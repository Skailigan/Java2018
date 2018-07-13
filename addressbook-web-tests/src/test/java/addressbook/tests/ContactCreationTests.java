package addressbook.tests;

import addressbook.dataobjects.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

  @Test
  public void testContactCreation() {
    app.getContactHelper().initContactCreation();
    app.getContactHelper().fillContactForm(new ContactData(
            "test1Firstname",
            "test2LastName",
            "test3Address",
            "test@email.com",
            "5677543",
            "10",
            "7",
            "1980",
            "testCroupName"),
            true);
    app.getContactHelper().submitContactCreation();
  }
}

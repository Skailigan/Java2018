package addressbook.tests;

import addressbook.dataobjects.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new ContactData(
                      "test1Firstname",
                      "test2LastName",
                      "test3Address",
                      "test@email.com",
                      "5677543",
                      "10",
                      "7",
                      "1980",
                      "[none]"));
    }
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData(
            "chagedFirstName",
            "changedLastName",
            "changedMainAddress",
            "0000",
            "changed@eail.test",
            "1",
            "1",
            "2001",
            null),
            false);
    app.getContactHelper().updateContact();

  }
}

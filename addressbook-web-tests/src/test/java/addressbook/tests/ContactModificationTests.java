package addressbook.tests;

import addressbook.dataobjects.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillContactForm(new ContactData(
            "chagedFirstName",
            "changedLastName",
            "changedMainAddress",
            "0000",
            "changed@eail.test",
            "1",
            "1",
            "2001"));
    app.getContactHelper().updateContact();

  }
}

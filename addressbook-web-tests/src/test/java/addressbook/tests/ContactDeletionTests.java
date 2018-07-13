package addressbook.tests;

import addressbook.dataobjects.ContactData;
import addressbook.dataobjects.GroupData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

  @Test
  public void testContactDeletion() {
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
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteContact();
    app.getContactHelper().closeDelAlert();
  }

}

package addressbook;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase{

    @Test
    public void testContactCreation() {
        app.initContactCreation();
        app.fillContactForm(new ContactData("test1Firstname", "test2LastName", "test3Address", "5677543", "test@email.com", "10", "7", "1980"));
        app.submitContactCreation();
    }


}

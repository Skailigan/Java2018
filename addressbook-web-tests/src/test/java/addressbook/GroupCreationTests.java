package addressbook;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test
    public void testGroupCreation() {

        app.gotoGroupPage();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("testCroupName", "test1GroupHeader", "test3GroupFooter"));
        app.submitGroupCreation();
        app.gotoGroupPage();
    }

}

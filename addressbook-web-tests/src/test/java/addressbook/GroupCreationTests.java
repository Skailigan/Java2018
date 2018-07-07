package addressbook;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test
    public void testGroupCreation() {

        gotoGroupPage();
        initGroupCreation();
        fillGroupForm(new GroupData("testCroupName", "test1GroupHeader", "test3GroupFooter"));
        submitGroupCreation();
        gotoGroupPage();
    }

}

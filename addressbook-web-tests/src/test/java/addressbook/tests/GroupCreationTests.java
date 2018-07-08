package addressbook.tests;
import addressbook.dataobjects.GroupData;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test
    public void testGroupCreation() {

        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData("testCroupName", "test1GroupHeader", "test3GroupFooter"));
        app.getGroupHelper().submitGroupCreation();
        app.getNavigationHelper().gotoGroupPage();
    }

}

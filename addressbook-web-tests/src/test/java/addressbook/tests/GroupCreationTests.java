package addressbook.tests;

import addressbook.dataobjects.GroupData;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("testCroupName", "test1GroupHeader", "test3GroupFooter"));
  }

  @Test
  public void testGroupCreationPartialNull() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("testCroupName", null, null));

  }

}

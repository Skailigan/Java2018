package addressbook.tests;

import addressbook.dataobjects.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    app.getGroupHelper().createGroup(new GroupData("testCroupName", "test1GroupHeader", "test3GroupFooter"));
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size() + 1);
  }

  @Test(enabled = false)
  public void testGroupCreationPartialNull() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("testCroupName", null, null));

  }

}

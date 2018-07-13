package addressbook.tests;

import addressbook.dataobjects.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    int before = app.getGroupHelper().getGroupCount();
    app.getGroupHelper().createGroup(new GroupData("testCroupName", "test1GroupHeader", "test3GroupFooter"));
    int after = app.getGroupHelper().getGroupCount();
    Assert.assertEquals(after,before + 1);
  }

  @Test(enabled = false)
  public void testGroupCreationPartialNull() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("testCroupName", null, null));

  }

}

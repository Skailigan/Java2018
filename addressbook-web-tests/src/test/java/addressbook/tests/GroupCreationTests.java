package addressbook.tests;

import addressbook.dataobjects.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashSet;
import java.util.List;


public class GroupCreationTests extends TestBase {

  @Test
  public void testGroupCreation() {
    app.getNavigationHelper().gotoGroupPage();
    List<GroupData> before = app.getGroupHelper().getGroupList();
    GroupData group = new GroupData("testCroupNameRND", "test1GroupHeader", "test3GroupFooter");
    app.getGroupHelper().createGroup(group);
    List<GroupData> after = app.getGroupHelper().getGroupList();
    Assert.assertEquals(after.size(),before.size() + 1);


    group.setId(after.stream().max((o1, o2) -> Integer.compare(o1.getId(),o2.getId())).get().getId());
    before.add(group);

    Assert.assertEquals(new HashSet<Object>(before),(new HashSet<Object>(after)));
  }

  @Test(enabled = false)
  public void testGroupCreationPartialNull() {

    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().createGroup(new GroupData("testCroupName", null, null));

  }

}

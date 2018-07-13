package addressbook.tests;

import addressbook.dataobjects.GroupData;
import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.getNavigationHelper().gotoGroupPage();
    if (!app.getGroupHelper().isThereAGroup()) {
    app.getGroupHelper().createGroup(new GroupData("test1",null,null));
    }
    app.selectGroup();
    app.deleteSelectedCroups();
    app.getNavigationHelper().gotoGroupPage();

  }

}

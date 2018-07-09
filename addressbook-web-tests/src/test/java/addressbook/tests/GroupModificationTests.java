package addressbook.tests;

import addressbook.dataobjects.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
  @Test
  public void testGroupModification (){
    app.getNavigationHelper().gotoGroupPage();
    app.getGroupHelper().selectGroup();
    app.getGroupHelper().initGroupModification();
    app.getGroupHelper().fillGroupForm(new GroupData("changedName","changedHeader", "changedFooter"));
    app.getGroupHelper().submitGroupModification();

  }

}

package addressbook;

import org.testng.annotations.Test;

public class GroupDeletionTests extends TestBase {

  @Test
  public void testGroupDeletion() {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedCroups();
    app.gotoGroupPage();

  }

}

package paper.bag;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

  @Test

  public void testDistance() {

    Point a = new Point();
    a.x = 12;
    a.y = 14;

    Point b = new Point();
    b.x = 12;
    b.y = 14;

    Assert.assertEquals((a.distance(b)), 0.0);
    Assert.assertEquals((b.distance(a)), 0.0);

  }
}

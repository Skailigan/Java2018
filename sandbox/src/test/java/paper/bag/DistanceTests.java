package paper.bag;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

  @Test
  private void testDistanceInputXY() {

    Point a = new Point(2, 7);
    Point a1 = new Point(5, 3);
    Assert.assertEquals((a.distance(a1)), 5.0);

    }

  @Test
  private void testDistanceInputZero(){
    Point b = new Point();
    Point b1 = new Point();
    Assert.assertEquals((b.distance(b1)),0.0);

  }
  @Test
  private void testDistanceInputX(){
    Point c = new Point(1);
    Point c1 = new Point(10);
    Assert.assertEquals((c.distance(c1)),12.727922061357855);
 

  }
}

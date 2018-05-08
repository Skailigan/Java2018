package paper.bag;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTests {

  @Test

  public void testDistance() {

    Point a = new Point(0, 10);


    Point b = new Point();


    Point c = new Point(10);


    Assert.assertEquals((a.distance(b)), 10.0);
    Assert.assertEquals((c.distance(a)), 10.0);
   


  }
}

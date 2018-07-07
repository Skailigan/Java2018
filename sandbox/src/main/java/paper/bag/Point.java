package paper.bag;

public class Point {
  public int x;
  public int y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  Point(int x) {
    this(x, x);
  }

  Point() {
    this(0, 0);
  }

  public double distance(Point p) {

    return (Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y)));
  }



  double testDistance(Point p) {
    return Sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
  }

  protected double Sqrt(int base){
    double temp;
    double squareRoot = base / 2;
    do {
      temp = squareRoot;
      squareRoot = (temp + (base / temp)) / 2;
    } while ((temp - squareRoot) != 0);
    return squareRoot;
  }

}
/*  1. Создать класс Point для представления точек на двумерной плоскости.
Объекты этого класса должны содержать два атрибута, которые соответствуют координатам точки на плоскости.
*/

package paper.bag;
public class Point {
  public int x;
  public int y;

  public double distance(Point p){
    return Math.sqrt((x - p.x) * (x - p.x) + (y - p.y) * (y - p.y));
  }
}
/*  1. Создать класс Point для представления точек на двумерной плоскости.
Объекты этого класса должны содержать два атрибута, которые соответствуют координатам точки на плоскости.
*/

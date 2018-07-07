package paper.bag;
import java.util.Scanner;

public class Distance {

  public static void main(String[] args) {

    Point p1 = new Point(1);
    Point p2 = new Point(12);
    Point p3 = new Point(3,11);
    Point p4 = new Point(11,3);
    Point p5 = new Point(99999,0);
    Point p6 = new Point(0,0);
    double distance = p1.distance(p2);
    System.out.println("Дистанция между точками А(" + p1.x + "," + p1.y + ") и точкой В(" + p2.x + "," + p2.y+") на плоскости равна "+(p1.distance(p2)));
    System.out.println("Дистанция между точками А1(" + p3.x + "," + p3.y + ") и точкой В1(" + p4.x + "," + p4.y+") на плоскости равна " + p3.distance(p4));
    System.out.println("Дистанция между точками А2(" + p5.x + "," + p5.y + ") и точкой В2(" + p6.x + "," + p6.y+") на плоскости равна " + p5.distance(p6));

  }
  
}

/*
3. Сделать запускаемый класс, то есть содержащий функцию
public static void main(String[] args) {...}
и при помощи него убедиться, что функция вычисления расстояния между точками действительно работает. Результат вычисления выводить на экран и контролировать визуально.

4. Реализовать то же самое (вычисление расстояния между двумя точками) при помощи метода в классе Point, и добавить в созданный в предыдущем пункте запускаемый класс примеры использования метода вместо ранее созданной функции.

2. Создать функцию
public static double distance(Point p1, Point p2)
которая вычисляет расстояние между двумя точками. Для вычисления квадратного корня можно использовать функцию Math.sqrt
*/

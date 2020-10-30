public class Tester {
  public static void main (String[] args) {
    Point a = new Point (0, 0);
    Point b = new Point (3, 4);
    Point c = new Point (0, 8);
    Point d = new Point (0, 0);
    Triangle w = new Triangle (a, b, c);
    Triangle x = new Triangle (0, 0, 3, 4, 0, 8);
    System.out.println("DISTANCE");
    System.out.println(a.distanceTo(b));
    System.out.println();
    System.out.println("POINT EQUALS");
    System.out.println(a.equals(b));
    System.out.println(a.equals(d));
    System.out.println();
    System.out.println("PERIMETERS");
    System.out.println(w.getPerimeter());
    System.out.println(x.getPerimeter());
    System.out.println();
    System.out.println("AREA");
    System.out.println(w.getArea());
    System.out.println(x.getArea());
    System.out.println();
    System.out.println("CLASSIFY (THEORETICALLY CONGRUENT TRIANGLE)");
    System.out.println(w.classify());
    System.out.println(x.classify());
    System.out.println();
    System.out.println("CLASSIFY (GENERAL TRIANGLES)");
    Point g = new Point (0, 0);
    Point h = new Point (3, 4);
    Point i = new Point (0, 6);
    Triangle y = new Triangle (0, 0, 2.5, 2.5 * Math.sqrt (3), 5, 0);
    Triangle z = new Triangle (g, h, i);
    System.out.println(y.classify());
    System.out.println(z.classify());
    System.out.println();
    System.out.println("STRINGIFY");
    System.out.println(w.toString());
    System.out.println();
    System.out.println("MUTATOR TEST");
    System.out.println("perimeter of triangle w = " + w.getPerimeter());
    w.setVertex(0, i);
    System.out.println("perimeter of triangle w = " + w.getPerimeter());
  }
}

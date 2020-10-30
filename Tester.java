public class Tester {
  public static void main (String[] args) {
    Point a = new Point (0, 0);
    Point b = new Point (3, 4);
    Point c = new Point (0, 0);
    System.out.println(a.distanceTo(b));
    System.out.println(a.equals(b));
    System.out.println(a.equals(c));
  }
}

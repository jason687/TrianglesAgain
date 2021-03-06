public class Point {
  private double x, y;

  public Point (double X, double Y) {
    x = X;
    y = Y;
  }

  public Point (Point p) {
    x = p.x;
    y = p.y;
  }

  public double getX(){
    return x;
  }

  public double getY(){
    return y;
  }

  public double distanceTo (Point other) {
    double a = other.getX();
    double b = other.getY();
    return Math.sqrt((x - a) * (x - a) + (y - b) * (y - b));
  }

  public boolean equals (Point other) {
    double a = other.getX();
    double b = other.getY();
    return ((a == x) && (b == y));
  }
}

class Rectangle {
  public static void main(String[] args) {
    double l, b, a, p, d;
    l = 5;
    b = 7;
    a = l * b;
    p = 2 * (l + b);
    d = Math.sqrt(Math.pow(l, 2) + Math.pow(b, 2));

    System.out.println("Area(sq cm): " + a);
    System.out.println("Perimeter(cm): " + p);
    System.out.println("Diagonal(cm): " + d);
  }
}
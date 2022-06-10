import java.util.Scanner;

class Rect
{
  public static void main(String[] args)
  {
    float l, b, a, p;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the length and breadth respectively: ");
    
    l = input.nextFloat();
    b = input.nextFloat(); 
    p = 2*(l+b);
    a = l*b;
    
    System.out.println("Length: " + l + " Breadth: " + b);
    System.out.println("Perimeter: " + p);
    System.out.println("Area(sq): " + a);
  }
}
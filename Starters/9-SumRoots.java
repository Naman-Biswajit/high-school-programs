import java.util.Scanner;

class SumRoots 
{
  public static void main(String[] args)
  {
    double n, s;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter the number: ");
    n = input.nextDouble();
    s = Math.sqrt(n) + Math.cbrt(n);

    System.out.println("sqrt("+n+") + cbrt("+n+"): "+s);
  }
}
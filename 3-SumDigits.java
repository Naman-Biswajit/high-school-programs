class SumThree
{
  public static void main(String[] args) 
  {
    int n, h, o, t, l, s;
    n = 123;
    l = n%100;
    o = l%10;
    t = l/10;
    h = n/100;
    s = o + t + h;

    System.out.println("Number: " + n);
    System.out.println("Sum: " + s);
  }
}
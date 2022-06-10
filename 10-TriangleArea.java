import java.util.Scanner;

class TriangleArea 
{
    public static void main(String[] args) 
    {
        double a, b, c, s, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the three sides:");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        s = (a+b+c)/2;

        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of triangle(sq): " + area);
    }
}
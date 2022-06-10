class Circle
{
    public static void main(String[] args)
    {
        float r, pi, a, c;
        pi = 22f/7;
        r = 7.5f;
        a = pi * r * r;
        c = 2 * pi * r;

        System.out.println("Area of circle(cm sq): " + a);
        System.out.println("Circumference of circle(cm): " + c);
    }
}
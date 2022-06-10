import java.util.Scanner;

class Quadrilateral
{
    public static void main(String[] args) {
        int sides;
        String name;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of sides:");
        sides = input.nextInt();
        name = "";

        switch (sides) {
            case 3: name = "Triangle";      break;
            case 4: name = "Quadrilateral"; break;
            case 5: name = "Pentagon";      break;
            case 6: name = "Hexagon";       break;
            case 7: name = "Heptagon";      break;
            case 8: name = "Octagon";       break;
            case 9: name = "Nonagon";       break;
            case 10: name = "Decagon";      break;
            default: System.out.println("Invalid, min-value: 3 & max-value: 10"); return;
        }

        System.out.println("Polygon with "+sides+" sides is a "+name);
    }
}
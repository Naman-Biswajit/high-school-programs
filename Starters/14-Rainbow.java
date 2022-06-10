import java.util.Scanner;

class RainbowColour
{
    public static void main(String[] args)
    {
        char ch;
        String clr;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter colour charater(Uppercase): ");
        ch = input.next().charAt(0);
        clr = "";

        switch (ch) {
            case 'V': clr = "Violet";   break;
            case 'I': clr = "Indigo";   break;
            case 'B': clr = "Blue";     break;
            case 'G': clr = "Green";    break;
            case 'Y': clr = "Yellow";   break;
            case 'O': clr = "Orange";   break;
            case 'R': clr = "Red";      break;
            default: System.out.println("Invalid colour"); return;
        }

        System.out.println(clr);
    }
}
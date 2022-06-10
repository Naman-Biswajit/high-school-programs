import java.util.Scanner;

class ProfitLoss
{
    public static void main(String args[])
    {
        float cp, sp, profitp;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter CP and SP respectively: ");
        cp = input.nextFloat();
        sp = input.nextFloat();
        profitp = ((sp - cp) * 100) / cp;
        
        if (profitp >= 0)
        {
            System.out.println("Profit: "+profitp+"%");
        }
        
        else
        {
            System.out.println("Loss: "+Math.abs(profitp)+"%");
        }
    }
}
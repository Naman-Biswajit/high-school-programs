import java.util.Scanner;

class Discount {
    public static void main(String[] args) {
        float price, discount, pay;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the purchse price of the product:");
        price = input.nextFloat();

        if (price <= 5000)
        {
            discount = 8f;
        }

        else 
        {
            discount = 10f;
        }
        
        pay = price - ((discount/100) * price);
        System.out.println(discount + "% Discount applied | Payable amount: " + pay + "/-");
    }
}
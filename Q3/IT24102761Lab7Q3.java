import java.util.Scanner;

public class IT24102761Lab7Q3
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);

        int x,y,total;
        double discount,amount;
        
        for(x=1 ; x<=5 ; x++)
        {
            System.out.println("Customer " + x);
            for(y=1 ; y<=1 ; y++)
            {
                System.out.print("Enter total bill amount: ");
                total=input.nextInt();

                System.out.print("Enter mode of payment(C for cash, O for Other): ");
                char mode=input.next().charAt(0);

                if(mode=='c' || mode=='C')
                {
                    discount=total*0.05;
                    System.out.println("Discount is: " + discount);
                    amount=total-discount;
                    System.out.println("Amount to be paid: " + amount);
                }
                else if(mode=='O' || mode=='o')
                {
                    System.out.println("No discount applicable");
                    System.out.println("Amount to be paid: " + total);
                }
                else
                {
                    System.out.println("Payment mode is Not Valid");
                }
            }
        }
    }
}
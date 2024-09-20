import java.util.Scanner;

public class IT24102761Lab7Q1
{
    public static void main(String[]arg)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter marks for four subjects: ");

        System.out.print("Enter Subject 1 Mark: ");
        int S1=input.nextInt();

        System.out.print("Enter Subject 2 Mark: ");
        int S2=input.nextInt();

        System.out.print("Enter Subject 3 Mark: ");
        int S3=input.nextInt();

        System.out.print("Enter Subject 4 Mark: ");
        int S4=input.nextInt();

        double avg=(S1 + S2 + S3 + S4)/4;

        System.out.println("Average is: " + avg);

        if(avg>=75)
        {
            System.out.println("Overall Grade is : Distinction");
        }
        else if(avg>=50)
        {
            System.out.println("Overall Grade is : Credit");
        }
        else
        {
            System.out.println("Overall Grade is : Fail");
        }
    }
}
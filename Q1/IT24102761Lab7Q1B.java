import java.util.Scanner;
public class IT24102761Lab7Q1B{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int x,y,s1,s2,s3,s4,sum=0;
        double average;
        for(x=1;x<=3;x++)
        {
            System.out.println("Student "+ x);
            for(y=1;y<=1;y++)
            {
                System.out.printf("Enter subject1 mark: ");
                s1=input.nextInt();

                System.out.printf("Enter subject2 mark: ");
                s2=input.nextInt();

                System.out.printf("Enter subject3 mark: ");
                s3=input.nextInt();

                System.out.printf("Enter subject4 mark: ");
                s4=input.nextInt();

                System.out.println("You enterd marks are: " + s1 +" " + s2 +" " + s3 +" "+ s4);

                sum=s1+s2+s3+s4;
                average=sum/4.0;


                if(average>75)
                {
                    System.out.println("Grade is : Distinction");
                }
                else if(average>50)
                {
                    System.out.println("Grade is : Credit");
                }
                else
                {
                    System.out.println("Grade is : Fail");
                }

            }
        }    
    }
}
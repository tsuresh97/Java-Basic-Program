import java.util.Scanner;
class OddOrEven
{
   public static void main(String args[])
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Number: ");
       int n=input.nextInt();
       if(n%2==0)
       {
            System.out.print("Its Even Number");
       }
    //    Note: 0 is even number
       else
       {
            System.out.print("Its Odd Number");
       }

    }
}


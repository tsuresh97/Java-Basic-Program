import java.util.Scanner;
class GetDataFromUser
{
   public static void main(String args[])
   {
       Scanner input = new Scanner(System.in);
       System.out.print("Enter Number: ");
       int n=input.nextInt();
       System.out.println("Entered data is: "+n);

       System.out.print("Enter String: ");
       String s=input.next();
       System.out.println("Entered data is: "+s);

       System.out.print("Enter Char: ");
       char c=input.next().charAt(0);
       System.out.println("Entered data is: "+c);

       System.out.print("Enter Float: ");
       Float f=input.nextFloat();
       System.out.println("Entered data is: "+f);
    //    Note: Double never round off the value but float can
       System.out.print("Enter Double: ");
       Double d=input.nextDouble();
       System.out.println("Entered data is: "+d);

    }
}




1
2
3
4
Bus
6
7
8
9
Bus

// 1. For=== if 
// 2. 6, 
// 6*10=6

// --
// 6*20=120
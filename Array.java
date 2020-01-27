import java.util.Scanner;
class Array
{
   public static void main(String args[])
   {
       Scanner input = new Scanner(System.in);
        int a[]=new int[5];
        int i;
        // Note: If you want to increase the array size, change the condition too in two loops
       for(i=0;i<5;i++)
       {
            System.out.print("Enter Data:");
            a[i]=input.nextInt();
       }
       System.out.println("Output");
       for(i=0;i<5;i++)
       {
        System.out.println("Data are :"+a[i]);
       }
    }
}
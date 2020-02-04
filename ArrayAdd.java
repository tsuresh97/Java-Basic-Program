
class ArrayAdd
{
   public static void main(String args[])
   {
       
        int a[]=new int[5];
        int i;
        int sum=0;
        // Note: If you want to increase the array size, change the condition too in two loops
       for(i=0;i<5;i++)
       {
            System.out.print("Enter Data:");
            a[i]=input.nextInt();
            sum=sum+a[i];
       }
       System.out.println("Sum"+sum);
    }
}
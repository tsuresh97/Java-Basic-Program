import java.util.Scanner;
class FindCount
{
    public static void main(String args[]) {
        Scanner data=new Scanner(System.in);
        String phoneNumber;
        phoneNumber=data.next();
        char number[]=new char[10]; 
        for(int i=0;i<10;i++)
        {
            number[i]=phoneNumber.charAt(i);
        }
        for(int i=0;i<10;i++)
        {
            System.out.println(number[i]);
        }   
    }
}
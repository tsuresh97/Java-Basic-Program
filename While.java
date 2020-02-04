import java.util.*;
public class While {  
    public static void main(String[] args) {  
       int data;
        do{  
             int a=10,b=7;
             System.out.println(a+b);
            Scanner input=new Scanner(System.in);
            System.out.println("Press 1 to continue: ");
             data=input.nextInt();
        }while(data==1);  
    //     do{  
    //         int a=10,b=7;
    //         System.out.println(a+b);
    //        Scanner input=new Scanner(System.in);
    //        System.out.println("Press 1 to continue: ");
    //         data=input.nextInt();
    //    }while(data==1); 
    }
    }  
import java.util.Scanner;
import java.util.Random;
class Handcricket
{
public static void main(String args[])
{
String choice;
Random randomGenerator = new Random();
int user;
int randomInt;
int randomInt2=0;
int sum;
int i=0;
int total=0;
int total1=0;

String data="odd";
System.out.println("RULE:");
System.out.println("Choose the number between 1 to 6");
System.out.println("Choose Odd (or) Even");
Scanner input=new Scanner(System.in);
choice=input.next();
System.out.println("O.K. Enter Any Number(1-6): ");
user=input.nextInt();
choice=choice.toLowerCase();
randomInt = randomGenerator.nextInt(6) + 1;
System.out.println("System Choice is : " + randomInt);
sum=user+randomInt;
if(sum%2==0)
{
data="even";
}
if(choice.equals(data)) 
{

System.out.println("Nice. You Won Toss Choose to Bat or Bowl: ");
choice=input.next();
choice=choice.toLowerCase();
if(choice.equals("bat")) // User won toss bating
{
for(i=0;randomInt2!=user;i++)
{
    System.out.println("Your Action: ");
    user=input.nextInt();
    randomInt2 = randomGenerator.nextInt(6) + 1;
    System.out.println("Computer Choice is"+randomInt2);
    if(randomInt2!=user)
    {
        total=total+user;
    }

}
System.out.println("Ohhh No.... Your wicket gone with "+total+" runs");
System.out.println("Now computer going to bat");

for(i=0;total>=total1;i++)
{
    System.out.println("Your Action: ");
    user=input.nextInt();
    randomInt2 = randomGenerator.nextInt(6) + 1;
    System.out.println("Computer Choice is"+randomInt2);
    if(randomInt2!=user)
    {
        total1=total1+user;
    }

}
if(total1==total)
{
System.out.println("Match Tied!!!!!");
}
else if(total1<total)
{
System.out.println("User won!!!!!");
}
else if(total1>total)
{
System.out.println("Machine won!!!!!");
}
}
else // User won toss bowling
{
for(i=0;randomInt2!=user;i++)
{
    System.out.println("Your Action: ");
    user=input.nextInt();
    randomInt2 = randomGenerator.nextInt(6) + 1;
    System.out.println("Computer Choice is"+randomInt2);
    if(randomInt2!=user)
    {
        total1=total1+user;
    }

}
System.out.println("Super Machine wicket gone with "+total1+" runs");
System.out.println("Now you are going to bat");

for(i=0;total1>=total;i++)
{
    System.out.println("Your Action: ");
    user=input.nextInt();
    randomInt2 = randomGenerator.nextInt(6) + 1;
    System.out.println("Computer Choice is"+randomInt2);
    if(randomInt2!=user)
    {
        total=total+user;
    }

}
if(total1==total)
{
System.out.println("Match Tied!!!!!");
}
else if(total1<total)
{
System.out.println("User won!!!!!");
}
else if(total1>total)
{
System.out.println("Machine won!!!!!");
}
    
}
}
else //System won toss
{
System.out.println("System Won Toss!!!!!!!!");

int randomInt1 = randomGenerator.nextInt(2) + 1;

if(randomInt1==1)//System won toss batting human:bowling
{
System.out.println("Choose to Bat First...............");
for(i=0;randomInt2!=user;i++)
{
    System.out.println("Your Action: ");
    user=input.nextInt();
    randomInt2 = randomGenerator.nextInt(6) + 1;
    System.out.println("Computer Choice is"+randomInt2);
    if(randomInt2!=user)
    {
        total1=total1+user;
    }

}
System.out.println("Super Machine wicket gone with "+total1+" runs");
System.out.println("Now you are going to bat");

for(i=0;total1>=total;i++)
{
    System.out.println("Your Action: ");
    user=input.nextInt();
    randomInt2 = randomGenerator.nextInt(6) + 1;
    System.out.println("Computer Choice is"+randomInt2);
    if(randomInt2!=user)
    {
        total=total+user;
    }

}
if(total1==total)
{
System.out.println("Match Tied!!!!!");
}
else if(total1<total)
{
System.out.println("User won!!!!!");
}
else if(total1>total)
{
System.out.println("Machine won!!!!!");
}

}
else //System won toss bowling human:batting
{
System.out.println("Choose to Bowl First...............");
for(i=0;randomInt2!=user;i++)
{
    System.out.println("Your Action: ");
    user=input.nextInt();
    randomInt2 = randomGenerator.nextInt(6) + 1;
    System.out.println("Computer Choice is"+randomInt2);
    if(randomInt2!=user)
    {
        total=total+user;
    }

}
System.out.println("Ohhh No.... Your wicket gone with "+total+" runs");
System.out.println("Now computer going to bat");

for(i=0;total>=total1;i++)
{
    System.out.println("Your Action: ");
    user=input.nextInt();
    randomInt2 = randomGenerator.nextInt(6) + 1;
    System.out.println("Computer Choice is"+randomInt2);
    if(randomInt2!=user)
    {
        total1=total1+user;
    }

}
if(total1==total)
{
System.out.println("Match Tied!!!!!");
}
else if(total1<total)
{
System.out.println("User won!!!!!");
}
else if(total1>total)
{
System.out.println("Machine won!!!!!");
}

}
}
}
}

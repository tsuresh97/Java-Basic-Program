import java.util.Random;
class StonePaperSci
{
public static void main(String args[])
{

        Random randomGenerator = new Random();

        int randomInt = randomGenerator.nextInt(7) ;

        System.out.println("System Choice is : " + randomInt);

}
}
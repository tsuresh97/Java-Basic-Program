import java.time.LocalDateTime;
public class CurrentDateTime {
    public static void main(String[] args) {
        for(int i=0;i<20;i++)
        {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current Date and Time is: " + current);
        }
    }
}
    public class LeapYear 
    {
        public static void main(String[] args)
         {
            int year = 2020;
            boolean leap = false;
            if(year % 4 == 0)
                leap = true;
             if(leap)
                System.out.println(year + " is a leap year.");
            else
                System.out.println(year + " is not a leap year.");
        }
    }
    public class NumberDigits {
        public static void main(String[] args) {
            int count = 0, num = 3455;
            while(num != 0)
            {
                 num = num/10; //==>34
               // num /= 10;
                ++count;           
            }
            System.out.println("Number of digits: " + count);
            String a="CSE";
            int length=a.length();
            System.out.println("String length " + length);
        }
    }
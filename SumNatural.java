    public class SumNatural {
        public static void main(String[] args) {
            int num = 5, sum = 0;
            for(int i = 1; i <= num; ++i)
            {
                sum = sum + i; // 15
               // sum += i; // 
            }
            System.out.println("Sum = " + sum);
        }
    }
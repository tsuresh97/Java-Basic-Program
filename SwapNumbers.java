    public class SwapNumbers {
        public static void main(String[] args) {
            int first = 2, second = 5;
            System.out.println("--Before swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
            first = first - second; //12-24===> -12
            System.out.println("First1-1 number = " + first);
            second = first + second; //-12+24===> 12
            System.out.println("Second22 number = " + second);
            first = second - first; // 12+12==> 24
            System.out.println("First33 number = " + first);
            System.out.println("--After swap--");
            System.out.println("First number = " + first);
            System.out.println("Second number = " + second);
        }
    }
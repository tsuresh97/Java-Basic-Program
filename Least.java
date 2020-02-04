    public class Least {
        public static void main(String[] args) {
            int[] numArray = { 5,9,5,6,1,10,18,6 };
            int least = numArray[0]; //5
            for (int num: numArray) 
            {
                if(least > num) //1>10
                 least = num;//1
            }
            System.out.format("Largest element = %d in that array", least);
         }
    }
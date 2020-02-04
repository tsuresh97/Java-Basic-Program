    public class Largest {
        public static void main(String[] args) {
          //  int[] numArray=new int[10];
            int[] numArray = { 5,9,5,6,10,18,6 };
            int largest = numArray[0]; //5
            for (int num: numArray)
             {
                if(largest < num)//18<6
                {
                    largest = num; //18
                }
            }
            // printf("%d seds",largest);
            System.out.println("Largest element = "+largest+ " in that array");
            System.out.format("Largest element = %d in that array", largest);
         }
    }
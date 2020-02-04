    class Method
     {
       public static void main(String[] args)
        {
            int i=10;
           System.out.println("About to encounter a method."+i);
           // method call
           myMethod();
           
           System.out.println("Method was executed successfully!");
       }
       // method definition
       private static void myMethod(){
           System.out.println("Printing from inside myMethod()!");
       }
    }
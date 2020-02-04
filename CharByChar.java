public class CharByChar {

    public static void main(String[] args) {
        String str = "JavaClass";
        for(int i = 0; i < str.length(); i++) 
        {
             char ch = str.charAt(i);
             System.out.println(ch);
        }
        System.out.println("Reverse");
        for(int i = str.length()-1; i>=0; i--) 
        {
             char ch = str.charAt(i);
             System.out.println(ch);
        }
    }
}
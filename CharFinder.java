public class CharFinder {

    public static void main(String[] args) {
        String str = "Java Class1#";
        int vcount = 0, ccount = 0,others=0;

        //converting all the chars to lowercase
        str = str.toLowerCase();
        String a="";
        for(int i = 0; i < str.length(); i++) 
        {
             char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' ||
                     ch == 'o' || ch == 'u') 
            {
              vcount++; 
              a.concat(""+ch);

            }
             else if((ch >= 'a'&& ch <= 'z')) 
             {
                ccount++;

            }
            else
            {
                others++;
            }
        }
        System.out.println("Number of str: " + str);
        System.out.println("Number of Vowels: " + vcount);
        System.out.println("Number of Consonants: " + ccount);
        System.out.println("Number of others: " + others);
        System.out.println("Vowels: " + a);

    }
}
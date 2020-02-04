    public class SpaceCounter {
        public static void main(String[] args) {
            String sentence="Hello This is Suresh";
            char[] ch = new char[sentence.length()];
            int word=0; 
            for(int i=0;i<ch.length;i++)
            {
                if(ch[i]=='/s')
                    word++;
            }
            System.out.format("%d words in that sentence", word);
         }
    }
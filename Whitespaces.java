public class Whitespaces {
    public static void main(String[] args) {
        String sentence = "Ja    va    P       ro       g ra   m ";
        System.out.println("Original sentence: " + sentence);
        sentence = sentence.replaceAll("Z", "K");
        System.out.println("After replacement: " + sentence);
    }
}
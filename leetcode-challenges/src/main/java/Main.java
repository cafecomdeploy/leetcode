import com.challenges.Strings.MergeStrings;

public class Main {
    public static void main(String[] args) {

        MergeStrings mergeStrings = new MergeStrings();
        /* CASE 01 */
        String word1 = "abcd";
        String word2 = "pqa";

        System.out.println("Resultado = " + mergeStrings.mergeAlternately(word1, word2));

    }
}
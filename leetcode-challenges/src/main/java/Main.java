import com.challenges.Strings.CommonDivisor;
import com.challenges.Strings.MergeStrings;

public class Main {
    public static void main(String[] args) {

        CommonDivisor mergeStrings = new CommonDivisor();
        /* CASE 01 */
        String word1 = "ABCABC";
        String word2 = "ABC";

        System.out.println("Resultado = " + mergeStrings.gcdOfStrings(word1, word2));

    }
}
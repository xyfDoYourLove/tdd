import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Mommifier {

    public static Map<Character, Character> vowels = new HashMap<>();

    static {
        vowels.put('a', 'a');
        vowels.put('e', 'e');
        vowels.put('i', 'i');
        vowels.put('o', 'o');
        vowels.put('u', 'u');
    }

    public String dealWithVowels(String args) {
        char[] chars = args.toCharArray();
        double vowelCount = 0.0;
        int continuousVowel = 0;

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < chars.length; i++) {

            if (vowels.get(chars[i]) != null) {
                vowelCount++;
                continuousVowel++;
                if (i == chars.length-1 && continuousVowel > 1) {
                    result.append(chars[i]);
                    result.append("mommy");
                    break;
                }
            }else {
                if (continuousVowel > 1) {
                    result.append("mommy");
                }
                continuousVowel = 0;
            }

            result.append(chars[i]);
        }

        if (vowelCount/(double)chars.length > 0.3) {
            return result.toString();
        }

        return args;
    }


}

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
        StringBuffer result = new StringBuffer();
        double vowelCount = 0.0;
        int lastVowel = 0;

        for (int i = 0; i < chars.length; i++) {
            if (vowels.get(chars[i]) != null) {
                vowelCount++;
                lastVowel++;
                if (i == chars.length-1 && lastVowel > 1) {
                    result.append(chars[i]);
                    result.append("mommy");
                    break;
                }
            }else {
                result = insertStringAfterVowels(result, lastVowel);
                lastVowel = 0;
            }
            result.append(chars[i]);
        }

        if (vowelCount/(double)chars.length > 0.3) {
            return result.toString();
        }
        return args;
    }

    public StringBuffer insertStringAfterVowels(StringBuffer result, int lastVowel) {
        if (lastVowel > 1) {
            result.append("mommy");
        }
        return result;
    }


}

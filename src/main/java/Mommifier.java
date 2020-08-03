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
        String[] argChars = args.split("");

        double vowelCount = Arrays.stream(argChars)
                .filter(singleChar -> {
                    if (vowels.get(singleChar.charAt(0)) != null) {
                        return true;
                    }
                    return false;
                })
                .count();

        if (vowelCount/(double)argChars.length > 0.3) {
            return null;
        }

        return args;
    }


}

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MommifierTest {

    @Test
    public void should_return_string_when_convert_given_string_number_of_vowels_not_more_then_30() {
        Mommifier mommifier = new Mommifier();
        String result = mommifier.dealWithVowels("with");

        assertEquals("with", result);
    }
}

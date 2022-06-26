package fc.introduction.textFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToUpperCaseTest {

    @Test
    void shouldPrintTextUpperCase() {
        //given
        String text = "Java is cool language.";

        //when
        ToUpperCase toUpperCase = new ToUpperCase();
        String result = toUpperCase.formatText(text);

        //then
        Assertions.assertEquals("JAVA IS COOL LANGUAGE.", result);
    }

    @Test
    void shouldPrintTextWithNoChange() {
        //given
        String text = "JAVA IS COOL LANGUAGE.";

        //when
        ToUpperCase toUpperCase = new ToUpperCase();
        String result = toUpperCase.formatText(text);

        //then
        Assertions.assertEquals("JAVA IS COOL LANGUAGE.", result);
    }
}
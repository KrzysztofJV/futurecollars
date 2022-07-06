package fc.introduction.textFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UpperCaseFormatterTest {

    @Test
    void shouldPrintTextUpperCase() {
        //given
        String text = "Java is cool language.";

        //when
        UpperCaseFormatter toUpperCase = new UpperCaseFormatter();
        String result = toUpperCase.formatText(text);

        //then
        Assertions.assertEquals("JAVA IS COOL LANGUAGE.", result);
    }

    @Test
    void shouldPrintTextWithNoChange() {
        //given
        String text = "JAVA IS COOL LANGUAGE.";

        //when
        UpperCaseFormatter toUpperCase = new UpperCaseFormatter();
        String result = toUpperCase.formatText(text);

        //then
        Assertions.assertEquals("JAVA IS COOL LANGUAGE.", result);
    }
}
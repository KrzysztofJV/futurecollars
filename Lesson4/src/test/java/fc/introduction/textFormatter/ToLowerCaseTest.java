package fc.introduction.textFormatter;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ToLowerCaseTest {

    @Test
    void shouldPrintTextLowerCase() {
        //given
        String text = "Java is cool language.";

        //when
        ToLowerCase toLowerCase = new ToLowerCase();
        String result = toLowerCase.formatText(text);

        //then
        Assertions.assertEquals("java is cool language.", result);
    }

    @Test
    void shouldPrintTextWithNoChange() {
        //given
        String text = "java is cool language.";

        //when
        ToLowerCase toLowerCase = new ToLowerCase();
        String result = toLowerCase.formatText(text);

        //then
        Assertions.assertEquals("java is cool language.", result);
    }
}
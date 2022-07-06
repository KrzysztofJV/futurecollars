package fc.introduction.textFormatter;

import java.util.Locale;

public class UpperCaseFormatter implements TextFormatter{

    public UpperCaseFormatter() {
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase(Locale.ROOT);
    }
}

package fc.introduction.textFormatter;

import java.util.Locale;

public class LowerCaseFormatter implements TextFormatter{

    public LowerCaseFormatter() {
    }

    @Override
    public String formatText(String text) {
        return text.toLowerCase(Locale.ROOT);
    }
}

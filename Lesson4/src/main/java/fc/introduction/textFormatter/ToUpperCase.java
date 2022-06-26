package fc.introduction.textFormatter;

import java.util.Locale;

public class ToUpperCase implements TextFormatter{

    public ToUpperCase() {
    }

    @Override
    public String formatText(String text) {
        return text.toUpperCase(Locale.ROOT);
    }
}

package fc.introduction.textFormatter;

import java.util.Locale;

public class ToLowerCase implements TextFormatter{

    public ToLowerCase() {
    }

    @Override
    public String formatText(String text) {
        return text.toLowerCase(Locale.ROOT);
    }
}

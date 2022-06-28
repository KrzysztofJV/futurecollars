package fc.introduction.text;

public class Text {

    public Text() {
    }

    public boolean isTextContainsAnyChars(String textToCheck){
        return textToCheck != null && !textToCheck.isEmpty();
    }

    public int getTextLength(String textToCheck){
        if (isTextContainsAnyChars(textToCheck)){
            return textToCheck.length();
        } else {
            return 0;
        }
    }

    public String isTextPalindrom(String textToCheck) {
        if (isTextContainsAnyChars(textToCheck)) {
            StringBuilder rev = new StringBuilder();

            int length = textToCheck.length();

            for (int i = length - 1; i >= 0; i--)
                rev.append(textToCheck.charAt(i));

            if (textToCheck.equals(rev.toString()))
                return textToCheck + " is a palindrome";
            else
                return textToCheck + " is not a palindrome";
        } else {
            return "Error. String does not contain any sign";
        }
    }
}

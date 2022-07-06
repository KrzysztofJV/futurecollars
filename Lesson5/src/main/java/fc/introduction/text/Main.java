package fc.introduction.text;

public class Main {

    public static void main(String[] args) {
        Text text1 = new Text();
        System.out.println(text1.isTextContainsAnyChars("apple"));
        System.out.println(text1.getTextLength("apple"));
        System.out.println(text1.isTextPalindrom("radar"));
    }
}

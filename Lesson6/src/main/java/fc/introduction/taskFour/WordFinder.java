package fc.introduction.taskFour;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordFinder {

    private static final String PATH_TO_RESOURCES = "Lesson6/src/main/resources/";

    public static void searchForTheGivenWordInTheText(String nameOfFile, String wordToCheck) {
        try {
            String result = Files.readString(Paths.get(PATH_TO_RESOURCES + nameOfFile));
            if (result.contains(wordToCheck)){
                System.out.println("This word appears in the text");
            } else {
                System.out.println("This word doesn't appears in the text");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

package fc.introduction.taskFour;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordFinder {

    private static final String pathToResources = "Lesson6/src/main/resources/";

    public static void countTheNumberOfCharactersInTheFile(String nameOfFile, String wordToCheck) {
        try {
            String result = Files.readString(Paths.get(pathToResources + nameOfFile));
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

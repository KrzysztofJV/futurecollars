package fc.introduction.taskFive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InvertedText {

    public void printInvertedEnteredTextIntoTheFile(String pathToFile, String textToWrite) {
        try {
            Files.writeString(Paths.get(pathToFile), textToWrite);
            StringBuilder stringBuilder = new StringBuilder(textToWrite);
            String result = stringBuilder.reverse().toString();
            System.out.println(result);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

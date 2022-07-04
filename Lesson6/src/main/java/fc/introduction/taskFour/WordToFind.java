package fc.introduction.taskFour;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WordToFind {

    public void searchingForTheEnteredWordInTheText(String pathToFile, String textToWrite, String wordToCheck) {
        try {
            Files.writeString(Paths.get(pathToFile), textToWrite);
            System.out.println(textToWrite);
            System.out.println();
            if (textToWrite.contains(wordToCheck)){
                System.out.println("This word appears in the text");
            } else {
                System.out.println("This word doesn't appears in the text");
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

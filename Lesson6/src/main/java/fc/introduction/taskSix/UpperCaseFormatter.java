package fc.introduction.taskSix;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;

public class UpperCaseFormatter {

    private static final String pathToResources = "Lesson6/src/main/resources/";

    public static void convertTextToUpperCaseFromTheFile(String nameOfFileConverted, String nameOfFileAfterConverted) {
        try {
            String textFromTheFile = Files.readString(Paths.get(pathToResources + nameOfFileConverted));
            Files.writeString(Paths.get(pathToResources + nameOfFileAfterConverted), textFromTheFile.toUpperCase(Locale.ROOT));
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}

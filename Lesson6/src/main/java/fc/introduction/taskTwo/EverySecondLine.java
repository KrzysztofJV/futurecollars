package fc.introduction.taskTwo;

import java.io.*;

public class EverySecondLine {

    private static final String pathToResources = "Lesson6/src/main/resources/";

    public static void printTheEverySecondLineInTheFile(String nameOfFile) throws IOException {

        int lineNumber = 0;
        String line;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToResources + nameOfFile));
        while ((line = bufferedReader.readLine()) != null) {
            if (lineNumber % 2 == 0) {
                System.out.println(line);
            }
            lineNumber++;
        }
    }
}

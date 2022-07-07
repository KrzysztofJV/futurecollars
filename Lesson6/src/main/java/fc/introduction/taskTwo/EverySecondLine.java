package fc.introduction.taskTwo;

import java.io.*;

public class EverySecondLine {

    private static final String pathToResources = "Lesson6/src/main/resources/";

    public static void printTheEverySecondLineInTheFile(String nameOfFile) {
        int lineNumber = 0;
        String line = null;

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathToResources + nameOfFile));
            while (true) {
                try {
                    if ((line = bufferedReader.readLine()) == null) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (lineNumber % 2 == 0) {
                    System.out.println(line);
                }
                lineNumber++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

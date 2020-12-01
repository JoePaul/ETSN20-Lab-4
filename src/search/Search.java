package search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Search {
    public static void findPatternInFile(String pattern, String path) {
        try (Scanner sc = new Scanner(new File(path)) ) {
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line.contains(pattern)) {
                    System.out.println(line);
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}

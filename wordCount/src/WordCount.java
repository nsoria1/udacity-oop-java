/*
 * This java program will take a text file as an input and will retrieve the number of words that were found.
 */

import java.io.File;
import java.util.Scanner;

public class WordCount {
    public static void main (String [] args) throws Exception {
        File file = new File ("ebook.txt");
        Scanner scanner = new Scanner(file);
        int words = 0;

        while(scanner.hasNextLine()) {
            String line = scanner.nextLine();
            words += line.split(" ").length;
        }

        System.out.println("The book has: " + words + " words.");
    }
}

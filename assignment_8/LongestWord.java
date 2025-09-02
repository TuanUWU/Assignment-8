
package assignment_8;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a sentence: ");
            String sentence = scanner.nextLine();
            
            String[] words = sentence.trim().split("\\s+");
            String longestWord = "";
            
            for (String word : words) {
                String cleanWord = word.replaceAll("[^a-zA-Z]", "");
                if (cleanWord.length() > longestWord.length()) {
                    longestWord = cleanWord;
                }
            }
            
            System.out.println("Longest word: " + longestWord);
        }
    }
}

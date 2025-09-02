
package assignment_8;

import java.util.Scanner;

public class AcronymGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine();

        String[] words = phrase.trim().split("\\s+");
        StringBuilder acronym = new StringBuilder();

        for (String word : words) {
            if (word.length() > 0) {
                acronym.append(Character.toUpperCase(word.charAt(0)));
            }
        }

        System.out.println("Acronym: " + acronym.toString());

    }
}


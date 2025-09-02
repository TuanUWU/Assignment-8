/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment_8;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String trimmedInput = input.trim();
        int wordCount;

        if (trimmedInput.isEmpty()) {
            wordCount = 0;
        } else {
            String[] words = trimmedInput.split("\\s+");
            wordCount = words.length;
        }

        System.out.println("Number of words in the string: " + wordCount);

    }
}

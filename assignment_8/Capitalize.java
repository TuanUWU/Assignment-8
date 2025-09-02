
package assignment_8;

import java.util.Scanner;

public class Capitalize {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine();
            
            String[] words = fullName.trim().split("\\s+");
            StringBuilder capitalizedName = new StringBuilder();
            
            for (String word : words) {
                if (word.length() > 0) {
                    String capitalizedWord = word.substring(0, 1).toUpperCase() +
                            word.substring(1).toLowerCase();
                    capitalizedName.append(capitalizedWord).append(" ");
                }
            }
            
            System.out.println("Normalized name: " + capitalizedName.toString().trim());
        }
    }
}

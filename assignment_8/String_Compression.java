
package assignment_8;
import java.util.Scanner;

public class String_Compression {
    public static void main(String[] args) {
        try (Scanner keyboard = new Scanner(System.in)) {
            System.out.print("Enter a string to compress: ");
            String input = keyboard.nextLine();
            
            if (input == null || input.isEmpty()) {
                System.out.println("Empty string.");
                keyboard.close();
                return;
            }
            
            StringBuilder compressed = new StringBuilder();
            int count = 1;
            
            for (int i = 0; i < input.length(); i++) {
                if (i == input.length() - 1 || input.charAt(i) != input.charAt(i + 1)) {
                    compressed.append(input.charAt(i));
                    compressed.append(count);
                    count = 1;
                } else {
                    count++;
                }
            }
            
            System.out.println("Compressed string: " + compressed.toString());
        }
    }
}

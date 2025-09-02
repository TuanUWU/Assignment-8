
package assignment_8;

import java.util.Scanner;

public class FormatNumberString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number string: ");
        String numberStr = scanner.nextLine();

        StringBuilder sb = new StringBuilder(numberStr);

        for (int i = sb.length() - 3; i > 0; i -= 3) {
            sb.insert(i, ',');
        }

        System.out.println("Formatted number: " + sb.toString());

    }
}


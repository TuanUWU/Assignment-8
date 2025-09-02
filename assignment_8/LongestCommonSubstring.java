
package assignment_8;

import java.util.Scanner;

public class LongestCommonSubstring {
    public static String findLCS(String str1, String str2) {
        String longestCommon = "";

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j <= str1.length(); j++) {
                String substring = str1.substring(i, j);
                if (str2.contains(substring) && substring.length() > longestCommon.length()) {
                    longestCommon = substring;
                }
            }
        }

        return longestCommon;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String s1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scanner.nextLine();

        String lcs = findLCS(s1, s2);
        System.out.println("Longest common substring: " + lcs);

    }
}

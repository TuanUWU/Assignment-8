
package assignment_8;

import java.util.*;


public class Check_for_Anagrams {
    public static boolean areAnagrams(String str1, String str2) {
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first string: ");
            String s1 = scanner.nextLine();
            
            System.out.print("Enter the second string: ");
            String s2 = scanner.nextLine();
            
            if (areAnagrams(s1, s2)) {
                System.out.println("The two strings are Anagrams.");
            } else {
                System.out.println("The two strings are not Anagrams.");
            }
        }
    }
}




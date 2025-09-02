
package assignment_8;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner(System.in);
System.out.println("Enter a sentence : ");
String sentence = scanner.nextLine();

String[] words = sentence.trim().split("\\s+");
StringBuilder reversedSentence = new StringBuilder();

for (int i = words.length - 1; i >= 0; i--) {
    reversedSentence.append(words[i]);
    if (i > 0) {
        reversedSentence.append(" ");
    }
}
    
System.out.println("After reverse: " + reversedSentence.toString());
    }
    
}

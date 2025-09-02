
package assignment_8;
import java.util.Scanner;

public class UrlParser {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a URL: ");
            String url = scanner.nextLine();
            
            String protocol = "";
            String domain = "";
            String path = "";
            
            int protocolEndIndex = url.indexOf("://");
            if (protocolEndIndex != -1) {
                protocol = url.substring(0, protocolEndIndex);
                int domainStartIndex = protocolEndIndex + 3;
                int pathStartIndex = url.indexOf("/", domainStartIndex);
                
                if (pathStartIndex != -1) {
                    domain = url.substring(domainStartIndex, pathStartIndex);
                    path = url.substring(pathStartIndex);
                } else {
                    domain = url.substring(domainStartIndex);
                    path = "/";
                }
            }
            
            System.out.println("Protocol: " + protocol);
            System.out.println("Domain: " + domain);
            System.out.println("Path: " + path);
        }
    }
}

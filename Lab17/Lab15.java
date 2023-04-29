import java.util.Scanner;

public class Lab15 {
    public static String encodeString(String s) {
        int count = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                
                result.append(s.charAt(i - 1));
                result.append(count);
                count = 1;
            }
        }
        
        result.append(s.charAt(s.length() - 1));
        result.append(count);
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(encodeString(str));
    }
}

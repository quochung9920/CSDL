import java.util.Scanner;
import java.util.Stack;

public class Lab13 {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            stack.push(c);
        }
        String s2 = "";
        for (int i = 0; i < s1.length(); i++) {
            s2 = s2 + stack.pop();
        }
        System.out.println(s2);
    }
}

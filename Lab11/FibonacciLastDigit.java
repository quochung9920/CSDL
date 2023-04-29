import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1) {
            return n;
        }
    
        int previous = 0;
        int current = 1;
    
        for (int i = 2; i <= n; i++) {
            int next = (previous + current) % 10;
            previous = current;
            current = next;
        }
    
        return current;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

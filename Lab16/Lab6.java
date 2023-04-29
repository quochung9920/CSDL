import java.util.Scanner;

public class Lab6 {
    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];
        
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (isPrime(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

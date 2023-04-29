import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];
        int n = scanner.nextInt();
        
        // Nhập mảng số nguyên
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // In ra mảng số nguyên đã nhập vào màn hình theo định dạng bình phương
        for (int i = 0; i < n; i++) {
            a[i] = a[i] * a[i];
        }

        // In ra mảng số nguyên
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

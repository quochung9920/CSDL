import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[100];
        int n, k, x;
        // Nhập số phần tử của mảng
        n = scanner.nextInt();

        // Nhập mảng số nguyên
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Nhập vị trí chèn
        k = scanner.nextInt();
        // Nhập số cần chèn
        x = scanner.nextInt();

        // Dời các phần tử từ vị trí k đến cuối mảng
        for (int i = n; i >= k + 1; i--) {
            a[i] = a[i - 1];
        }

        // Gán x vào vị trí k
        a[k] = x;
        // Tăng số phần tử của mảng lên 1
        n++;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


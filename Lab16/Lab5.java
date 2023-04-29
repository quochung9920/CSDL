import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int n, k;

        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử của mảng
        n = sc.nextInt();

        // Nhập mảng số nguyên
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Nhập vị trí xóa
        k = sc.nextInt();
        // Dời các phần tử từ vị trí cuối mảng đến vị trí k
        for (int i = k; i < n; i++) {
            a[i] = a[i+1];
        }
        // Giảm số phần tử của mảng đi 1
        n--;

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}


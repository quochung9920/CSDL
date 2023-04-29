import java.util.Scanner;

public class Lab7 {
    public static void main(String[] args) {
        int[] a = new int[100001];
        int[] b = new int[100001];
        int n;

        Scanner sc = new Scanner(System.in);
        // Nhập số phần tử của mảng
        n = sc.nextInt();

        // Nhập mảng số nguyên
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Tìm phần tử lớn nhất trong mảng
        int max = a[0];
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }

        // Gán giá trị 0 cho mảng b
        for (int i = 0; i <= max; i++) {
            b[i] = 0;
        }

        // Đếm số lần xuất hiện của các phần tử trong mảng a
        for (int i = 0; i < n; i++) {
            b[a[i]] += 1;
        }

        for (int i = 0; i <= max; i++) {
            if (b[i] > 0) {
                System.out.print(i + " - " + b[i] + "; ");
            }
        }
    }
}

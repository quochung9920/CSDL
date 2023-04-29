import java.util.Scanner;

public class Lab9 {
    public static int[] a = new int[100001];
    public static int[] b = new int[100001];
    public static int[] c = new int[100001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m;

        // Nhập số phần tử của mảng a
        n = scanner.nextInt();

        // Nhập mảng số nguyên a
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        // Nhập số phần tử của mảng b
        m = scanner.nextInt();

        // Nhập mảng số nguyên b
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        // Gộp 2 mảng a và b thành mảng c và sắp xếp theo thứ tự tăng dần các phần tử trong mảng c
        int size = 0; 
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                c[size] = a[i];
                size = size + 1;
                i = i + 1;
            } else {
                c[size] = b[j];
                size = size + 1;
                j = j + 1;
            }
        }
        while (i < n) {
            c[size] = a[i];
            size = size + 1;
            i = i + 1;
        }
        while (j < m) {
            c[size] = b[j];
            size = size + 1;
            j = j + 1;
        }

        for (int k = 0; k < size; k++) {
            System.out.print(c[k] + " ");
        }
    }
}

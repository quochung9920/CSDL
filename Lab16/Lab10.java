import java.util.Scanner;

public class Lab10 {
    public static void main(String[] args) {
        int[][] a = new int[100][100];
        int m, n;

        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        // Đọc ma trận từ đầu vào.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        // Tính tổng các phần tử trong ma trận.
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += a[i][j];
            }
        }

        System.out.println(sum);
    }
}


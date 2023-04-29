import java.util.Scanner;

public class Lab8 {
    public static void main(String[] args) {
        int[] a = new int[100001];
        int n;

        Scanner sc = new Scanner(System.in);
        // Nhập số phần tử của mảng
        n = sc.nextInt();
        
        // Nhập mảng số nguyên
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Kiểm tra mảng có tăng dần, giảm dần hay không
        boolean kt1 = true;
        boolean kt2 = true;
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i-1]) kt1 = false;
            if (a[i] >= a[i-1]) kt2 = false;
        }

        if (kt1 || kt2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

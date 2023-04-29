import java.util.*;

public class Ex50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int k = 0;
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            if (check(a[i])) {
                b[k] = a[i];
                k++;
            }
        }
        quickSort(b, 0, k - 1);
        printArray(b, k);
    }

    public static void quickSort(int[] a, int l, int r) {
        int p = a[(l + r) / 2];
        int i = l, j = r;
        while (i < j) {
            while (a[i] < p) {
                i++;
            }
            while (a[j] > p) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (i < r) {
            quickSort(a, i, r);
        }
        if (l < j) {
            quickSort(a, l, j);
        }
    }

    public static void printArray(int[] a, int n) {
        if (n == 0) {
            System.out.print("NULL");
        } else {
            System.out.print(a[0] + " ");
            for (int i = 1; i < n; i++) {
                if (a[i] != a[i - 1]) {
                    System.out.print(a[i] + " ");
                }
            }
        }
    }

    public static boolean check(int n) {
        int k = (int) Math.sqrt(n);
        return k * k == n;
    }

}

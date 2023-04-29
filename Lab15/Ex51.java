import java.util.*;

public class Ex51 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        int[] b = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                b[k] = a[i];
                k++;
            }
        }
        quickSort(b, 0, k - 1);
        k = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] < 0) {
                a[i] = b[k];
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] > 0) {
                a[i] = b[k];
                k++;
            }
        }
        printArray(a, n);
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
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

}

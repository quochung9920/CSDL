import java.util.*;

public class Ex48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = input.nextInt();
        }
        quickSort(a, 0, n - 1);
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                System.out.print(a[i - 1] + " " + count + "; ");
                count = 1;
            }
        }
        System.out.print(a[n - 1] + " " + count + "; ");
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

}

import java.util.Scanner;

public class QuickSort {
    static int n;
    static int[] a;

    static void quickSort(int l, int r) {
        int i = l;
        int j = r;
        int pivot = a[(l + r) / 2];
        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
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
        if (l < j) {
            quickSort(l, j);
        }
        if (i < r) {
            quickSort(i, r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        quickSort(0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
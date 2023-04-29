import java.util.Scanner;
public class Lab2 {

    public static void main(String[] args) {
        int n;
        int a[] = new int[101];

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for (int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
        }
        int Sum = 0;
        for (int i = 0; i < n; i++){
            Sum += a[i];
        }
        System.out.print(Sum);
    }
}

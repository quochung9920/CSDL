import java.util.Scanner;
import java.util.LinkedList;

public class Lab29 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i<n; i++) {
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();
        list.remove(k);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}

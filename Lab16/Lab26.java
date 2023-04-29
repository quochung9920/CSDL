import java.util.Scanner;
import java.util.LinkedList;

public class Lab26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        int k = sc.nextInt();
        int value = list.get(k);
        for (int i = 0; i < n; i++) {
            if (list.get(i) > value) {
                list.remove(i);
                n--;
                i--;
            }
        }
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}

import java.util.Scanner;
import java.util.LinkedList;

public class Lab25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {

            list.add(sc.nextInt());
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == a) {
                list.set(i, b);
            }
        }

        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}

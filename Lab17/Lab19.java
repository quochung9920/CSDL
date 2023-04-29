import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Lab19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> mq = new LinkedList<>();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (!mq.contains(a)) {
                mq.add(a);
            }
        }
        int k = sc.nextInt();
        while (mq.size() > k) {
            mq.poll();
        }
        for (Integer i : mq) {
            System.out.print(i + " ");
        }
    }
}

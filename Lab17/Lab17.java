import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Lab17 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i =0;i<n;i++){
            queue.add(sc.nextInt());
        }
        int k = sc.nextInt();
        for (int i =0;i<k;i++) {
            int x = queue.peek();
            queue.remove();
            queue.add(x);
        }
        for (int item:queue){
            System.out.print(item+" ");
        }
    }
}

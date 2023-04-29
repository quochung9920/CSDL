import java.util.LinkedList;
import java.util.Scanner;

public class Lab22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();     
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }     
        int k = sc.nextInt();
        int x = sc.nextInt();
        list.add(k, x);
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}

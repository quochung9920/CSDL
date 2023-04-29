import java.util.ArrayList;
import java.util.Scanner;


public class Ex13x1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }
        int x = sc.nextInt();
        int l = 0;
        int r = n - 1;
        System.out.println(count(a, l, r, x));
        sc.close();
    }

    public static int count(ArrayList<Integer> a, int l, int r, int x){
        if(l==r){
            if(a.get(l) == x) return 1;
            else return 0;
        }
        else{
            int m = (l+r) / 2;
            return count(a, l, m, x) + count(a, m+1, r, x);
        }
    }
}

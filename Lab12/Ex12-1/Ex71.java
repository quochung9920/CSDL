import java.util.Scanner;

public class Ex71 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Integer n = cin.nextInt(), tmp, min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++) {
            tmp=cin.nextInt();
            if(tmp<min) {min=tmp;}
        }
        cin.close();
        System.out.println(min+n);
    }
}

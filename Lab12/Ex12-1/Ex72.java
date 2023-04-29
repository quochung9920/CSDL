import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex72 {                                                
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Integer n = cin.nextInt(), tmp;
        List<Integer> a = new ArrayList<>();
        for(int i=0; i<n; i++) {
            tmp=cin.nextInt();
            a.add(tmp);
        }
        cin.close();
        Collections.sort(a, Collections.reverseOrder());
        Integer count=1, i=1;
        while(i<a.size()) {
            for(int j=0; j<i; j++) {
                if(a.get(j)<=0) {System.out.println(count); System.exit(0);} 
                a.set(j, a.get(j)-1);
            }
            count++;
            i++; 
        }
        System.out.println(count);
    }
}

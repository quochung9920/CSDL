import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex75 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] a = new int[n];
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i =0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x = sc.nextInt();
        for(int i=n;i>0;i--) {
            solution(a,i,x,list);
        }
        System.out.println(min(list));
    }
    
    public static void solution (int[]a,int n,int x, ArrayList<Integer>list) {
        int sum=0;
        int count=0;
        for (int i =n-1;i>=0;i--) {
            while (sum<x) {
                sum=sum+ a[i];
                    count++;
            }
            if (sum==x) {
                list.add(count);
                sum = 0;
                count=0;
                continue;
            }
            else if(sum>x) {
                sum =sum - a[i];
                count --;
            }
        }
    }
    
    public static int min(ArrayList<Integer> list) {
        Collections.sort(list);
        if(list.size()>0 && list.get(0)==0) {
            return list.get(1);
        }
        else if(list.size()>0 && list.get(0)!=0) {
            return list.get(0);
        }
        return 0;
    }
}
import java.util.*;
public class Lab18{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        Queue<Integer> qll = new LinkedList<>();
        // [2  3  5 7 ] // đầu số supperprime 
        for(int i = 2; i<=n && i < 10; i++){
            if(isPrime(i)){
               qll.add(i);
            }
        }

        // start 2x
        while(!qll.isEmpty()){
            for(int i = 1; i <= 9; i++){
                int k = qll.peek() * 10 + i;
                if( k <= n && isPrime(k)){
                    qll.add(qll.peek() * 10 + i);
                }
            }
            System.out.print(qll.poll() + " ");
        }
    }

    static boolean isPrime(int n){
        if( n < 2) return false;
        for(int i = 2 ; i <= Math.sqrt(n); i ++){
            if(n % i == 0 ) return false;
        }
        return true;
    }
}

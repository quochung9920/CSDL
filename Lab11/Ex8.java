import java.util.Arrays;

public class Ex8 {
    int primeSum(int n) {
        int mod = 22082018;
        if (n < 2) {
            return 0;
        }
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                sum = (sum + i) % mod;
            }
        }
        return sum;
    }
}

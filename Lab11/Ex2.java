public class Ex2 {
    public static int factorSum(int n) {
        int sum = 0;
        while (n > 1) {
            sum = factorSumHelper(n);
            if (sum == n) {
                break;
            }
            n = sum;
        }
        return sum;
    }
    
    private static int factorSumHelper(int n) {
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                sum += i;
                n /= i;
            }
        }
        return sum;
    }
}

public class Ex13 {
    int easyLeo(int n, int m) {
        long[] arr = new long[m];
       arr[0] = 1;
       long sum = 1;
       for (int i = 1; i < m; i++) {
           arr[i] = sum + 1;
           sum += arr[i];
       }
       if (m > 4) {
           for (int i = 4; i < m; i++) {
               arr[i] = (arr[i-1] + arr[i-2] + arr[i-3] + arr[i-4])% 1000000007;
           }
       }
       long result = 1;
       for (int i = 1; i <= n; i++) {
           result = (result*arr[m-1]) % 1000000007;
       }
       return (int) result;
   }
}

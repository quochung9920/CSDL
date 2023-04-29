public class Ex11 {
    static long[] arr = new long[4];

    int fibLikeSq(int n) {
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 2;
        if (n < 3)
            return 1;
        if (n == 3)
            return 2;
        if (n > 3) {
            for (int i = 0; i < n - 3; i++) {
                arr[3] = (arr[2] * arr[1] + arr[0]) % 1000000007;
                arr[0] = arr[1];
                arr[1] = arr[2];
                arr[2] = arr[3];
            }
        }
        return (int) arr[3];
    }
}

public class Ex12 {
    int maximumNonAdj(int[] arr) {
        int n = arr.length;
        int[] f = new int[1000001];
        f[0] = Math.max(arr[0], 0);
        f[1] = Math.max(arr[1], f[0]);
        for (int i = 2; i < n; i++) {
            f[i] = Math.max(arr[i], 0);
            f[i] = Math.max(f[i], f[i - 1]);
            f[i] = Math.max(f[i], f[i - 2] + arr[i]);
            f[i] = Math.max(f[i], f[i - 2]);
        }
        return f[n - 1];
    }
}
